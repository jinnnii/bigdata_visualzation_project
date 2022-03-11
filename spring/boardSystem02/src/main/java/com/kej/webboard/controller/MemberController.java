package com.kej.webboard.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kej.webboard.domain.MemberVO;
import com.kej.webboard.service.MemberService;

@Controller
@RequestMapping("/member/")
public class MemberController {
	@Autowired
	private MemberService memberService;
	
	@GetMapping("join")
	public void join() {
		
	}
	
	@PostMapping("join")
	@ResponseBody
	public String join(@RequestBody MemberVO member) {
		int cnt= memberService.idCheck(member.getId());
		if(cnt!=0) {
			return "fail";
		}
		memberService.join(member);
		return "success";
	}
	
	@GetMapping("login")
	public void login() {
		
	}
	
	@PostMapping("login")
	@ResponseBody
	public String login(String id, String pass, HttpSession session) {
		MemberVO member = memberService.loginCheck(id);
		String result="no"; 
		if(member!=null) {
			if(member.getPass().equals(pass)) {
				session.setAttribute("sMember", member);
				result="success";
			}else {
				result="passFailed";
			}
		}
		return result;
	}
	
	@GetMapping("logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/board/list";
	}
	
	@PostMapping("idCheck")
	@ResponseBody
	public String idCheck(String id) {
		int cnt = memberService.idCheck(id);
		if(cnt!=0) {
			return "unavailable";
		}else {
			return "available";
		}
	}
}
