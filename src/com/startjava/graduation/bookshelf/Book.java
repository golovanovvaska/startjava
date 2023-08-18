package com.startjava.graduation.bookshelf;

public class Book {

    private final String AUTHOR;
    private final String NAME;
    private final int YEAR;
    private final int LENGTH;

    public Book(String author, String NAME, int year) {
        this.AUTHOR = author;
        this.NAME = NAME;
        this.YEAR = year;
        LENGTH = allToString().length();
    }

    public String getNAME() {
        return NAME;
    }
    public String allToString() {
        return AUTHOR + ", " + NAME + ", " + YEAR;
    }
    public int getLength() {
        return LENGTH;
    }
}