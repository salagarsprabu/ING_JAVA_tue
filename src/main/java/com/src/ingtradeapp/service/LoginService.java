package com.src.ingtradeapp.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.src.ingtradeapp.model.Users;
import com.src.ingtradeapp.response.LoginResponse;
import com.src.ingtradeapp.respository.LoginRepository;

@Service
public class LoginService {

	@Autowired
	LoginRepository loginRepository;
	
	public 	LoginResponse singup(String name, String password) {
		Users users = new Users();		
		LoginResponse loginResponse = new LoginResponse();
		Random rand = new Random();
 
		users = loginRepository.findByNameAndPassword(name, password);
		if(users != null) {
			loginResponse.setRole(users.getRole());
			loginResponse.setStatu(true);
			loginResponse.setAccountnumber(users.getAccountNumber());
			int randNum = rand.nextInt(100);
			loginResponse.setSessionid(Integer.toString(randNum));
			randNum+=1;
		}else {
			loginResponse.setStatu(false);
		}
		return loginResponse;
	}
}
