package com.src.ingtradeapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.src.ingtradeapp.response.LoginResponse;
import com.src.ingtradeapp.service.LoginService;

@RestController
@RequestMapping("/loginsecure")
public class LoginController {
	
	@Autowired
	LoginService loginService;

	@GetMapping("")
	public 	LoginResponse singup(@RequestParam String name, @RequestParam String password) {
		return loginService.singup(name, password);
		
	}
}
