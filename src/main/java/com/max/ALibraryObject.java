package com.max;

public abstract class ALibraryObject {

    private int number;
    private String name;
    private Author author;

    public ALibraryObject(int number, String name, Author author) {
        this.number = number;
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "ALibraryObject{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", author=" + author +
                '}';
    }

    public int getNumber() {
        return number;
    }

    public Author getAuthor() {
        return author;
    }
}
