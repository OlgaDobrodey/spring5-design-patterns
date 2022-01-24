package main.com.packt.patterninspring.chapter7.bankapp.repository;

import main.com.packt.patterninspring.chapter7.bankapp.model.Account;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author Dinesh.Rajput
 */
@Repository
public class JdbcTransferRepository implements TransferRepository {

    @Override
    public void tranfer(Long amount, Account account) {

    }

//    JdbcTemplate jdbcTemplate;
//
//    public JdbcTransferRepository(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }
//
//    @Override
//    public void tranfer(Long amount, Account account) {
//        String sql = "UPDATE Account SET balance = " + amount + " WHERE id =" + account.getId();
//        jdbcTemplate.update(sql);
//    }

}
