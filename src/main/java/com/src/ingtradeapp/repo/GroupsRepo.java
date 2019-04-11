package com.src.ingtradeapp.repo;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.src.ingtradeapp.model.ProductGroups;

@Component
public interface GroupsRepo extends CrudRepository<ProductGroups, Serializable>{
	List<ProductGroups> findAll();
	List<ProductGroups> findAllByLanguage(String language);
}
