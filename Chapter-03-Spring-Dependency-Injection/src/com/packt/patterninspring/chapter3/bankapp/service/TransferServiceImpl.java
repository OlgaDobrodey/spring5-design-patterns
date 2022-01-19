package com.packt.patterninspring.chapter3.bankapp.service;

import com.packt.patterninspring.chapter3.bankapp.model.Account;
import com.packt.patterninspring.chapter3.bankapp.model.Amount;
import com.packt.patterninspring.chapter3.bankapp.repository.AccountRepository;
import com.packt.patterninspring.chapter3.bankapp.repository.TransferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransferServiceImpl implements TransferService {

	AccountRepository accountRepository;
	TransferRepository transferRepository;

	@Autowired
	public TransferServiceImpl(AccountRepository accountRepository, TransferRepository transferRepository) {
		super();
		this.accountRepository = accountRepository;
		this.transferRepository = transferRepository;
	}
	
	@Override
	public void transferAmmount(Long a, Long b, Amount amount) {
		Account accountA = accountRepository.findByAccountId(a);
		Account accountB = accountRepository.findByAccountId(b);
		transferRepository.transfer(accountA, accountB, amount);
	}
//// if spring don't find accountRepository - bean not setter in object
// //-it is bad practices
//	@Autowired(required = false)
//	public void setAccountRepository(AccountRepository accountRepository) {
//		this.accountRepository = accountRepository;
//	}
//	@Autowired
//	public void setTransferRepository(TransferRepository transferRepository) {
//		this.transferRepository = transferRepository;
//	}
	
}
