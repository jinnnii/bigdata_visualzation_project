package com.kej.security_board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kej.security_board.model.User;
import com.kej.security_board.service.UserService;

@Controller
@RequestMapping("/")
public class HomeController {
	@Autowired
	UserService userService;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
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
	
	@PostMapping("/joinProc")
	@ResponseBody
	public String join(@RequestBody User user){
		if(userService.findByUsername(user.getUsername())!=null) {
			return "fail";
		}
		String rawPassword = user.getPassword();
		String encPassword = bCryptPasswordEncoder.encode(rawPassword);
		user.setPassword(encPassword);
		
		userService.register(user);
		return "success";
	}
	
	
	
//	@PostMapping("join")
//	@ResponseBody
//	public String register(@RequestBody User user) {
//		if(userService.findByUsername(user.getUsername())!=null) {
//			return "failed";
//		}
//		userService.register(user);
//		return "success";
//	}
	
//	@PostMapping("login")
//	@ResponseBody
//	public String login(String username, String password,HttpSession session) {
//		User user = userService.findByUsername(username);
//		if(user!=null) {
//			if(user.getPassword().equals(password)) {
//				session.setAttribute("sUser", user);
//				return "success";
//				
//			}else {
//				return "failed";
//			}
//		}return "no";
//	}
}
