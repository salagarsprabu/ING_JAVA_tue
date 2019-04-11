package com.src.ingtradeapp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.src.ingtradeapp.model.Products;
import com.src.ingtradeapp.repo.ProductRepository;
import com.src.ingtradeapp.response.ProductsResponse;

@Component
public class ProductService {
	
	@Autowired
	ProductRepository productRepo;
	
	public List<ProductsResponse> getAllProducts(Long groupId) {
		List<Products> result = productRepo.findAllByGroupId(groupId);
		List<ProductsResponse> response = new ArrayList<>();
		for(Products temp:result) {
			ProductsResponse resp = new ProductsResponse();
			resp.setId(temp.getId());
			resp.setName(temp.getName());
			response.add(resp);
		};
		return response;
	}
}
