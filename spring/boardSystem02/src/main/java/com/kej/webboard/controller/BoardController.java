package com.kej.webboard.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kej.webboard.domain.BoardVO;
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

	@RequestMapping("insert")
	public String input(BoardVO board) {
		boardServiceImpl.Insert(board);
		return "redirect:list";
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
