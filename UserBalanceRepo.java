package com.src.ingtradeapp.respository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.src.ingtradeapp.model.Branchs;
import com.src.ingtradeapp.model.UsersBalance;
@Component
public interface UserBalanceRepo extends JpaRepository<UsersBalance, Serializable>{
	public UsersBalance findByUserId(Long id);
}
