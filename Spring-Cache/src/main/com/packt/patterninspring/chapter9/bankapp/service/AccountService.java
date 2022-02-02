/**
 * 
 */
package main.com.packt.patterninspring.chapter9.bankapp.service;

import main.com.packt.patterninspring.chapter9.bankapp.model.Account;

/**
 * @author Dinesh.Rajput
 *
 */
public interface AccountService {
	
	Account findOne(Long id);
	
	Account save(Account account);
	
	void remove(Long id);
}
