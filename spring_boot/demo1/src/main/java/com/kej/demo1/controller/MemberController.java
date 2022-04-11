package com.kej.demo1.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kej.demo1.domain.MemberVO;
import com.kej.demo1.service.MemberService;

@Controller
@RequestMapping("/member/")
public class MemberController {
	@Autowired
	MemberService service;
	
	@GetMapping("join")
	public void joinForm() {
		
	}
	
	@PostMapping("join")
	public String join(MemberVO member) {
		service.join(member);
		return "../";
	}
	
	@GetMapping("login")
	public void loginForm() {}
	
	@PostMapping("login")
	@ResponseBody
	public String login(String id, String pass ,HttpSession session) {
		MemberVO member = service.loginCheck(id);
		if(member!=null) {
			if(pass.equals(member.getPass())) {
				session.setAttribute("smember", member);
				return "success";
			}
			return "nopass";
		}
		else {
			return "failed";
		}
	}
	@GetMapping("logout")
	public String logout(String id, HttpSession session) {
		session.invalidate();
		return "home";
	}
}
