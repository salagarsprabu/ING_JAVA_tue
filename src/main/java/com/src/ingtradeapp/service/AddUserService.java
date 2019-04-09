package com.src.ingtradeapp.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.src.ingtradeapp.exceptions.AddFailException;
import com.src.ingtradeapp.model.Users;
import com.src.ingtradeapp.model.UsersBalance;
import com.src.ingtradeapp.response.JSONResponse;
import com.src.ingtradeapp.respository.AddUserRepo;
import com.src.ingtradeapp.respository.UserBalanceRepo;

@Service
public class AddUserService {
	
	@Autowired
	AddUserRepo userRepo;
	
	@Autowired
	JSONResponse response;
	
	@Autowired
	UserBalanceRepo userBalanceRepo;
	
	public JSONResponse addUser(Users user) throws AddFailException {
		Random random = new Random();
		String acctNumber = String.format("%09d", random.nextInt(1000000000));
		user.setAccountNumber(acctNumber);
		user.setPassword(user.getAccountNumber());
		user.setRole("USER");
		Users savedUser = userRepo.save(user);
		UsersBalance userBalance = new UsersBalance();
		Double defaultBal = new Double("1500");
		userBalance.setBalance(defaultBal);
		userBalance.setAccountNumber(savedUser.getAccountNumber());
		userBalance.setUserId(savedUser.getId());
		userBalanceRepo.save(userBalance);
		response.setMsg("User Created Succesfully with account #"+acctNumber);
		response.setStatus(true);
		response.setAccountNumber(user.getAccountNumber());
		return response;
	}
}
