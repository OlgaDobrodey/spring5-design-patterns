package main.com.packt.patterninspring.chapter8.bankapp.dao;

import main.com.packt.patterninspring.chapter8.bankapp.model.Account;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Dinesh.Rajput
 */
@Repository
public class AccountDaoImpl implements AccountDao {

    private final SessionFactory sessionFactory;

    public AccountDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    //transactional annotation is used on service level
    @Override
    @Transactional
    public Long totalAccountsByBranch(String branchName) {
        String sql = "SELECT count(*) FROM Account WHERE name = '" + branchName + "'";
        return this.sessionFactory.getCurrentSession().createQuery(sql, Long.class).getSingleResult();
    }

    @Override
    @Transactional
    public Account findAccountById(Integer id) {
        return sessionFactory.getCurrentSession().
                createQuery("FROM Account WHERE id=" + id, Account.class).getSingleResult();
    }

    @Transactional
    @Override
    public Account findOne(long accountId) {
        return (Account)
                this.sessionFactory.getCurrentSession().get(Account.class, accountId);
    }

    @Override
    @Transactional
    public Account findByName(String name) {
        return (Account)
                this.sessionFactory.getCurrentSession().createCriteria(Account.class)
                        .add(Restrictions.eq("name", name))
                        .list().get(0);
    }

    @Override
    @Transactional
    public List<Account> findAllAccountInBranch(String branchName) {
        return (List<Account>) this.sessionFactory.getCurrentSession()
                .createCriteria(Account.class).add(Restrictions.eq("branchName",
                        branchName)).list();
    }

}
