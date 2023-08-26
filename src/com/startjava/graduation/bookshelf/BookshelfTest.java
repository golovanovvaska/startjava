package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {

    static Bookshelf bookshelf = new Bookshelf();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            printShelf();
            printMenu();
        } while (selectMenuItem() != 5);
    }

    private static void printShelf() {
        int countBooks = bookshelf.getCountBooks();
        if (countBooks == 0) {
            System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу");
        } else {
            int maxLength = bookshelf.getMaxLength();
            System.out.println("В шкафу книг - " + countBooks + ", свободных полок - "
                    + (Bookshelf.CAPACITY - countBooks));
            Book[] books = bookshelf.getAll();
            for (Book book : books) {
                System.out.println("|" + book.toString() + " ".repeat(maxLength - book.getLength()) + "|");
                System.out.println("|" + "-".repeat(maxLength) + "|");
            }
            System.out.println("|" + " ".repeat(maxLength) + "|");
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

    private static int selectMenuItem() {
        String menuItem = scanner.nextLine();
        switch (menuItem) {
            case "1" -> addBook();
            case "2" -> findBook();
            case "3" -> deleteBook();
            case "4" -> clearBookshelf();
            case "5" -> {
                return 5;
            }
            default -> System.out.println("Данного пункта меню нет в списке");
        }
        pressEnter();
        return 0;
    }

    private static void addBook() {
        System.out.println("Введите имя автора");
        String author = scanner.nextLine();
        String title = enterTitle();
        System.out.println("Введите год издания");
        int year = scanner.nextInt();
        scanner.nextLine();
        bookshelf.add(new Book(author, title, year));
    }

    private static void findBook() {
        System.out.println(bookshelf.find(enterTitle()));
    }

    private static void deleteBook() {
        bookshelf.delete(enterTitle());
    }

    private static String enterTitle() {
        System.out.println("Введите наименование книги");
        return scanner.nextLine();
    }

    private static void clearBookshelf() {
        bookshelf.clear();
    }

    private static void pressEnter() {
        System.out.println("Для продолжения нажмите Enter");
        scanner.nextLine();
    }
}