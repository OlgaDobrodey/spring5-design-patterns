package main.com.itrex.bankapp.service;

import main.com.itrex.bankapp.repository.IAccountRepository;

/**
 * @author Dinesh Rajput
 *
 */
public class TransferService {
	IAccountRepository accountRepository;
	public TransferService(IAccountRepository accountRepository){
		this.accountRepository = accountRepository;
	}
	public void transfer(String accountA, String accountB, Double amount){
		System.out.println("Amount has been tranferred");
	}
}
