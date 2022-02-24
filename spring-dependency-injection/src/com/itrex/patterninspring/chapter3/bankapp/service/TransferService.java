package com.itrex.patterninspring.chapter3.bankapp.service;

import com.itrex.patterninspring.chapter3.bankapp.model.Amount;

public interface TransferService {
	
	void transferAmmount(Long a, Long b, Amount amount);
}
