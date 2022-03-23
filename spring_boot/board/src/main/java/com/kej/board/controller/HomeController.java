package com.kej.board.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kej.board.model.User;
import com.kej.board.service.UserService;

@Controller
@RequestMapping("/")
public class HomeController {
	@Autowired
	UserService userService;
	
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
	
	@PostMapping("join")
	@ResponseBody
	public String register(@RequestBody User user) {
		if(userService.findByUsername(user.getUsername())!=null) {
			return "failed";
		}
		userService.register(user);
		return "success";
	}
	
	@PostMapping("login")
	@ResponseBody
	public String login(String username, String password,HttpSession session) {
		User user = userService.findByUsername(username);
		if(user!=null) {
			if(user.getPassword().equals(password)) {
				session.setAttribute("sUser", user);
				return "success";
				
			}else {
				return "failed";
			}
		}return "no";
	}
}
