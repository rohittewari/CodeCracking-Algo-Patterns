package MyCodes.immutable;

public class Stationary {
	public Book book;

	public static void main(String[] args) {
		Stationary s = new Stationary();
		Book b = new Book("MyBook");
		
				

	}

}

final class Book {
	final public  String author;
	public Book(String auth){
		this.author = auth;
	}
	
}