package main.com.packt.patterninspring.chapter7.bankapp.repository;

import java.io.Writer;
import java.util.List;

import main.com.packt.patterninspring.chapter7.bankapp.model.Account;

/**
 * @author Dinesh.Rajput
 *
 */
public interface AccountRepository {
	Account findAccountById(Long id);
	void generateReport(Writer out, String city);
	List<Account> extractAccounts();
	Integer accountsCount();
	Account findAccountByIdDifferent(Long id);
}
