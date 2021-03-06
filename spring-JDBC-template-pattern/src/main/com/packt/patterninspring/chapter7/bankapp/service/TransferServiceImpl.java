package main.com.packt.patterninspring.chapter7.bankapp.service;

import main.com.packt.patterninspring.chapter7.bankapp.repository.TransferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import main.com.packt.patterninspring.chapter7.bankapp.model.Account;
import main.com.packt.patterninspring.chapter7.bankapp.repository.AccountRepository;

@Service
public class TransferServiceImpl implements TransferService{
	//1. always resolve dependency by type if failure then its try with by property name
	@Autowired
	AccountRepository accountRepository;
	@Autowired
	TransferRepository transferRepository;
	//As of Spring 4.3 if any class has single argument constructor then no need too define dependency definition to container
	//autowired always resolve dependency by type
	/*@Autowired 
	public TransferServiceImpl(@Qualifier("jpaAccountRepository") AccountRepository accountRepository) {
		super();
		this.accountRepository = accountRepository;
	}*/
	
	@Override
	@Transactional 
	public void transfer(Long amount, Long a, Long b){
		Account accountA = accountRepository.findAccountById(a);//update 1-OK//rollback//connect
		Account accountB = accountRepository.findAccountById(b);////update 2//rollback//connect//close

		System.out.println("Amount has been transfered from "+accountA +" to "+accountB);
		System.out.println("Transfer amount = "+ amount);
		transferRepository.tranfer(accountB.getBalance()+amount, accountB);
		transferRepository.tranfer(accountA.getBalance()-amount, accountA);

		accountA = accountRepository.findAccountById(a);
		accountB = accountRepository.findAccountById(b);
		////update 3-Not OK-
		System.out.println("Amount has been transfered from "+accountA +" to "+accountB);

	}
}
