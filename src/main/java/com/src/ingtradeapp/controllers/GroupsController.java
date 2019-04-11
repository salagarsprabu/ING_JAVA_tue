package com.src.ingtradeapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.src.ingtradeapp.model.ProductGroups;
import com.src.ingtradeapp.response.JSONResponse;
import com.src.ingtradeapp.services.GroupsService;

@RestController
@RequestMapping("/groups")
@CrossOrigin
public class GroupsController {

	@Autowired
	JSONResponse response;
	
	@Autowired
	GroupsService groupsService;
	
	@GetMapping("")
	public List<ProductGroups> getAllGroups() {
		return groupsService.getAllGroups();
	}
}
