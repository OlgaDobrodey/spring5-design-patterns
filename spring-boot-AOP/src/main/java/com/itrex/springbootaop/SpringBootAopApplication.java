package com.itrex.springbootaop;

import com.itrex.springbootaop.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Slf4j
@SpringBootApplication
@EnableAspectJAutoProxy
public class SpringBootAopApplication  implements CommandLineRunner {

    @Autowired
    private BookService bookService;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAopApplication.class, args);
    }

    @Override
    public void run(String... args) {
        System.out.println("===================START APP======================");
        bookService.findNameById(100l);
        bookService.findSizeById(100l);

        try {
            bookService.methodExceptionBook(100l);
        } catch (Exception e) {}

        System.out.println("================= SHUT DOWN APP ====================");
    }
}
