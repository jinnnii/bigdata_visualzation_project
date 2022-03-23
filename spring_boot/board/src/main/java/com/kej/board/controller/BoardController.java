package com.kej.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kej.board.model.Board;
import com.kej.board.model.User;
import com.kej.board.service.BoardService;
import com.kej.board.service.ReplyService;
import com.kej.board.service.UserService;

@Controller
@RequestMapping("/board/")
public class BoardController {
	@Autowired
	private BoardService boardService;
	@Autowired
	private UserService userService;
	@Autowired
	private ReplyService replyService;
	
	@GetMapping("list")
	public void getList(Model model) {
		model.addAttribute("list", boardService.getList());
		model.addAttribute("count", boardService.count());
	}
	
//	@GetMapping({"read","edit"})
//	public void readAndEdit(Long id, Model model) {
//		model.addAttribute("board", boardService.findById(id));
//	}
//	
	@GetMapping("read")
	public void read(Long id, Model model) {
		model.addAttribute("board", boardService.findById(id));
		model.addAttribute("replies", replyService.findByBoard(id));
	}
	@GetMapping("edit")
	public void editForm(Long id, Model model) {
		model.addAttribute("board", boardService.findById(id));
	}
	
	@GetMapping("input")
	public void inputForm() {}
	
	@PostMapping("input")
	public String input(Board board) {
		User user = userService.findByUsername(board.getWriter());
		boardService.register(board,user);
		return "redirect:/board/list";
	}
	
	@PostMapping("edit")
	public String update(Board board) {
		boardService.update(board);
		return "redirect:/board/list";
	}
	
	@GetMapping("delete")
	public String delete(Long id) {
		boardService.delete(id);
		return "redirect:/board/list";
	}
}
