package com.red.code.style.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HealthContoller {

	@GetMapping("/health")
	public Boolean check() {
		System.out.println("good");
		System.out.println("success");
		return Boolean.TRUE;
	}

}
