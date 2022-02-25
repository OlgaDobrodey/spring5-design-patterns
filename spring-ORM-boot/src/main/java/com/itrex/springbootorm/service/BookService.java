package com.itrex.springbootorm.service;

import com.itrex.springbootorm.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {


    List<Book> findAllBooks();
    Optional<Book> findById(Long id);
    Book save(Book book);
    Book update(Book book);
    void delete(Long id);
}
