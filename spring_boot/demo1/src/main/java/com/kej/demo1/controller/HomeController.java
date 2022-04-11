package com.kej.demo1.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class HomeController {
	@RequestMapping({"/","home"})
	public String homepage() {
		return "/home";
	}
}
