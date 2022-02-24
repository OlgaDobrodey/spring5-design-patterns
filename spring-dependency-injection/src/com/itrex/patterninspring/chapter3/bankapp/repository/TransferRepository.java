package com.itrex.patterninspring.chapter3.bankapp.repository;

import com.itrex.patterninspring.chapter3.bankapp.model.Account;
import com.itrex.patterninspring.chapter3.bankapp.model.Amount;

public interface TransferRepository {
	
	void transfer(Account accountA, Account accountB, Amount amount);
}
