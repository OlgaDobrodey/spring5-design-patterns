package com.itrex.springbootorm;

import com.itrex.springbootorm.model.Book;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        Optional<Book> book = Optional.ofNullable(null);
        System.out.println(book.isPresent());
    }
}
