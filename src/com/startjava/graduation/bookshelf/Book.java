package com.startjava.graduation.bookshelf;

public class Book {

    private String author;
    private String name;
    private int year;
    private int length;

    public Book(String author, String name, int year) {
        this.author = author;
        this.name = name;
        this.year = year;
        length = getAllToString().length();
    }

    public String getName() {
        return name;
    }

    public String getAllToString() {
        return author + ", " + name + ", " + year;
    }

    public int getLength() {
        return length;
    }
}