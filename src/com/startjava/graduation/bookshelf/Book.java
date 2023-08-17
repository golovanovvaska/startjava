public class Book {

	private String author;
	private String name;
	private int year;
	private int getBookInformationLength;

	public Book(String author, String name, int year) {
		this.author = author;
		this.name = name;
		this.year = year;
		getBookInformationLength = allToString().length();
	}

	public String getName() {
		return name;
	}
	public String allToString() {
		return author + ", " + name + ", " + year;
	}
	public int getBookInformationLength() {
		return getBookInformationLength;
	}
}