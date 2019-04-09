package com.src.ingtradeapp.respository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.src.ingtradeapp.model.Users;
@Component
public interface UsersRepository extends JpaRepository<Users, Serializable>{
	
	public Users findAllByAccountNumber(String accNum);

}
