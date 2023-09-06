package com.max;

public class Book extends ALibraryObject{

    private int year;

    public Book(int number, String name, Author author, int year) {
        super(number, name, author);
        this.year = year;
    }
}
