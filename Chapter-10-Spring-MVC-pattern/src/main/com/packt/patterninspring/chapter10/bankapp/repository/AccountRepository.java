/**
 * 
 */
package main.com.packt.patterninspring.chapter10.bankapp.repository;

import main.com.packt.patterninspring.chapter10.bankapp.model.Account;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Dinesh.Rajput
 *
 */
public interface AccountRepository extends CrudRepository<Account, Long>{
	
	Account findAccountByName(String name);
	
	@Query("FROM Account where id=?1")
	Account readRecord(Long id);
}
