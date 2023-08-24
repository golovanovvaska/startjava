package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {

    static Bookshelf bookshelf = new Bookshelf();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            printShelf();
            printMenu();
        } while (getMenuItem() != 5);
    }

    private static void printShelf() {
        if (bookshelf.getBooksCount() == 0) {
            System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу");
        } else {
            System.out.println("В шкафу книг - " + bookshelf.getBooksCount() +
                    ", свободных полок - " + (Bookshelf.CAPACITY - bookshelf.getBooksCount()));
            Book[] books = bookshelf.getAll();
            for (Book book : books) {
                System.out.println("|" + book.getAllToString() + " "
                        .repeat(bookshelf.getBooksMaxlength() - book.getLength()) + "|");
                System.out.println("|" + "-".repeat(bookshelf.getBooksMaxlength()) + "|");
            }
            System.out.println("|" + " ".repeat(bookshelf.getBooksMaxlength()) + "|");
        }
    }

    private static void printMenu() {
        System.out.println("""
                1. Добавить книгу
                2. Найти книгу
                3. Удалить книгу
                4. Очистить шкаф
                5. Выход
                """);
        System.out.println("Выберите пункт меню: ");
    }

    private static int getMenuItem() {
        String menuItem = scanner.nextLine();
        switch (menuItem) {
            case "1" -> add();
            case "2" -> find();
            case "3" -> delete();
            case "4" -> clear();
            case "5" -> {
                return 5;
            }
            default -> System.out.println("Данного пункта меню нет в списке");
        }
        return 0;
    }

    private static void add() {
        System.out.println("Введите имя автора");
        String author = scanner.nextLine();
        String name = enterBooksName();
        System.out.println("Введите год издания");
        int year = scanner.nextInt();
        scanner.nextLine();
        Book book = new Book(author, name, year);
        bookshelf.add(book);
        pressEnter();
    }

    private static void find() {
        String name = enterBooksName();
        System.out.println(bookshelf.find(name).getAllToString());
        pressEnter();
    }

    private static void delete() {
        String name = enterBooksName();
        bookshelf.delete(name);
        pressEnter();
    }

    private static String enterBooksName() {
        System.out.println("Введите наименование книги");
        return scanner.nextLine();
    }

    private static void clear() {
        bookshelf.clear();
        pressEnter();
    }

    private static void pressEnter() {
        System.out.println("Для продолжения нажмите Enter");
        scanner.nextLine();
    }
}