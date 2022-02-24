package com.itrex.patterninspring.patternIoC;

import com.itrex.patterninspring.chapter3.bankapp.model.Account;
import com.itrex.patterninspring.chapter3.bankapp.model.Amount;
import com.itrex.patterninspring.chapter3.bankapp.repository.AccountRepository;
import com.itrex.patterninspring.chapter3.bankapp.repository.TransferRepository;
import com.itrex.patterninspring.chapter3.bankapp.service.TransferService;

//Pattern Inversion of the Control(IoC)
/*
The Factory idea avoids direct instantiation of an object of a class, and we
also have to create another module that is responsible for wiring the
dependencies between classes (IoC container)
 */
public class TransferServiceImpl implements TransferService {

    AccountRepository accountRepository;
    TransferRepository transferRepository;

    //injection dependencies in constructor.
    public TransferServiceImpl(AccountRepository accountRepository, TransferRepository transferRepository) {
        this.accountRepository = accountRepository;
        this.transferRepository = transferRepository;
    }

    @Override
    public void transferAmmount(Long a, Long b, Amount amount) {
        Account accountA = accountRepository.findByAccountId(a);
        Account accountB = accountRepository.findByAccountId(b);
        transferRepository.transfer(accountA, accountB, amount);
    }

}
