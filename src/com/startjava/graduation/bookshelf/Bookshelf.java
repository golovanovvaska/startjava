import java.util.Arrays;

public class Bookshelf {

	private int booksCount = 0;
	private Book[] books = new Book[10];
	private int maxLength;

	public int getMaxLength() {
		return maxLength;
	}

	public void add(Book book) {
		if (booksCount < 10) {
			books[booksCount] = book;
			booksCount++;
			System.out.println("Книга сохранена");
		} else {
			System.out.println("Шкаф полон книг");
		}
		if (book.getBookInformationLength() > maxLength) {
			maxLength = book.getBookInformationLength();
		}
	}

	public Book find(String NAME) {
		for (int i = 0; i < booksCount; i++){
			if (books[i].getNAME().equals(NAME)) {
				return books[i];
			}
		}
		return null;
	}

	public void delete(String NAME) {
		for (int i = 0; i < booksCount; i++) {
			if (books[i].getNAME().equals(NAME)) {
				booksCount--;
				int length = books[i].getBookInformationLength();
				System.arraycopy(books,i + 1, books, i, booksCount - i);
				books[booksCount] = null;
				System.out.println("Книга удалена");
				if (length == maxLength) {
					maxLength = 0;
					for (Book book : books) {
						if (book.getBookInformationLength() > maxLength) {
							maxLength = book.getBookInformationLength();
						}
					}
				}
			}
		}
	}

	public Book[] getAll() {
		return Arrays.copyOf(books, booksCount);
	}

	public int getCountOfBooks() {
		return booksCount;
	}

	public void clear() {
		Arrays.fill(books, null);
		booksCount = 0;
		maxLength = 0;
	}
}	