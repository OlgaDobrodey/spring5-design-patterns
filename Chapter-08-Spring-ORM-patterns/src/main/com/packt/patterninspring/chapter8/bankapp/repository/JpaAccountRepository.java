package main.com.packt.patterninspring.chapter8.bankapp.repository;

import java.util.List;

import main.com.packt.patterninspring.chapter8.bankapp.model.Account;
import org.springframework.stereotype.Repository;

@Repository
public class JpaAccountRepository implements AccountRepository {

	@Override
	public Account findAccountById(Long id) {
		return new Account(id);
	}

	@Override
	public List<Account> findAll() {
		return null;
	}

	@Override
	public Long save(Account account) {
		return null;
	}

	@Override
	public Double checkAccountBalance(Account account) {
		return null;
	}

}
