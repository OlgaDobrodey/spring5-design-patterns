package com.itrex.patterninspring.chapter3.bankapp.repository;

import com.itrex.patterninspring.chapter3.bankapp.model.Account;

public interface AccountRepository {
	
	Account findByAccountId(Long accountId);
}
