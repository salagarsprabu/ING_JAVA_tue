package com.src.ingtradeapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.src.ingtradeapp.services.ProductCountService;

@RestController
@RequestMapping("/update")
public class ProductCountController {
	
	@Autowired
	private ProductCountService productCountService;
	 
	@GetMapping("/{id}")
	public void updateCount(@PathVariable long id) {
		productCountService.updateCount(id);
	}	
	
	

}
