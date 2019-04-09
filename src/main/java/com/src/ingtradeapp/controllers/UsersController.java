package com.src.ingtradeapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.src.ingtradeapp.model.Users;
import com.src.ingtradeapp.model.UsersBalance;
import com.src.ingtradeapp.response.JSONResponse;
import com.src.ingtradeapp.service.UsersService;

@RestController
@RequestMapping("/users")
@CrossOrigin
public class UsersController {

	@Autowired
	JSONResponse response;
	
	@Autowired
	UsersService usersService;
	
	@GetMapping("/{account_number}")
	public Users userDetails(@PathVariable("account_number") String accNum) {
		return usersService.userDetails(accNum);
	}
	
	@GetMapping("")
	public List<Users> getUsers() {
		return usersService.getUsers();
	}
	
	@GetMapping("/balance/{accountNumber}")
	public UsersBalance getBalance(@PathVariable("accountNumber") String accountNumber) {
		return usersService.getBalance(accountNumber);
	}
	
}
