package com.src.ingtradeapp.respository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.src.ingtradeapp.model.Branchs;
@Component
public interface BranchsRepository extends JpaRepository<Branchs, Serializable>{
	
	
	public List<Branchs> findAll();

}
