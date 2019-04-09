package com.src.ingtradeapp.respository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.src.ingtradeapp.model.Users;

public interface LoginRepository extends JpaRepository<Users, Serializable>{
	
	public Users findByNameAndPassword(String name, String password);

}
