/**
 * 
 */
package main.com.packt.patterninspring.chapter8.bankapp.dao;

import main.com.packt.patterninspring.chapter8.bankapp.model.Account;

import java.util.List;

/**
 * @author Dinesh.Rajput
 *
 */
public interface AccountDao {
	
	Long totalAccountsByBranch(String branchName);
	Account findAccountById(Integer id);
	Account findByName(String name);
	Account findOne(long accountId);
	List<Account> findAllAccountInBranch(String branchName);
}
