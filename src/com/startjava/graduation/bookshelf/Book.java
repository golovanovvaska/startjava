package com.startjava.graduation.bookshelf;

public class Book {

    private String author;
    private String title;
    private int year;
    private int length;

    public Book(String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
        length = toString().length();
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    public String toString() {
        return author + ", " + title + ", " + year;
    }
}