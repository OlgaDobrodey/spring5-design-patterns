package main.com.packt.patterninspring.chapter7.bankapp.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

/**
 * @author Dinesh.Rajput
 *
 */
@Component
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

	public AccountDaoImpl(DataSource dataSource) {
		this.setDataSource(dataSource);
	}

	@Override
	public Integer totalAccountsByBranch(String branchName) {
		String sql = "SELECT count(*) FROM Account WHERE branchName = "+branchName;
		return this.getJdbcTemplate().queryForObject(sql, Integer.class);
	}

}
