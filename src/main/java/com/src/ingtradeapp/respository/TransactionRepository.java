package com.src.ingtradeapp.respository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.src.ingtradeapp.model.Transactions;

public interface TransactionRepository extends JpaRepository<Transactions, Serializable>{
}
