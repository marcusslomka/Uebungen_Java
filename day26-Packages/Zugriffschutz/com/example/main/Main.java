package com.example.main;

import com.example.library.Book;
import com.example.library.Library;

public class Main {
    public static void main(String[] args) {
        Library library1 = new Library();
        Library library2 = new Library();

        Book buch1 = new Book("Herr der Ringe 1", "author 1", "01234", 2001);
        Book buch2 = new Book("Herr der Ringe 2", "author 1", "01235", 2001);
        Book buch3 = new Book("Herr der Ringe 3", "author 1", "01236", 2001);
        Book buch4 = new Book("Herr der Ringe 4", "author 1", "01237", 2001);
        Book buch5 = new Book("Herr der Ringe 5", "author 1", "01238", 2001);

        
        library1.auflistenBücher();
        library1.addBook(buch1);
        library1.addBook(buch2);
        library1.addBook(buch3);
        library1.auflistenBücher();


        library1.printBookDetails(buch1);

    }
}
