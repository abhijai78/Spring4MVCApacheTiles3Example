package com.websystique.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/spitter")
public class SpitterController {

	@RequestMapping(value = "/loadRegisterForm")
	public String loadRegistrationForm() {
		return "loadRegisterForm";
	}
	
	@RequestMapping(value = ")
	public String loadRegistrationForm2() {
		return "loadRegisterForm1";
	}

	@RequestMapping(value = "/register")
	public String showRegistrationForm() {
		return "registerForm";
	}
			
			@RequestMapping(value = "/register")
	public String showRegistrationForm4() {
		return "registerForm";
	}

}
