package com.max;

public class Journal extends ALibraryObject{

    private int month;

    public Journal(int number, String name, Author author, int month) {
        super(number, name, author);
        this.month = month;
    }
}
