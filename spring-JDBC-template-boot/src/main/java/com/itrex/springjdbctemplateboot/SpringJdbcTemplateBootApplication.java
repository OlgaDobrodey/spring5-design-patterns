package com.itrex.springjdbctemplateboot;

import com.itrex.springjdbctemplateboot.model.Book;
import com.itrex.springjdbctemplateboot.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@SpringBootApplication
public class SpringJdbcTemplateBootApplication implements CommandLineRunner {

    @Autowired
    private BookRepository bookRepository;

    public static void main(String[] args) {

        SpringApplication.run(SpringJdbcTemplateBootApplication.class, args);
    }

    @Override
    public void run(String... args) {

        System.out.println("Count books in  BD:" + bookRepository.count());
        System.out.println("Find all books:" + bookRepository.findAll());
        System.out.println("Find by name and price: " + bookRepository.findByNameAndPrice("User", 2000l));
        System.out.println("Find by id: " + bookRepository.findById(1l));
        System.out.println("Get name: " + bookRepository.getNameById(1l));
        System.out.println("Save book: " + bookRepository.save(new Book("Elena", 20000l)));
        System.out.println("Find all books:" + bookRepository.findAll() + "\n");

        List<Book> books = Arrays.asList(
                new Book("Thinking in Java", 30000l),
                new Book("Mkyong in Java", 25000l),
                new Book("Getting Clojure", 26000l),
                new Book("Head First Android Development", 20002l)
        );

        books.stream().map(book -> bookRepository.save(book)).collect(Collectors.toList());
        System.out.println("Find all books:" + bookRepository.findAll() + "\n");

        Optional<Book> book = bookRepository.findById(6l);
        if (book.isPresent()) {
            Book bookUpdate = book.get();
            bookUpdate.setPrice(100000l);
            bookRepository.update(bookUpdate);
            System.out.println(bookRepository.findById(6l) + "\n");
        }
    }
}
