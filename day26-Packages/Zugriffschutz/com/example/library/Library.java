package com.example.library;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);

    }

    public void auflistenBücher() {
        System.out.println("Die Liste der Bücher ist wiefolgt:");
        for (Book book : books) {
            System.out.println(book.getTitle());
        }
    }

    public void printBookDetails(Book book) {
        System.out.println("Author: " + book.getAuthor());
        System.out.println("ISBN: " + book.getIsbn());
        System.out.println("Title: " + book.getTitle());
        System.out.println("Year: " + book.getYear());
    }

}
