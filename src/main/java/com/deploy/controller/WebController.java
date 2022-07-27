package com.deploy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
	@GetMapping("/")
	public String getMessage() {
		return "Welcome....! Sample Deployment Success";
	}
}
