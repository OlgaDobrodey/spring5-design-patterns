package main.com.packt.patterninspring.chapter7.bankapp.repository;

import main.com.packt.patterninspring.chapter7.bankapp.callbacks.AccountExtractor;
import main.com.packt.patterninspring.chapter7.bankapp.callbacks.AccountReportWriter;
import main.com.packt.patterninspring.chapter7.bankapp.callbacks.AccountRowMapper;
import main.com.packt.patterninspring.chapter7.bankapp.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.io.Writer;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author Dinesh.Rajput
 */
@Repository
public class JdbcAccountRepository extends JdbcDaoSupport implements AccountRepository {

//    JdbcTemplate jdbcTemplate;

    //    @Autowired
//    public JdbcAccountRepository(JdbcTemplate jdbcTemplate) {
////        this.jdbcTemplate = jdbcTemplate;
//    }
//
//
    @Autowired
    public JdbcAccountRepository(DataSource dataSource) {
        this.setDataSource(dataSource);
    }

    @Override
    public Account findAccountById(Long id) {
        String sql = "SELECT * FROM Account WHERE id = " + id;
        return this.getJdbcTemplate().queryForObject(sql, new RowMapper<Account>() {
            @Override
            public Account mapRow(ResultSet rs, int arg1) throws SQLException {
                Account account = new Account();
                account.setId(id);
                account.setName(rs.getString("name"));
                account.setBalance(new Long(rs.getInt("balance")));
                return account;
            }
        });
    }


    @Override
    public Account findAccountByIdDifferent(Long id){
        String sql = "SELECT * FROM Account WHERE id = "+id;
        return this.getJdbcTemplate().queryForObject(sql, new AccountRowMapper());
    }

    @Override
    public void generateReport(Writer out, String city) {
        String sql = "SELECT * FROM Account WHERE city = " + city;
        this.getJdbcTemplate().query(sql, new AccountReportWriter());
    }

    @Override
    public List<Account> extractAccounts() {
        String sql = "SELECT * FROM Account";
        return this.getJdbcTemplate().query(sql, new AccountExtractor());
    }

    @Override
    public Integer accountsCount() {
        String sql = "SELECT COUNT(*) FROM ACCOUNT";
        Integer count = this.getJdbcTemplate().queryForObject(sql, Integer.class);
        return count;
    }

}
