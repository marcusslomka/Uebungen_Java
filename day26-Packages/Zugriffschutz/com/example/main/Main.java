package com.example.main;

import com.example.library.*;

public class Main {
    public static void main(String[] args) {
        Library library1 = new Library();
        Library library2 = new Library();

        Book buch1 = new EBook("Herr der Ringe 1", "author 1", "01234", 2001,20);
        Book buch2 = new EBook("Herr der Ringe 2", "author 1", "01235", 2001,25);
        Book buch3 = new printedBook("Herr der Ringe 3", "author 1", "01236", 2001,400);
        Book buch4 = new printedBook("Herr der Ringe 4", "author 1", "01237", 2001,500);
        Book buch5 = new printedBook("Herr der Ringe 5", "author 1", "01238", 2001,600);

        
        library1.auflistenBücher();
        library1.addBook(buch1);
        library1.addBook(buch2);
        library1.addBook(buch3);
        library1.auflistenBücher();
        library1.printBookDetails(buch1);

    }
}
