package project01;

public class Driver {

	public static void main(String[] args) {
		
		// testing out Book class:
		/*
		 * the book is available & can check it out
		 * once checked out, availability & isCheckedOut should be false
		Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 1960, "Warner Books, Inc.", true);
		book1.checkoutBook();
		System.out.println(book1);
		
		 *  the book is already borrowed, cannot check it out
		 *  availability/ isCheckedOut should be false
		Book book2 = new Book("The Awakening", "Kate Chopin", 1899, "Dover Publications", false);
		book2.checkoutBook();
		System.out.println(book2);
		
		 *  the book is available, can return it
		 *  availability/ isCheckedOut should be true
		Book book3 = new Book("The Catcher in the Rye", "J.D. Salinger", 1951, "Little, Brown and Company", false);
		book3.returnBook();
		System.out.println(book3);
		
		 *  the book is available
		 *  you can checkout the book, availability = false
		 *  you can return book, availability/ isCheckedOut= true
		Book book4 = new Book("Where the SideWalk Ends", "Shel Silverstein", 1974, "HarperCollins", true);
		book4.checkoutBook();
		book4.returnBook();
		System.out.println(book4);
		
		 *  the book is available, cannot return the book because book never borrowed
		 *  availability/ isCheckedOut should be true
		Book book5 = new Book("Slaughterhouse-Five", "Kurt Vonnegut", 1969, "Dell Publishing", true);
		book5.returnBook();
		System.out.println(book5);
		*/

		//testing out LibraryCatalog class:
		
		
		
		/* final code =
		LibraryCatalog book = new LibraryCatalog();
		book.addBooksFromFile("booklist");
		
		UserInerface ui = new UserInterface();
		ui.mainLoop(book);*/

	}

}
