package com.example.library.util;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.example.library.model.Book;
import com.example.library.service.BookService;

@Component

public class BookFiller {

    private final BookService bookService;

    public BookFiller(BookService bookService) {
        this.bookService = bookService;
    }

    @PostConstruct

    public void init() {

        Book book1 = new Book("La comunidad del anillo", "primer libro", "J.R.R Tolkien");
        bookService.addBook(book1);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }

        Book book2 = new Book("Blanca nieves", " Cuatro enanitos", "M.R. JACKSON");
        bookService.addBook(book2);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }

        Book book3 = new Book("Encanto", "Maravilloso libro", "A.C MARRIE");
        bookService.addBook(book3);

    }

}
