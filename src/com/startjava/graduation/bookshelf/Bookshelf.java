package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {

    public final static int CAPACITY = 10;
    private Book[] books = new Book[CAPACITY];
    private int booksCount;
    private int booksMaxLength;

    public Book[] getAll() {
        return Arrays.copyOf(books, booksCount);
    }

    public int getBooksMaxlength() {
        return booksMaxLength;
    }

    public int getBooksCount() {
        return booksCount;
    }

    public void add(Book book) {
        if (booksCount < CAPACITY) {
            books[booksCount] = book;
            booksCount++;
            System.out.println("Книга сохранена");
        } else {
            System.out.println("Шкаф полон книг");
        }
        determineBooksMaxLength(book);
    }

    public Book find(String name) {
        for (int i = 0; i < booksCount; i++) {
            if (books[i].getName().equals(name)) {
                return books[i];
            }
        }
        return null;
    }

    public void delete(String name) {
        for (int i = 0; i < booksCount; i++) {
            if (books[i].getName().equals(name)) {
                booksCount--;
                int length = books[i].getLength();
                System.arraycopy(books, i + 1, books, i, booksCount - i);
                books[booksCount] = null;
                System.out.println("Книга удалена");
                if (length == booksMaxLength) {
                    booksMaxLength = 0;
                    for (Book book : books) {
                        determineBooksMaxLength(book);
                    }
                }
            }
        }
    }

    public void clear() {
        Arrays.fill(books, null);
        booksCount = 0;
        booksMaxLength = 0;
        System.out.println("Шкаф очищен");
    }

    private void determineBooksMaxLength(Book book) {
        if (book.getLength() > booksMaxLength) {
            booksMaxLength = book.getLength();
        }
    }
}