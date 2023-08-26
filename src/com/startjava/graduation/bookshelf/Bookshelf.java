package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {

    public final static int CAPACITY = 10;
    private Book[] books = new Book[CAPACITY];
    private int countBooks;
    private int maxLength;

    public Book[] getAll() {
        return Arrays.copyOf(books, countBooks);
    }

    public int getMaxLength() {
        return maxLength;
    }

    public int getCountBooks() {
        return countBooks;
    }

    public void add(Book book) {
        if (countBooks < CAPACITY) {
            books[countBooks] = book;
            countBooks++;
            System.out.println("Книга сохранена");
            determineMaxLength(book);
        } else {
            System.out.println("Шкаф полон книг");
        }
    }

    public Book find(String title) {
        for (int i = 0; i < countBooks; i++) {
            if (books[i].getTitle().equals(title)) {
                return books[i];
            }
        }
        return null;
    }

    public void delete(String title) {
        for (int i = 0; i < countBooks; i++) {
            if (books[i].getTitle().equals(title)) {
                countBooks--;
                int length = books[i].getLength();
                System.arraycopy(books, i + 1, books, i, countBooks - i);
                books[countBooks] = null;
                System.out.println("Книга удалена");
                if (length == maxLength) {
                    maxLength = 0;
                    for (int j = 0; j < countBooks; j++) {
                        determineMaxLength(books[j]);
                    }
                }
            }
        }
    }

    public void clear() {
        for (int i = 0; i < countBooks; i++) {
            books[i] = null;
        }
        countBooks = 0;
        maxLength = 0;
        System.out.println("Шкаф очищен");
    }

    private void determineMaxLength(Book book) {
        if (book.getLength() > maxLength) {
            maxLength = book.getLength();
        }
    }
}