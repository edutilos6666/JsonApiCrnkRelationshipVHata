package com.cemoli.crnk.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String description;
    @ManyToOne
    @JoinColumn(name = "book_category_id")
    private BookCategory bookCategory;
    @ManyToOne
    @JoinColumn(name="library_id")
    private Library library;

public Book(){}
 {
        this.description = description;
    }




    public Book(Long id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }
}
