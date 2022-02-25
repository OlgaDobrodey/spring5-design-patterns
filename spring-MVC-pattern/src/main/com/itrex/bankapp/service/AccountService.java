/**
 * 
 */
package main.com.itrex.bankapp.service;

import java.util.List;

import main.com.itrex.bankapp.model.Account;

/**
 * @author Dinesh.Rajput
 *
 */
public interface AccountService {
	
	Account open(Account account);
	
	List<Account> findAllAccounts();
	
	Account findOne(Long accountId);
	
}
