package com.src.ingtradeapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.src.ingtradeapp.model.ProductGroups;
import com.src.ingtradeapp.repo.GroupsRepo;

@Component
public class GroupsService {
	
	@Autowired
	GroupsRepo groupsRepo;
	
	public List<ProductGroups> getAllGroups() {
		return groupsRepo.findAll();
	}
}
