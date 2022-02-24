package com.itrex.patterninspring.chapter3.bankapp.repository.jdbc;

import com.itrex.patterninspring.chapter3.bankapp.repository.AccountRepository;
import com.itrex.patterninspring.chapter3.bankapp.model.Account;
import com.itrex.patterninspring.chapter3.bankapp.model.Amount;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcAccountRepository implements AccountRepository {

    @Override
    public Account findByAccountId(Long accountId) {
        return new Account(accountId, "Arnav Rajput", new Amount(3000.0));
    }

}
