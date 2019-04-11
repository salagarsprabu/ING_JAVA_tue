package com.src.ingtradeapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.src.ingtradeapp.response.JSONResponse;
import com.src.ingtradeapp.response.ProductsResponse;
import com.src.ingtradeapp.services.ProductService;

@RestController
@RequestMapping("/products")
@CrossOrigin
public class ProductController {

	@Autowired
	JSONResponse response;
	
	@Autowired
	ProductService productService;
	
	@GetMapping("{group_id}")
	public List<ProductsResponse> getProducts(@PathVariable("group_id") Long groupId) {
		return productService.getAllProducts(groupId);
	}
	
	
	@GetMapping("{group_id}/{language}")
	public List<ProductsResponse> getProductsByLang(@PathVariable("group_id") Long groupId,@PathVariable("group_id") String language) {
		return productService.getAllProductsByLang(groupId,language);
	}
}
