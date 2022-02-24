package main.com.packt.patterninspring.chapter8.bankapp.repository;

import main.com.packt.patterninspring.chapter8.bankapp.model.Account;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Primary
public class HibernateAccountRepository implements AccountRepository {

    SessionFactory sessionFactory;

    public HibernateAccountRepository(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    @Override
    public Account findAccountById(Long id) {
        return sessionFactory.getCurrentSession().
                createQuery("FROM Account WHERE id=" + id, Account.class).getSingleResult();
    }

    @Override
    public List<Account> findAll() {
        return sessionFactory.getCurrentSession().createQuery("FROM Account").list();
    }


    @Override
    public Long save(Account account) {
        return (Long) sessionFactory.getCurrentSession().save(account);
    }


    @Override
    public Double checkAccountBalance(Account account) {
        return sessionFactory.getCurrentSession().
                createQuery("SELECT balance FROM Account where id=" + account.getId(), Double.class).getSingleResult();
    }

}
