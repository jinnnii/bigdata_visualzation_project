package com.kej.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kej.demo.domain.JpaMember;
import com.kej.demo.service.MemberService;

@Controller
@RequestMapping("/member/")
public class MemberController {
	@Autowired
	private MemberService memberService;
	
	@GetMapping("list")
	public void list(Model model) {
		model.addAttribute("list", memberService.list());
	}
	
	@GetMapping("register")
	public void regForm() {}
	
	@PostMapping("insert")
	public String register(JpaMember jpaMember) {
		memberService.insert(jpaMember);
		return "redirect:list";
	}
	
	@GetMapping	("update")
	public String updateForm(Long id, Model model) {
		model.addAttribute("member", memberService.read(id));
		return "member/update";
	}
	
	@PostMapping("update")
	public String update(JpaMember member) {
		memberService.update(member);
		return "redirect:list";
	}
	
	@GetMapping("delete")
	public String delete(Long id) {
		memberService.delete(id);
		return "redirect:list";
	}
}
