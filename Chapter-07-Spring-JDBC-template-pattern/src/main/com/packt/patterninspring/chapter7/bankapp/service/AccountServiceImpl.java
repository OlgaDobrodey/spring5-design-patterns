package main.com.packt.patterninspring.chapter7.bankapp.service;

import main.com.packt.patterninspring.chapter7.bankapp.model.Account;
import main.com.packt.patterninspring.chapter7.bankapp.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AccountServiceImpl implements AccountService {

    private AccountRepository accountRepository;

    @Autowired
    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public void aboutAccount(Long id) {
        System.out.println("Account-" + id + " " + accountRepository.findAccountById(id));
    }

    @Override
    public void aboutAllAccounts() {
        System.out.println("All accounts in Bank: " + accountRepository.accountsCount());
        accountRepository.extractAccounts().forEach(System.out::println);
    }

    @Override
    public Account findAccountByIdDifferent(Long id) {
        Account account = accountRepository.findAccountByIdDifferent(id);
        System.out.println("Account Different = "+ account);
        return account;
    }

}
