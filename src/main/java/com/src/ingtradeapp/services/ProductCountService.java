package com.src.ingtradeapp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.src.ingtradeapp.model.ProductCount;
import com.src.ingtradeapp.model.ProductCountDTO;
import com.src.ingtradeapp.model.Products;
import com.src.ingtradeapp.repo.ProductCountRepo;
import com.src.ingtradeapp.repo.ProductRepository;

@Service
@Transactional
public class ProductCountService {
	
	@Autowired
	private ProductCountRepo productCountRepo;
	
	@Autowired
	private ProductRepository productRepository;
	
	public void updateCount(long id) {
		ProductCount productCount=productCountRepo.findOne(id);
		long count=productCount.getCount();
		count++;
		productCount.setCount(count);
		productCountRepo.save(productCount);
	}
	
	public List<ProductCountDTO> getCountValue(long id) {
		List<ProductCountDTO> result = new ArrayList<ProductCountDTO>();
		List<Products> pl = new ArrayList<Products>();
		
		pl = productRepository.findAllByGroupId(id);
		for(Products s : pl) {
			ProductCountDTO p = new ProductCountDTO();
			p.setCount(productCountRepo.findOne(s.getId()).getCount());
			p.setName(s.getName());
			result.add(p);
		}
		return result;
		
	}

}
