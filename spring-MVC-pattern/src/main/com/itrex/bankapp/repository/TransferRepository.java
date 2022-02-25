/**
 * 
 */
package main.com.itrex.bankapp.repository;

import main.com.itrex.bankapp.model.Account;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Dinesh.Rajput
 *
 */
public interface TransferRepository extends CrudRepository<Account, Long>{
	
}
