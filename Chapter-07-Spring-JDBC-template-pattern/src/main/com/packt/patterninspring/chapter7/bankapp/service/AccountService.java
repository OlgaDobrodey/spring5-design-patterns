package main.com.packt.patterninspring.chapter7.bankapp.service;

import main.com.packt.patterninspring.chapter7.bankapp.model.Account;

public interface AccountService {

    void aboutAccount(Long id);
    void aboutAllAccounts();
    Account findAccountByIdDifferent(Long id);

}
