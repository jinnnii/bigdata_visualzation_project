package com.kej.boardsystem01.controller;

import java.util.List;

import org.junit.runner.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kej.boardsystem01.domain.BoardVO;
import com.kej.boardsystem01.service.BoardServiceImpl;

@Controller
@RequestMapping("/board/")
public class BoardController {
	@Autowired
	BoardServiceImpl boardServiceImpl;
	
	@RequestMapping("list")
	public void list(Model model) {
		List<BoardVO> list = boardServiceImpl.getList();
		int count = boardServiceImpl.boardCount();
		model.addAttribute("count",count);
		model.addAttribute("list",list);
	}
	
	@RequestMapping("read")
	public void read(@RequestParam("bno") int bno, Model model) {
		BoardVO board = boardServiceImpl.read(bno);
		model.addAttribute("board",board);
	}
	
	
	@RequestMapping("input")
	public void input() {
	}
	
	@RequestMapping("insert")
	public String input(BoardVO board) {
		boardServiceImpl.Insert(board);
		return "redirect:list";
	}
	
	@RequestMapping("edit")
	public void edit(int bno, Model model) {
		BoardVO board = boardServiceImpl.read(bno);
		model.addAttribute("board",board);
	}
	
	@RequestMapping("update")
	public String update(BoardVO board) {
		boardServiceImpl.update(board);
		return "redirect:read?bno="+board.getBno();
	}
	
	@RequestMapping("delete")
	public String delete(int bno) {
		boardServiceImpl.delete(bno);
		return "redirect:list";
	}
	
}
