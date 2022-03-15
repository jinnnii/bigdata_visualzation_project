package com.kej.webboard.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kej.webboard.domain.SampleVO;

import lombok.extern.java.Log;

@RestController
@RequestMapping("/sample/")
@Log

public class SampleController {
	
	@GetMapping("getMapList")
	public Map<String, SampleVO> getMapList() {
		log.info("getSample");
		Map<String, SampleVO> map = new HashMap<String, SampleVO>();
		map.put("first", new SampleVO(1, "holgit", "hong"));
		map.put("second", new SampleVO(2, "Gilldowng", "go"));
		return map;
	}

	@GetMapping("getSample")
	public SampleVO getSample() {
		log.info("getSample");
		return new SampleVO(1, "hong", "kill");
	}

	@GetMapping("getList")
	public List<SampleVO> getSampleList() {
		List<SampleVO> list = new ArrayList<SampleVO>();
		for (int i = 1; i < 10; i++) {
			log.info("getList");
			list.add(new SampleVO(i, "First" + i, "Last_" + i));
		}
		return list;
	}
	
	@GetMapping(value="check", params= {"height","weight"})
	public ResponseEntity<SampleVO> check(Double height, Double weight){
		SampleVO vo = new SampleVO(1,"aaa","bbb");
		ResponseEntity<SampleVO> result= null;
		if(height<150) {
			result = ResponseEntity.status(HttpStatus.BAD_GATEWAY).body(vo);
		}else {
			result = ResponseEntity.status(HttpStatus.OK).body(vo);
		}
		return result;
	}
}
