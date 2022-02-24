package main.com.packt.patterninspring.chapter7.bankapp.repository;

import main.com.packt.patterninspring.chapter7.bankapp.model.Account;

/**
 * @author Dinesh.Rajput
 *
 */
public interface TransferRepository {
	
	void tranfer(Long amount, Account account);
}
