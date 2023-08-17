import java.util.Scanner;

public class BookshelfTest {
	static Bookshelf bookshelf = new Bookshelf();
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {


		do {
			if (bookshelf.getCountOfBooks() == 0) {
				System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу");
			} else {
				System.out.println("В шкафу книг - " + bookshelf.getCountOfBooks() +
						", свободных полок - " + (10 - bookshelf.getCountOfBooks()));
				printShelf();
			}
			System.out.println("""
				1. Добавить книгу
				2. Найти книгу
				3. Удалить книгу
				4. Очистить шкаф
				5. Выход
			""");
			System.out.println("Выберите пункт меню: ");
		} while(getMenuItem() != 5);
	}

	private static void printShelf() {
		Book[] books = bookshelf.getAll();
		for (Book book : books) {
			System.out.println("|" + book.allToString() + " "
					.repeat(bookshelf.getMaxLength() - book.getBookInformationLength()) + "|");
			System.out.println("|" + "-".repeat(bookshelf.getMaxLength()) + "|");
		}
		System.out.println("|" + " ".repeat(bookshelf.getMaxLength()) + "|");
	}

	private static int getMenuItem() {
		Scanner scanner = new Scanner(System.in);
		String menuItem = scanner.next();
		switch (menuItem) {
			case "1": add();
					break;
			case "2": find();
					break;
			case "3": delete();
					break;
			case "4": clear();
					break;
			case "5": return 5;
			default: System.out.println("Данного пункта меню нет в списке");
		}
		return 0;
	}

	private static void add() {
		System.out.println("Введите имя автора");
		String author = scanner.nextLine();
		System.out.println("Введите название книги");
		String name = scanner.nextLine();
		System.out.println("Введите год издания");
		int year = scanner.nextInt();
		scanner.nextLine();
		Book book = new Book(author, name, year);
		bookshelf.add(book);
		pressEnter();
	}

	private static void find() {
		System.out.println("Введите наименование книги");
		String name = scanner.nextLine();
		System.out.println(bookshelf.find(name).allToString());
		pressEnter();
	}

	private static void delete() {
		System.out.println("Введите наименование книги");
		String name = scanner.nextLine();
		bookshelf.delete(name);
		pressEnter();
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