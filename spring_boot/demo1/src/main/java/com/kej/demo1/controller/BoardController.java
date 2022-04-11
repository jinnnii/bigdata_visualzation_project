package com.kej.demo1.controller;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.kej.demo1.domain.BoardVO;
import com.kej.demo1.domain.FileVO;
import com.kej.demo1.service.BoardService;
import com.kej.demo1.service.ReplyService;


@Controller
@RequestMapping("/board/")
public class BoardController {
	@Value("${spring.servlet.multipart.location}")
	String filePath;
	
	@Autowired
	BoardService service;
	@Autowired
	ReplyService reService;
	
	@GetMapping("list")
	public void list(Model model) {
		model.addAttribute("boardList", service.getList());
	}
	
	@GetMapping("detail/{bno}")
	public String detail(@PathVariable("bno") int bno, Model model) {
		model.addAttribute("board", service.read(bno));
		model.addAttribute("replyList", reService.getList(bno));
		return "board/detail";
	}
	
	@GetMapping("register")
	public void registerForm() {
		
	}
	
	@PostMapping("register")
	public String register(BoardVO board, MultipartFile[] uploads, HttpSession session) {
		String today = new SimpleDateFormat("yyMMdd").format(new Date());
		String saveFolder=filePath+File.separator+today; 
		
		File folder = new File(saveFolder);
		
		if(!folder.exists()) {
			folder.mkdir();
		}
		
		List<FileVO> fileList = new ArrayList<FileVO>();
		for (MultipartFile mfile : uploads) {
			String originfile = mfile.getOriginalFilename();
			if(!originfile.isEmpty()) {
				FileVO fvo= new FileVO();
				UUID uuid = UUID.randomUUID();
				String saveFileName = uuid.toString()+"_"+originfile;
				String fileType = mfile.getContentType();
				fileType = fileType.substring(0, fileType.indexOf("/"));
				
				fvo.setFiletype(fileType);
				fvo.setSavefile(saveFileName);
				fvo.setOriginfile(originfile);
				fvo.setSavefolder(today);
				
				try {
					File saveFile = new File(saveFolder,saveFileName);
					mfile.transferTo(saveFile);
					fileList.add(fvo);
				}catch(Exception e) {
					e.printStackTrace();
				}
			}			
		}
		board.setFileList(fileList);
		service.register(board);
		return "redirect:list";
	}
	
	@GetMapping("modify")
	public void modifyForm(int bno, Model model) {
		model.addAttribute("board", service.read(bno));
	}
	
	@PostMapping("modify")
	public String modify(BoardVO board) {
		service.update(board);
		return "redirect:list";
	}
	
	@GetMapping("delete")
	public String delete(int bno) {
		service.delete(bno);
		return "redirect:list";
	}
}
