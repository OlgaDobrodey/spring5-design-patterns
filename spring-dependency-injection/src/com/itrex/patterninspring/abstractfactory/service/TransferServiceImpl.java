package com.itrex.patterninspring.abstractfactory.service;

import com.itrex.patterninspring.abstractfactory.repository.IAccountRepository;

public class TransferServiceImpl implements TransferService {

    IAccountRepository accountRepository;

    public TransferServiceImpl(IAccountRepository accountRepository) {
        this.accountRepository = accountRepository;
        System.out.println(accountRepository.getClass());
    }

    @Override
    public void transfer(String accountA, String accountB, Double amount) {
        System.out.println("Amount has been tranferred");
    }

}

