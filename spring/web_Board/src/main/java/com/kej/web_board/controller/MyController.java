package com.kej.web_board.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.kej.web_board.Member;

@Controller
// mapping ../board/list url
//@RequestMapping("/board/") //<--get, post 모두 수용
public class MyController  {
//	@RequestMapping("list")
//	public String list() {
//		return "list";
//	}
//	
	@RequestMapping("list")
	public void list() {
		
	}
	
//	@RequestMapping("list")
//	public void list(String name, String pw, Model model) {
//		model.addAttribute("name",name);
//		model.addAttribute("pw",pw);
//		System.out.println(name);
//		System.out.println(pw);
//	}
	
	//1. get 방식으로 데이터 가져오기
//	@RequestMapping(value="list", method=RequestMethod.GET) <-older
//	@GetMapping("list")
	
	//2. post 방식으로 데이터 가져오기
//	@RequestMapping(value="list", method=RequestMethod.POST)<-older
//	@PostMapping("list")
//	public void list(String name, String pw, Model model) {
//		model.addAttribute("name",name);
//		model.addAttribute("pw",pw);
//		System.out.println(name);
//		System.out.println(pw);
//	}
//	
	// http://.../list1?n=aaa&p=1234
//	@RequestMapping("list1")
//	public String list1(@RequestParam("n") String name, @RequestParam("p") String pw,
//			Model model) {
//		model.addAttribute("name",name);
//		model.addAttribute("pw",pw);
//		return "list";
//	}
	
	
	// http://.../list1/aaa
	@RequestMapping("list1/{n}")
	public String list1(@PathVariable("n") String name,Model model) {
		model.addAttribute("name",name);
		return "list";
	}
	
	@GetMapping("input")
	public String inputForm() {
		return "board/input";
	}
	
//	@PostMapping("insert")
//	public String insert(HttpServletRequest request,Model model) {
//		String id = request.getParameter("id");
//		String pw = request.getParameter("pw");
//		String phone = request.getParameter("phone");
//		
//		model.addAttribute("id", id);
//		model.addAttribute("pw", pw);
//		model.addAttribute("phone", phone);
//		
//		return "board/content";
//	}
	
//	@PostMapping("insert")
//	public String insert(Member member) {
//		//model.addAttribute("member", model) 생략 가능, 다른 이름을 쓰고 싶은 경우에만
//		return "board/content";
//	}
	
//	@PostMapping("insert")
//	//컨트롤러에서 메서드의 파라미터는 기본 자료형을 제외한 객체형 타입은 다시 화면으로 전달한다.
//	//명시적으로 화면에 전달되도록 지정<!!!!?
//	//해당 이름으로 화면에 전달?
//	public String insert(@ModelAttribute("mem")Member mem) {
//		return "board/content";
//	}
	
	@PostMapping("insert")
	//컨트롤러에서 메서드의 파라미터는 기본 자료형을 제외한 객체형 타입은 다시 화면으로 전달한다.
	//명시적으로 화면에 전달되도록 지정<!!!!?
	//해당 이름으로 화면에 전달?
	public String insert(@ModelAttribute("mem")Member mem, RedirectAttributes rttr) {
		if(mem.getId().equals("aaa") && mem.getPw().equals("1234")) {
			return "board/content";
		}
		else {
			rttr.addFlashAttribute("msg","아이디 패스워드 틀림");
			return "redirect:input";
		}
	}
	//json 파일로 출력
	@GetMapping("res")
	public @ResponseBody Member getMember() {
		Member member = new Member("aaa","1234","01044444444");
		return member;
	}
	
	//ResponseBody : 뷰가아닌, 값을 브라우저 바디에 리턴하는것
	@GetMapping("res2")
	public @ResponseBody List<Member> getList(){
		List<Member> memberList = new ArrayList<Member>();
		memberList.add(new Member("aaa","111","010-1111"));
		memberList.add(new Member("bbb","222","010-1111"));
		memberList.add(new Member("ccc","333","010-1111"));
		memberList.add(new Member("ddd","444","010-1111"));
		return memberList;
	}
	@GetMapping("res3")
	public ResponseEntity<Member> getEntity(){
		Member member = new Member("aaa","1234","01044444444");
		HttpHeaders header = new HttpHeaders();
		header.add("Content-Type","application/json; charset=UTF-8");
		return new ResponseEntity<Member>(member,header,HttpStatus.OK);
	}
}
