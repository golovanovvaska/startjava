package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {

    private int booksCount = 0;
    private final Book[] BOOKS = new Book[10];
    private int maxLength;

    public int getMaxLength() {
        return maxLength;
    }

    public void add(Book book) {
        if (booksCount < 10) {
            BOOKS[booksCount] = book;
            booksCount++;
            System.out.println("Книга сохранена");
        } else {
            System.out.println("Шкаф полон книг");
        }
        if (book.getLength() > maxLength) {
            maxLength = book.getLength();
        }
    }

    public Book find(String NAME) {
        for (int i = 0; i < booksCount; i++){
            if (BOOKS[i].getNAME().equals(NAME)) {
                return BOOKS[i];
            }
        }
        return null;
    }

    public void delete(String NAME) {
        for (int i = 0; i < booksCount; i++) {
            if (BOOKS[i].getNAME().equals(NAME)) {
                booksCount--;
                int length = BOOKS[i].getLength();
                System.arraycopy(BOOKS,i + 1, BOOKS, i, booksCount - i);
                BOOKS[booksCount] = null;
                System.out.println("Книга удалена");
                if (length == maxLength) {
                    maxLength = 0;
                    for (Book book : BOOKS) {
                        if (book.getLength() > maxLength) {
                            maxLength = book.getLength();
                        }
                    }
                }
            }
        }
    }

    public Book[] getAll() {
        return Arrays.copyOf(BOOKS, booksCount);
    }

    public int getCountOfBooks() {
        return booksCount;
    }

    public void clear() {
        Arrays.fill(BOOKS, null);
        booksCount = 0;
        maxLength = 0;
        System.out.println("Шкаф очищен");
    }
}    