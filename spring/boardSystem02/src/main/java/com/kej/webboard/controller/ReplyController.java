package com.kej.webboard.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kej.webboard.domain.ReplyVO;
import com.kej.webboard.service.ReplyService;

import lombok.AllArgsConstructor;
import lombok.extern.java.Log;

@RestController
@RequestMapping("/replies/")
@Log
@AllArgsConstructor //Autowired 가 많을 경우 사용
public class ReplyController {
	//@Autowired
	private ReplyService service;
	
	@PostMapping(value="new", consumes="application/json")
	public ResponseEntity<String> create(@RequestBody ReplyVO vo){
		log.info("ReplyVO..............."+vo);
		boolean isInsert = service.register(vo);
		log.info("Reply insert count: "+isInsert);
		return isInsert ? new ResponseEntity<String>("success", HttpStatus.OK)
				: new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@GetMapping("getList/{bno}")
	public ResponseEntity<List<ReplyVO>> getList(@PathVariable("bno") int bno){
		log.info("getList...........");
		return new ResponseEntity<List<ReplyVO>>(service.getList(bno), HttpStatus.OK);
	}
	
	@GetMapping("/{rno}")
	public ResponseEntity<ReplyVO> get(@PathVariable("rno") int rno){
		log.info("get : "+rno);
		return new ResponseEntity<ReplyVO>(service.read(rno), HttpStatus.OK);
	}
	
	@DeleteMapping("/{rno}")
	public ResponseEntity<String> remove(@PathVariable("rno") int rno){
		log.info("remove : "+rno);
		return service.remove(rno)
				? new ResponseEntity<String>("success", HttpStatus.OK)
				: new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@PutMapping("/{rno}")
	public ResponseEntity<String> modify(@RequestBody ReplyVO vo, 
			@PathVariable("rno") int rno){
		vo.setRno(rno);
		log.info("rno:"+rno);
		log.info("modify:"+vo);
		return service.modify(vo)
				? new ResponseEntity<String>("success", HttpStatus.OK)
				: new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
