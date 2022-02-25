package com.itrex.springjdbctemplateboot;

import com.itrex.springjdbctemplateboot.model.Book;
import com.itrex.springjdbctemplateboot.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class SpringJdbcTemplateBootApplication implements CommandLineRunner {

    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public static void main(String[] args) {

        SpringApplication.run(SpringJdbcTemplateBootApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Creating tables for testing");
        jdbcTemplate.execute("DROP TABLE books IF EXISTS");
        jdbcTemplate.execute("CREATE TABLE books(" +
                "id SERIAL, name VARCHAR(255), price NUMERIC(15, 2))");

        List<Book> books = Arrays.asList(
                new Book("Thinking in Java", 46l),
                new Book("Mkyong in Java", 199l),
                new Book("Getting Clojure", 199l),
                new Book("Head First Android Development", 199l)
        );

        System.out.println("Saving all books in DB");
        books.stream().map(book -> bookRepository.save(book));

    }
}
