/**
 * 
 */
package main.com.packt.patterninspring.chapter9.bankapp.repository;

import java.util.List;

import main.com.packt.patterninspring.chapter9.bankapp.model.Account;

/**
 * @author Dinesh.Rajput
 *
 */
public interface AccountRepository {
	
	Account findAccountById(Long id);
	
	List<Account> findAll();
	
	Account save(Account account);
	
	Double checkAccountBalance(Account account);
}
