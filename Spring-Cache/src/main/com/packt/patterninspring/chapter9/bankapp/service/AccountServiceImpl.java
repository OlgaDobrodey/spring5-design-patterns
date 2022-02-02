package main.com.packt.patterninspring.chapter9.bankapp.service;

import main.com.packt.patterninspring.chapter9.bankapp.annotation.SlowService;
import main.com.packt.patterninspring.chapter9.bankapp.model.Account;
import main.com.packt.patterninspring.chapter9.bankapp.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author Dinesh.Rajput
 */
@Service
public class AccountServiceImpl implements AccountService {

    final AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
//    @Cacheable(cacheNames = "accountCache", key = "#id",condition = "#id > 500l")
    @SlowService
    public Account findOne(Long id) {
        System.out.println("findOne called");
        return accountRepository.findAccountById(id);
    }

    @Override
    @CachePut(cacheNames = "accountCache", key = "#account.id",condition = "#id > 500l")
    public Account save(Account account) {
        System.out.println("method save");
        return accountRepository.save(account);
    }

    @Override
    @CacheEvict("accountCache")
    public void remove(Long id) {
        System.out.println("method remove");
        accountRepository.findAccountById(id);
    }

}
