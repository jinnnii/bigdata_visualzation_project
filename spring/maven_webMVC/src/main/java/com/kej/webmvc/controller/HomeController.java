package com.kej.webmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kej.webmvc.service.BoardService;

@Controller
public class HomeController {
	@Autowired
	private BoardService boardService;
	
	@RequestMapping({"","/index"})
	public String index() {
		return "root.index";
	}
	
	@RequestMapping("/board/list")
	public String list(Model model) {
		model.addAttribute("list",boardService.getList());
		return "board.list";
	}
	
	@RequestMapping("/board/write")
	public String write() {
		return "board.write";
	}
	
	@RequestMapping("/board/content")
	public String content() {
		return "board.content";
	}
}
