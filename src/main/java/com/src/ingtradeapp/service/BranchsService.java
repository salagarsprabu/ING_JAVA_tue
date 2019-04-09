package com.src.ingtradeapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.src.ingtradeapp.model.Branchs;
import com.src.ingtradeapp.respository.BranchsRepository;

@Service
public class BranchsService {

	@Autowired
	BranchsRepository branchsRepository;
	
	public 	List<Branchs> getBranchs() {
		return branchsRepository.findAll();
	}
}
