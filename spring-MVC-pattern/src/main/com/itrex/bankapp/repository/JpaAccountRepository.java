package main.com.itrex.bankapp.repository;

import java.util.List;

import main.com.itrex.bankapp.model.Account;
import org.springframework.stereotype.Repository;

@Repository
public class JpaAccountRepository  {

	//@Override
	public Account findAccountById(Long id) {
		return new Account(id);
	}

	//@Override
	public List<Account> findAll() {
		return null;
	}

	//@Override
	public Long save(Account account) {
		return null;
	}

	//@Override
	public Double checkAccountBalance(Account account) {
		return null;
	}

}
