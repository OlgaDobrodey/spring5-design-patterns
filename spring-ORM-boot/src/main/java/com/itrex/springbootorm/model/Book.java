package com.itrex.springbootorm.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name = "BOOK")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String author;
    private Integer size;

    public Book(String title, String author, Integer size) {
        this.title = title;
        this.author = author;
        this.size = size;
    }

    @Override
    public String toString() {
        return "\nBook{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", size=" + size +
                '}';
    }
}
