package com.api2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SwaggerController {
	
	@GetMapping("/")
	public String callSwaggerUI()
	{
		return "redirect:/swagger-ui.html";
	}
}
