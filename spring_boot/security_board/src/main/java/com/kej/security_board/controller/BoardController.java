package com.kej.security_board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kej.security_board.model.Board;
import com.kej.security_board.model.User;
import com.kej.security_board.service.BoardService;
import com.kej.security_board.service.ReplyService;
import com.kej.security_board.service.UserService;

@Controller
@RequestMapping("/board/")
public class BoardController {
	@Autowired
	private BoardService boardService;
	@Autowired
	private UserService userService;
	@Autowired
	private ReplyService replyService;
	
//	@GetMapping("list")
//	public void getList(Model model) {
//		model.addAttribute("list", boardService.getList());
//		model.addAttribute("count", boardService.count());
//	}
	
	@GetMapping("list")
	public String listPage(Model model,
			@PageableDefault(size=5, sort="id",
				direction=Sort.Direction.DESC) Pageable pageable) {
		Page<Board> list = boardService.findAll(pageable);
		
		long pageSize = pageable.getPageSize();
		long rowNm = boardService.count();
		long totPage =(long)Math.ceil((double)rowNm/pageSize); //반올림
		long curPage = pageable.getPageNumber();
		
		long startPage = (curPage/pageSize)*pageSize;
		long endPage = (startPage+pageSize)-1;
		if(endPage>totPage) {
			endPage=totPage;
		}
		
		boolean prev = startPage>0?true:false;
		boolean next = endPage<totPage?true:false;
		
		model.addAttribute("pageSize", pageSize);
		model.addAttribute("startPage",startPage);
		model.addAttribute("endPage",endPage);
		model.addAttribute("prev",prev);
		model.addAttribute("next",next);
		model.addAttribute("count",rowNm);
		model.addAttribute("list",list);
		model.addAttribute("totPage",totPage);
		model.addAttribute("curPage",curPage);
		
		return "board/list";
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
