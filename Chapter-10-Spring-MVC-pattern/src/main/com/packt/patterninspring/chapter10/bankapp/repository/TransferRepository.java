/**
 * 
 */
package main.com.packt.patterninspring.chapter10.bankapp.repository;

import main.com.packt.patterninspring.chapter10.bankapp.model.Account;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Dinesh.Rajput
 *
 */
public interface TransferRepository extends CrudRepository<Account, Long>{
	
}
