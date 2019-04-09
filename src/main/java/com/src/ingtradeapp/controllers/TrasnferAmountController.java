package com.src.ingtradeapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.src.ingtradeapp.exceptions.AddFailException;
import com.src.ingtradeapp.response.JSONResponse;
import com.src.ingtradeapp.response.TransferAmountRequest;
import com.src.ingtradeapp.service.TransferAmountService;

@RestController
@RequestMapping("/transfer")
@CrossOrigin
public class TrasnferAmountController {

	@Autowired
	JSONResponse response;
	
	@Autowired
	TransferAmountService transferService;
	
	@PostMapping("")
	public JSONResponse transferAmount(@RequestBody TransferAmountRequest transferInfo) throws AddFailException {
		return transferService.transferAmount(transferInfo);
	
	}
}
