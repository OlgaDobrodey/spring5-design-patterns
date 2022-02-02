package main.com.packt.patterninspring.chapter9.bankapp.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import main.com.packt.patterninspring.chapter9.bankapp.model.Account;

@Repository
public class JpaAccountRepository implements AccountRepository {

	@Override
	public Account findAccountById(Long id) {
		Account account = new Account(id);
		account.setBalance(5000l);
		account.setName("Olga");
		return account;
	}

	@Override
	public List<Account> findAll() {
		return null;
	}

	@Override
	public Account save(Account account) {
		return null;
	}

	@Override
	public Double checkAccountBalance(Account account) {
		return null;
	}

}
