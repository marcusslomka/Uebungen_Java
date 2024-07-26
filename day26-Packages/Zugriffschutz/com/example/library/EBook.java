package com.example.library;

public class EBook extends Book{
    private int fileSize;

    public EBook(String title, String author, String isbn, int year, int fileSize) {
        super(title, author, isbn, year);
        this.fileSize = fileSize;
    }
    
    public void download() {
        System.out.println(
            "Buch: " + this.getTitle() +
            " mit der Größe von " + this.fileSize + "mb wird heruntergeladen!");
    }
    
}
