package com.kej.board.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kej.board.model.Board;
import com.kej.board.model.Reply;
import com.kej.board.model.User;
import com.kej.board.service.BoardService;
import com.kej.board.service.UserService;

@RestController
@RequestMapping("/replies/")
public class ReplyController {
	@Autowired
	private BoardService boardService;
	
	@Autowired
	private UserService userService;
	
	@PostMapping("new/{bno}")
	public ResponseEntity<String> replyInsert(@PathVariable Long bno,
			@RequestBody Reply reply){
	
		Board b = new Board();
		b.setId(bno);
		reply.setBoard(b);
		
		User user = userService.findByUsername(reply.getWriter());
		reply.setUser(user);
		
		reply.setRegdate(new Date());
		
		boardService.insertReply(reply);
		
		return new ResponseEntity<String>("success",HttpStatus.OK);
	}
	
	@GetMapping("getList/{bno}")
	public List<Reply> list(@PathVariable Long bno){
		List<Reply> rlist = boardService.replies(bno);
		return rlist;
	}
	
	@DeleteMapping("/{id}")
	public Long delete(@PathVariable Long id) {
		boardService.deleteReply(id);
		return id;
	}
}
