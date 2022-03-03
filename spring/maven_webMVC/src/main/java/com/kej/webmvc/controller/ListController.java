package com.kej.webmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.kej.webmvc.service.BoardService;
public class ListController implements Controller{
//	@org.springframework.stereotype.Controller
//	@Autowired
	BoardService boardService;
	
	public void setBoardService(BoardService boardService) {
		this.boardService = boardService;
	}

	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.addObject("list",boardService.getList());
		mv.setViewName("board.list");
		return mv;
//		return new ModelAndView("board/list");
//		return new ModelAndView("board.list");
	}

}
