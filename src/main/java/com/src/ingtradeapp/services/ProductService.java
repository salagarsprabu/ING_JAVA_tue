package com.src.ingtradeapp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.src.ingtradeapp.model.ProductDetails;
import com.src.ingtradeapp.model.Products;
import com.src.ingtradeapp.repo.ProductDetailsRepository;
import com.src.ingtradeapp.repo.ProductRepository;
import com.src.ingtradeapp.response.ProductsResponse;

@Component
public class ProductService {
	
	@Autowired
	ProductRepository productRepo;
	
	@Autowired
	ProductDetailsRepository productDetailRepo;
	
	public List<ProductsResponse> getAllProducts(Long groupId) {
		List<Products> result = productRepo.findAllByGroupId(groupId);
		List<ProductsResponse> response = new ArrayList<>();
		for(Products temp:result) {
			ProductsResponse resp = new ProductsResponse();
			resp.setId(temp.getId());
			resp.setName(temp.getName());
			response.add(resp);
		}
		return response;
	}
	
	public List<ProductsResponse> getAllProductsByLang(Long groupId,String language) {
		List<Products> result = productRepo.findAllByGroupIdAndLanguage(groupId,language);
		List<ProductsResponse> response = new ArrayList<>();
		for(Products temp:result) {
			ProductsResponse resp = new ProductsResponse();
			resp.setId(temp.getId());
			resp.setName(temp.getName());
			response.add(resp);
		}
		return response;
	}
	
	public ProductDetails getProductDetailsById(long id) {
		return productDetailRepo.findByProductId(id);
	}
}