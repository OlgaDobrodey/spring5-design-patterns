package com.itrex.springjdbctemplateboot.repository;

import com.itrex.springjdbctemplateboot.model.Book;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface BookRepository {

    int count();
    int save(Book book);
    int update(Book book);
    int deleteById(Long id);

    List<Book> findAll();
    List<Book> findByNameAndPrice(String name, Long price);

    Optional<Book> findById(Long id);
    String getNameById(Long id);
}
