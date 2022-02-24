package com.packt.patterninspring.chapter5.bpp.service;

/**
 * @author Dinesh.Rajput
 *    
 */
public interface TransferService {
	
	void transfer(String accountA, String accountB, Long amount);
	
}
