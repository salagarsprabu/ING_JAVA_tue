package com.src.ingtradeapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.src.ingtradeapp.model.Users;
import com.src.ingtradeapp.respository.UsersRepository;

@Service
public class UsersService {

	@Autowired
	UsersRepository  usersRepository;
	
	public Users userDetails(String accNum) {
		return usersRepository.findByAccountNumber(accNum); 
	}
}
