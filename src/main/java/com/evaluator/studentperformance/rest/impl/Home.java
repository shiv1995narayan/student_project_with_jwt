package com.evaluator.studentperformance.rest.impl;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/home")
public class Home {
	
	@GetMapping("/welcome")
	public String welcome() {
		String text= "this is private page";
		return text;
	}
	
	
	@GetMapping("/getusers")
	public String getUsers() {
		return "Ajaysingh";
	}

}
