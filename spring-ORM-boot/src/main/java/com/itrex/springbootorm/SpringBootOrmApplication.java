package com.itrex.springbootorm;

import com.itrex.springbootorm.model.Book;
import com.itrex.springbootorm.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;

@SpringBootApplication
public class SpringBootOrmApplication implements CommandLineRunner {

    @Autowired
    private BookService bookService;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootOrmApplication.class, args);
    }

    @Override
    public void run(String... args) {
        System.out.println("===================START APP======================");

        System.out.println("Find all books: " + bookService.findAllBooks());
        System.out.println("Find book by id: "+bookService.findById(1l));

        Book book = new Book("Book", "Author", 1000);
        System.out.println("Save book" + bookService.save(book));
        System.out.println("Find all books: " + bookService.findAllBooks());

        Book bookUpdate = bookService.findById(1l).get();
        bookUpdate.setSize(10000000);
        bookUpdate.setId(2l);

        System.out.println("Update book: "+ bookService.update(bookUpdate));
        System.out.println("Find all books: "+bookService.findAllBooks());

        System.out.println("Delete book with id="+ 1);
        bookService.delete(1l);
        System.out.println("Find all books: "+bookService.findAllBooks());

        System.out.println("================= SHUT DOWN APP ====================");
    }
}
