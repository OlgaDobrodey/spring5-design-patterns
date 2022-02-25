package com.itrex.springbootorm.service;

import com.itrex.springbootorm.model.Book;
import com.itrex.springbootorm.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class HibernateBookServiceIml implements BookService {

    private final BookRepository bookRepository;

    @Autowired
    public HibernateBookServiceIml(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> findAllBooks() {
        return bookRepository.findAllBooks();
    }

    @Override
    public Optional<Book> findById(Long id) {
        return bookRepository.findById(id);
    }

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book update(Book book) {
        Optional<Book> book1 = bookRepository.findById(book.getId());
        if(book1.isPresent()){
            return bookRepository.update(book);
        }
        else return new Book();
    }

    @Override
    public void delete(Long id) {
        System.out.println(bookRepository.findById(id));
        bookRepository.delete(id);
    }
}
