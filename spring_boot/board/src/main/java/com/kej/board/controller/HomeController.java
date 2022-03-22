package com.kej.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
	@GetMapping(value={"","index"})
	public String index() {
		return "index";
	}
	
	
	@GetMapping("join")
	public String joinform() {
		return "member/join";
	}
	
	@GetMapping("login")
	public String loginForm() {
		return "member/login";
	}
}
