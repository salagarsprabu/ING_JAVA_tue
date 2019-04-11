package com.src.ingtradeapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.src.ingtradeapp.model.ProductCount;

public interface ProductCountRepo extends JpaRepository<ProductCount, Long> {
	
}
