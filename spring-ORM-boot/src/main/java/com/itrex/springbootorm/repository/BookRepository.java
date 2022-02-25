package com.itrex.springbootorm.repository;

import com.itrex.springbootorm.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookRepository {

    List<Book> findAllBooks();

    Optional<Book> findById(Long id);

    Book save(Book book);

    Book update(Book book);

    void delete(Long id);
}
