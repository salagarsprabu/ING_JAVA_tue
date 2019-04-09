package com.src.ingtradeapp.service;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.src.ingtradeapp.model.Transactions;
import com.src.ingtradeapp.model.Users;
import com.src.ingtradeapp.model.UsersBalance;
import com.src.ingtradeapp.response.JSONResponse;
import com.src.ingtradeapp.response.TransferAmountRequest;
import com.src.ingtradeapp.respository.TransactionRepository;
import com.src.ingtradeapp.respository.UserBalanceRepo;
import com.src.ingtradeapp.respository.UsersRepository;

@Service
@Transactional
public class TransferAmountService {
	
	@Autowired
	JSONResponse response;
	
	@Autowired
	UserBalanceRepo userBalRepo;
	
	@Autowired
	UsersRepository userRepo;
	
	@Autowired
	TransactionRepository txnRepo;
	
	@Autowired
	EntityManager em;
	
	public JSONResponse transferAmount(TransferAmountRequest transferInfo) {
		Users srcUser = userRepo.findByAccountNumber(transferInfo.getSrcAcct());
		Users dstUser = userRepo.findByAccountNumber(transferInfo.getDestAcct());
		UsersBalance srcBalance = userBalRepo.findByUserId(srcUser.getId());
		UsersBalance destBalance = userBalRepo.findByUserId(dstUser.getId());
		if(srcBalance.getBalance()-transferInfo.getTransferAmount()<0) {
			response.setMsg("User Should have Minimum Balance more than Transfer Balance");
			response.setStatus(false);
		}
		else {
			Double src_bal = srcBalance.getBalance() - transferInfo.getTransferAmount();
			Double dst_bal = destBalance.getBalance() +transferInfo.getTransferAmount();
			destBalance.setBalance(destBalance.getBalance()+transferInfo.getTransferAmount());
			Query srcquery = em.createQuery("UPDATE UsersBalance SET balance = :srcBalance WHERE  user_id = :p");
			srcquery.setParameter("srcBalance", src_bal);
			srcquery.setParameter("p", srcBalance.getUserId());
			srcquery.executeUpdate();
			
			Query dstquery = em.createQuery("UPDATE UsersBalance SET balance = :destBalance WHERE  user_id = :p");
			dstquery.setParameter("destBalance", dst_bal);
			dstquery.setParameter("p", destBalance.getUserId());
			dstquery.executeUpdate();
			
			Transactions transaction = new Transactions();
			transaction.setDestAccountNumber(transferInfo.getDestAcct());
			transaction.setSrcAccountNumber(transferInfo.getSrcAcct());
			transaction.setTransferAmount(transferInfo.getTransferAmount());
			transaction.setStatus("DEBIT");
			txnRepo.save(transaction);
			response.setMsg("Balance Transfered Succesfully");
			response.setStatus(true);
			response.setAccountNumber(srcUser.getAccountNumber());
		}
		return response;
	}
}
