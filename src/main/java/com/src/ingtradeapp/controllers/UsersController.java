package com.src.ingtradeapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.src.ingtradeapp.model.Users;
import com.src.ingtradeapp.response.JSONResponse;
import com.src.ingtradeapp.service.UsersService;

@RestController
@RequestMapping("/users")
@CrossOrigin
public class UsersController {

	@Autowired
	JSONResponse response;
	
	@Autowired
	UsersService usersRepository;
	
	@GetMapping("/{account_number}")
	public Users userDetails(@PathVariable("account_number") String accNum) {
		return usersRepository.userDetails(accNum);
	}
	
	
}
