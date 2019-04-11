package com.src.ingtradeapp.repo;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.src.ingtradeapp.model.ProductDetails;
import com.src.ingtradeapp.model.Products;

@Component
public interface ProductDetailsRepository extends CrudRepository<ProductDetails, Serializable>{
	public ProductDetails findByProductId(Long productId);
}
