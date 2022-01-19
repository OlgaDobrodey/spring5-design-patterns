package com.packt.patterninspring.chapter5.bpp.repository;

import com.packt.patterninspring.chapter5.bpp.model.Account;
import com.packt.patterninspring.chapter5.bpp.model.Amount;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Repository
public class JdbcAccountRepository implements AccountRepository {

    public JdbcAccountRepository() {
        System.out.println("I am construct " + this.getClass().getSimpleName());
    }

    @Override
    public Account findByAccountId(Long accountId) {
        return new Account(accountId, "Arnav Rajput", new Amount(3000.0));
    }

    @PostConstruct
    void populateCache() {
        System.out.println("Called populateCache() method " + this.getClass().getSimpleName());
    }

    @PreDestroy
    void clearCache() {
        System.out.println("Called clearCache() method");
    }

}
