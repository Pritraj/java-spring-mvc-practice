package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	@RequestMapping("/show-form")
	public String showForm() {
		return "show-form";
	}
	 
	@RequestMapping("/submit-form")
	public String submitForm() {
		return "submit-form";
	}
}
