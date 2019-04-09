package com.src.ingtradeapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.src.ingtradeapp.model.Users;
import com.src.ingtradeapp.response.LoginResponse;
import com.src.ingtradeapp.service.LoginService;

@RestController
@RequestMapping("/login")
@CrossOrigin
public class LoginController {
	
	@Autowired
	LoginService loginService;

	@PostMapping("")
	public 	LoginResponse singup(@RequestBody Users user) {
		return loginService.singup(user.getName(),user.getPassword());
	}
}
