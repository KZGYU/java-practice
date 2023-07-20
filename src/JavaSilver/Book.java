package JavaSilver;

public class Book {
	static String isbn;
	public void setIsbn(String isbn) {
		this.isbn=isbn;
		
	}
	public void printInfo() {
		System.out.println(isbn);
	}

}
