package com.sarief.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainPage {
	
	@ResponseBody
	@RequestMapping("/")
	public String testMeMethod(){
		return "hello world!";
	}
	
}
