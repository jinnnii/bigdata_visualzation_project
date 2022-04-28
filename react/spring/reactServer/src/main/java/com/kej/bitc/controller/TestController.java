package com.kej.bitc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kej.bitc.dto.BoardDto;
import com.kej.bitc.service.BoardService;

//@CrossOrigin(origins="http://localhost:3000")
@Controller
public class TestController {
	
	@Autowired
	private BoardService boardService;

	@RequestMapping("/")
	public String index() throws Exception {
		return "index";
	}
	
	@ResponseBody
	@GetMapping("/ajax/test")
	public Object ajaxTest(@RequestParam("data") String data) {
		System.out.println("서버로 전송된 데이터 : "+data);
		return data;
	}
	
	@ResponseBody
	@GetMapping("/ajax/boardList")
	public Object ajaxBoardList() throws Exception{
		List<BoardDto> dataList = boardService.selectBoardList();
		return dataList;
	}
	
	@ResponseBody
	@PostMapping("/ajax/insertBoard")
	public String ajaxInsertBoard(@RequestParam("title") String title, 
			@RequestParam("content") String content,
			@RequestParam("writer") String writer) {
		boardService.insertBoard(title, content, writer, writer);
		return title+" "+content+" "+writer;
	}
	
}
