package com.packt.patterninspring.setter;

import com.packt.patterninspring.chapter3.bankapp.model.Amount;
import com.packt.patterninspring.chapter3.bankapp.repository.AccountRepository;
import com.packt.patterninspring.chapter3.bankapp.repository.TransferRepository;
import com.packt.patterninspring.chapter3.bankapp.service.TransferService;

public class TransferServiceImpl implements TransferService {

    AccountRepository accountRepository;
    TransferRepository transferRepository;

    public void setAccountRepository(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public void setTransferRepository(TransferRepository transferRepository) {
        this.transferRepository = transferRepository;
    }

    @Override
    public void transferAmmount(Long a, Long b, Amount amount) {

    }
    // ...
}
