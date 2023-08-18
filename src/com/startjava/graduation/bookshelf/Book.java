public class Book {

	private String author;
	private String NAME;
	private int year;
	private int getBookInformationLength;

	public Book(String author, String NAME, int year) {
		this.author = author;
		this.NAME = NAME;
		this.year = year;
		getBookInformationLength = allToString().length();
	}

	public String getNAME() {
		return NAME;
	}
	public String allToString() {
		return author + ", " + NAME + ", " + year;
	}
	public int getBookInformationLength() {
		return getBookInformationLength;
	}
}