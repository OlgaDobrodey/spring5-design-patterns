package com.itrex.springbootorm.repository;

import com.itrex.springbootorm.model.Book;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

@Repository
@Qualifier("HibernateBookRepository")
public class HibernateBookRepositoryImpl implements BookRepository {

    private static final String SELECT_ALL = "select b from Book b";

    private final EntityManager entityManager;

    @Autowired
    public HibernateBookRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Book> findAllBooks() {
        return entityManager.createQuery(SELECT_ALL, Book.class).getResultList();
    }

    @Override
    public Optional<Book> findById(Long id) {
        return Optional.ofNullable(entityManager.find(Book.class, id));
    }

    @Override
    public Book save(Book book) {
        Session session = entityManager.unwrap(Session.class);
        Long id = (Long) session.save(book);

        return session.get(Book.class, id);
    }

    @Override
    public Book update(Book book) {
        entityManager.merge(book);
        return entityManager.find(Book.class, book.getId());
    }

    @Override
    public void delete(Long id) {
        entityManager.remove(entityManager.find(Book.class, id));
    }
}
