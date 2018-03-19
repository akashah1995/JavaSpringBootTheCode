package com.akashah.thecode.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TheCode {
	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	}
	@PostMapping("/guess")
	public String guess(@RequestParam(value = "guess") String guess) {
		String code = "bushido";
		if (code.equals(guess)) { 
			return "redirect:/secret";
		}
		else {
			return "redirect:/";
		}
	}
	@RequestMapping("/secret")
	public String correct() {
			return "secret.jsp";
		}
	
	


}
