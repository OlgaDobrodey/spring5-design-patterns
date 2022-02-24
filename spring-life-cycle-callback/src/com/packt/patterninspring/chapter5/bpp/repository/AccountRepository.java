package com.packt.patterninspring.chapter5.bpp.repository;

import com.packt.patterninspring.chapter5.bpp.model.Account;

public interface AccountRepository {
	
	Account findByAccountId(Long accountId);
}
