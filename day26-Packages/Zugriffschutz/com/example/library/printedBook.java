package com.example.library;

public class printedBook extends Book{
    private int weight;

    public printedBook(String title, String author, String isbn, int year, int weight) {
        super(title, author, isbn, year);
        this.weight = weight;
    }

    
}
