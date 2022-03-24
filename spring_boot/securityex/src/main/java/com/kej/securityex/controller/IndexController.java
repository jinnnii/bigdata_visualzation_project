package com.kej.securityex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kej.securityex.model.User;
import com.kej.securityex.repository.UserRepository;


@Controller
public class IndexController {
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping({"/","index"})
	@ResponseBody
	public String index() {
		return "index page";
	}
	
	@GetMapping("/user")
	@ResponseBody
	public String user() {
		return "use page";
	}
	
	@GetMapping("/manager")
	@ResponseBody
	public String manager() {
		return "manager page";
	}
	
	@GetMapping("/admin")
	@ResponseBody
	public String admin() {
		return "admin page";
	}
	
	@GetMapping("/login")
	public void loginForm() {
		
	}
	
	
	
	@GetMapping("/join")
	public void joinForm() {
		
	}
	
	
	@PostMapping("/joinProc")
	public String join(User user){
		String rawPassword = user.getPassword();
		String encPassword = bCryptPasswordEncoder.encode(rawPassword);
		user.setPassword(encPassword);
		user.setRole("ROLE_USER");
		
		userRepository.save(user);
		return "redirect:/";
	}
}
