package com.kej.webboard.controller;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.kej.webboard.domain.BoardVO;
import com.kej.webboard.domain.FileVO;
import com.kej.webboard.domain.PageVO;
import com.kej.webboard.service.BoardServiceImpl;

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
				fvo.setSavefolder(saveFolder);
				
				try {
					File saveFile=new File(saveFolder,saveFileName);
					multipartFile.transferTo(saveFile);
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			
//			bvo.set/////////////////////////
		}
		return null;
	}
	
	@RequestMapping("edit")
	public void edit(int bno, Model model) {
		BoardVO board = boardServiceImpl.read(bno);
		model.addAttribute("board", board);
	}

	@RequestMapping("update")
	public String update(BoardVO board) {
		boardServiceImpl.update(board);
		return "redirect:read?bno=" + board.getBno();
	}

	@RequestMapping("delete")
	public String delete(int bno) {
		boardServiceImpl.delete(bno);
		return "redirect:list";
	}

}
