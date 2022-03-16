package com.kej.webboard.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.kej.webboard.domain.BoardVO;
import com.kej.webboard.domain.FileVO;
import com.kej.webboard.domain.PageVO;
import com.kej.webboard.service.BoardServiceImpl;

import lombok.extern.java.Log;

@Log
@Controller
@RequestMapping("/board/")
public class BoardController {
	@Autowired
	BoardServiceImpl boardServiceImpl;

	@RequestMapping("list")
	public void list(Model model, String pageNum, 
			@RequestParam(name = "field", defaultValue = "") String field,
			@RequestParam(name = "word", defaultValue = "") String word) {
		int currentPage = pageNum == null ? 1 : Integer.parseInt(pageNum);
		int pagesize = 5;
		HashMap<String, Object> hm = new HashMap<String, Object>();
		hm.put("field", field);
		hm.put("word", word);
		hm.put("pageStart", (currentPage - 1) * pagesize);
		hm.put("pageSize", pagesize);
		
		List<BoardVO> list = boardServiceImpl.findAll(hm);
		int count = boardServiceImpl.boardCount(hm);
		PageVO page = new PageVO(count, currentPage, pagesize);

		model.addAttribute("count", count);
		model.addAttribute("list", list);
		model.addAttribute("p", page);
		model.addAttribute("field",field);
		model.addAttribute("word",word);
	}

	@RequestMapping("read")
	public void read(@RequestParam("bno") int bno,
			@RequestParam("pageNum") String pageNum, 
			@RequestParam(name="field", defaultValue="") String field,
			@RequestParam(name="word", defaultValue="") String word,
			Model model) {
		BoardVO board = boardServiceImpl.read(bno);
		
		model.addAttribute("pageNum",pageNum);
		model.addAttribute("field",field);
		model.addAttribute("word",word);
		model.addAttribute("board", board);
	}

	@RequestMapping("input")
	public void input() {
	}

//	@RequestMapping("insert")
//	public String input(BoardVO board) {
//		boardServiceImpl.Insert(board);
//		return "redirect:list";
//	}

	@RequestMapping("insert")
	public String register(BoardVO bvo, MultipartFile[] uploads, HttpSession session) {
		String uploadFolder = session.getServletContext().getRealPath("/resources/upload");
//		Spring folder="C:/aaa/bbb";
		String today=new SimpleDateFormat("yyMMdd").format(new Date());
		String saveFolder=uploadFolder+File.separator+today;
		
		System.out.println(saveFolder);
		File folder = new File(saveFolder);
		
		if(!folder.exists()) {
			folder.mkdirs();
		}
		List<FileVO> fileList = new ArrayList<FileVO>();
		for (MultipartFile multipartFile : uploads) {
			String originFile = multipartFile.getOriginalFilename();
			if(!originFile.isEmpty()) {
				FileVO fvo = new FileVO();
				UUID uuid = UUID.randomUUID();
				String saveFileName = uuid.toString()+"_"+originFile;
				String fileType = multipartFile.getContentType();
				fileType=fileType.substring(0,fileType.indexOf("/"));
				fvo.setFiletype(fileType);
				fvo.setOriginfile(originFile);
				fvo.setSavefile(saveFileName);
				fvo.setSavefolder(today);
				
				try {
					File saveFile=new File(saveFolder,saveFileName);
					multipartFile.transferTo(saveFile);
					fileList.add(fvo);
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		bvo.setFileList(fileList);
		boardServiceImpl.Insert(bvo);
		
		return "redirect:list";
	}
	
	@RequestMapping("edit")
	public void edit(int bno, Model model) {
		BoardVO board = boardServiceImpl.read(bno);
		model.addAttribute("board", board);
	}

	@RequestMapping("update")
	public String update(BoardVO vo, MultipartFile[] uploads, HttpSession session) {
		String uploadFolder = session.getServletContext().getRealPath("/resources/upload");
		String today=new SimpleDateFormat("yyMMdd").format(new Date());
		String saveFolder=uploadFolder+File.separator+today;

		List<FileVO> fileList = new ArrayList<FileVO>();
		for (MultipartFile multipartFile : uploads) {
			String originFile = multipartFile.getOriginalFilename();
			if(!originFile.isEmpty()) {
				FileVO fvo = new FileVO();
				UUID uuid = UUID.randomUUID();
				String saveFileName = uuid.toString()+"_"+originFile;
				String fileType = multipartFile.getContentType();
				fileType=fileType.substring(0,fileType.indexOf("/"));
				fvo.setFiletype(fileType);
				fvo.setOriginfile(originFile);
				fvo.setSavefile(saveFileName);
				fvo.setSavefolder(today);
				
				try {
					File saveFile=new File(saveFolder,saveFileName);
					multipartFile.transferTo(saveFile);
					fileList.add(fvo);
				}catch(Exception e) {
					e.printStackTrace();
				}
			}else {
				BoardVO vo1 = boardServiceImpl.read(vo.getBno());
				vo.setFileList(vo1.getFileList());
			}
		}
		boardServiceImpl.update(vo);
		return "redirect:read?bno=" + vo.getBno();
	}

	@RequestMapping("delete")
	public String delete(int bno) {
		boardServiceImpl.delete(bno);
		return "redirect:list";
	}

	@GetMapping("download/{fno}")
	public String download(@PathVariable("fno") int fno,
			HttpSession session,
			HttpServletResponse res, HttpServletRequest req) {
		FileVO fvo = boardServiceImpl.getFile(fno);
		log.info("-========"+ fvo);
		
		String fileName = null;
		
		try {
			String path = session.getServletContext()
					.getRealPath("/resources/upload/"+fvo.getSavefolder());
			File file = new File(path, fvo.getSavefile());
			//파일 그대로는 못들오기 때문에, 인풋스트림으로 가져옴
			BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));
			
			String header = req.getHeader("User-Agent");
			
			//브라우저별로 파일 이름 인코딩 방법을 달리 해야함
			//인터넷 익스플로러 10이하 버전, 11버전, 엣지에서 인코딩
			if(header.contains("MSIE") || header.contains("Trident")
					|| header.contains("Edge")) {
				fileName = URLEncoder.encode(fvo.getOriginfile(),"UTF-8");
			}else {
				fileName = new String(fvo.getOriginfile().getBytes("UTF-8"),"iso-8859-1");
			}
			log.info(fileName);
			res.setContentType("application/octet-stream");
			//다운로드와 다운로드될 파일 이름
			res.setHeader("Content-Disposition", "attachment;filename=\""+fileName+"\"");
			//파일 복사
			FileCopyUtils.copy(in, res.getOutputStream());
			in.close();
			res.getOutputStream().flush();
			res.getOutputStream().close();
			
		} catch(Exception e) {
			e.printStackTrace();
			return "fail";
		}
		return "aaa";
	}

}
