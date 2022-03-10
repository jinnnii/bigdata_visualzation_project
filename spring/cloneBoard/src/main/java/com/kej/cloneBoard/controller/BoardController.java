package com.kej.cloneBoard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kej.cloneBoard.domain.BoardVO;
import com.kej.cloneBoard.service.BoardServiceImpl;

@Controller
@RequestMapping("/board/")

public class BoardController {
	@Autowired
	BoardServiceImpl boardService;
	
	@RequestMapping("list")
	public void list(Model model) {
		List<BoardVO> list = boardService.getList();
		model.addAttribute("list",list);
	}
	@RequestMapping("detail")
	public void detail(int bno, Model model) {
		BoardVO vo = boardService.getBoard(bno);
		model.addAttribute("board",vo);
	}
	
	@RequestMapping("updateForm")
	public void updateForm(int bno, Model model) {
		BoardVO vo = boardService.getBoard(bno);
		model.addAttribute("board",vo);
	}
	
	@PostMapping("update")
	public String update(BoardVO vo) {
		boardService.updateBoard(vo);
		return "redirect:list";
	}
	
	@RequestMapping("delete")
	public String delete(int bno) {
		boardService.deleteBoard(bno);
		return "redirect:list";
	}
	
	@RequestMapping("insertForm")
	public void insertForm() {
		
	}
	
	@RequestMapping("insert")
	public String insert(BoardVO vo) {
		boardService.insertBoard(vo);
		return "redirect:list";
	}
	
}