package com.kej.demo1.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kej.demo1.domain.BoardVO;
import com.kej.demo1.service.BoardService;

@Controller
@RequestMapping("/board/")
public class BoardController {
	@Autowired
	BoardService service;
	
	@GetMapping("list")
	public void list(Model model) {
		model.addAttribute("boardList", service.getList());
	}
	
	@GetMapping("detail/{bno}")
	public String detail(@PathVariable("bno") int bno, Model model) {
		model.addAttribute("board", service.read(bno));
		return "board/detail";
	}
	
	@GetMapping("register")
	public void registerForm() {
		
	}
	
	@PostMapping("register")
	public String register(BoardVO board) {
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
