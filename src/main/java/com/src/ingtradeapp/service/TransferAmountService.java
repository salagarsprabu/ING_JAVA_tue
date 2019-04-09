package com.src.ingtradeapp.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.src.ingtradeapp.exceptions.AddFailException;
import com.src.ingtradeapp.model.Users;
import com.src.ingtradeapp.response.JSONResponse;
import com.src.ingtradeapp.response.TransferAmountRequest;
import com.src.ingtradeapp.respository.AddUserRepo;

@Service
public class TransferAmountService {
	
	@Autowired
	JSONResponse response;
	
	public JSONResponse transferAmount(TransferAmountRequest transferInfo) {
		return response;
	}
}
