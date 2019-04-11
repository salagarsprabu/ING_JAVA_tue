package com.src.ingtradeapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.src.ingtradeapp.model.ProductCountDTO;
import com.src.ingtradeapp.services.ProductCountService;

@RestController
@RequestMapping("/count")
public class ProductCountGetController {
	
	@Autowired
	private ProductCountService productCountService;
	 
	@GetMapping("/{id}")
	public List<ProductCountDTO> getCount(@PathVariable long id) {
		return productCountService.getCountValue(id);
	}
	

}
