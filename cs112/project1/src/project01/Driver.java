package project01;

public class Driver {

	public static void main(String[] args) {
		
		// testing out Book class:
		
		Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 1960, "Warner Books, Inc.", true);
		book1.checkoutBook();
		System.out.println(book1);
		
		Book book2 = new Book("The Catcher in the Rye", "J.D. Salinger", 1951, "Little, Brown and Company", false);
		book2.returnBook();
		System.out.println(book2);
		
		Book book3 = new Book("The Awakening", "Kate Chopin", 1899, "Dover Publications", false);
		book3.checkoutBook();
		System.out.println(book3);
		
		Book book4 = new Book("Slaughterhouse-Five", "Kurt Vonnegut", 1969, "Dell Publishing", true);
		book4.returnBook();
		System.out.println(book4);
		
		//code to test out Book class
		
		/* final code =
		LibraryCatalog book = new LibraryCatalog();
		book.addBooksFromFile("booklist");
		
		UserInerface ui = new UserInterface();
		ui.mainLoop(book);*/

	}

}
