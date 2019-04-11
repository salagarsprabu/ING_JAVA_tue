package com.src.ingtradeapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.src.ingtradeapp.controllers.GroupsController;
import com.src.ingtradeapp.controllers.ProductController;
import com.src.ingtradeapp.controllers.StocksController;
import com.src.ingtradeapp.model.ProductGroups;
import com.src.ingtradeapp.repo.GroupsRepo;
import com.src.ingtradeapp.repo.ProductRepository;

@Component
public class GroupsService {
	
	@Autowired
	GroupsRepo groupsRepo;
	
	@Autowired
	GroupsController groupController;
	
	@Autowired
	ProductController productController;
	
	@Autowired
	ProductController productDetailController;
	
	@Autowired
	StocksController stocksController;
	
	
	@Autowired
	ProductRepository productRepo;
	
	public List<ProductGroups> getAllGroups() {
		List<ProductGroups> result = groupsRepo.findAll();
		for(ProductGroups currentGroup : result) {
			int count = productRepo.findAllByGroupId(currentGroup.getId()).size();
			currentGroup.setCount(count);
		}
		return result;
	}
	
	public List<ProductGroups> getAllGroupsByLang(String language) {
		List<ProductGroups> result = groupsRepo.findAllByLanguage(language);
		for(ProductGroups currentGroup : result) {
			int count = productRepo.findAllByGroupId(currentGroup.getId()).size();
			currentGroup.setCount(count);
		}
		return result;
	}
}
