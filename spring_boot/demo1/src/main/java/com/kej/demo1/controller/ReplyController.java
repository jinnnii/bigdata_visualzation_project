package com.kej.demo1.controller;

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

import com.kej.demo1.domain.ReplyVO;
import com.kej.demo1.service.ReplyService;

@RestController
@RequestMapping("/reply/")
public class ReplyController {
	@Autowired
	ReplyService service;
	
	@GetMapping("getList/{bno}")
	public ResponseEntity<List<ReplyVO>> getList(@PathVariable("bno") int bno){
			return new ResponseEntity<List<ReplyVO>>(service.getList(bno),HttpStatus.OK);
	}
	
	@PostMapping(value="new", consumes="application/json")
	public ResponseEntity<String> register(@RequestBody ReplyVO vo){
		return service.register(vo)
				? new ResponseEntity<String>("success",HttpStatus.OK)
				: new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	@DeleteMapping("/{rno}")
	public ResponseEntity<String> delete(@PathVariable("rno") int rno){
		return service.delete(rno)
				? new ResponseEntity<String>("success",HttpStatus.OK)
				: new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@GetMapping("/{rno}")
	public ResponseEntity<ReplyVO> get(@PathVariable("rno") int rno){
		return new ResponseEntity<ReplyVO>(service.read(rno), HttpStatus.OK);
	}
	
	
}
