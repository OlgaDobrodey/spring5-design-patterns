/**
 * 
 */
package main.com.packt.patterninspring.chapter10.bankapp.service;

import java.util.List;

import main.com.packt.patterninspring.chapter10.bankapp.model.Account;

/**
 * @author Dinesh.Rajput
 *
 */
public interface AccountService {
	
	Account open(Account account);
	
	List<Account> findAllAccounts();
	
	Account findOne(Long accountId);
	
}
