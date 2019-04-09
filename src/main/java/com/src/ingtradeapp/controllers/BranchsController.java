package com.src.ingtradeapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.src.ingtradeapp.model.Branchs;
import com.src.ingtradeapp.service.BranchsService;

@RestController
@RequestMapping("/branchs")
public class BranchsController {
	
	@Autowired
	BranchsService branchService;
	@GetMapping("")
	public List<Branchs> getAllBranchs() {
		return branchService.getBranchs();
	}
	

}
