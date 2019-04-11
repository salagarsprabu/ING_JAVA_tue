package com.src.ingtradeapp.repo;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.src.ingtradeapp.model.Products;

@Component
public interface ProductRepository extends CrudRepository<Products, Serializable>{
	List<Products> findAllByGroupId(Long groupId);
}
