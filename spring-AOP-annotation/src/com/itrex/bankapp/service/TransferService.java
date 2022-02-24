package com.itrex.bankapp.service;

/**
 * @author Dinesh.Rajput
 *    
 */
public interface TransferService {
	
	void transfer(String accountA, String accountB, Long amount);
	void createCache(String account) throws InterruptedException;
}
