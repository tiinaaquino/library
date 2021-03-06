package project01;

import java.io.*;

public class Driver {

	public static void main(String[] args) throws IOException
	{
		
		// testing out Book class:
		/*
		Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 1960, "Warner Books, Inc.", true);
		book1.checkoutBook();
		System.out.println(book1);
		
		Book book2 = new Book("The Awakening", "Kate Chopin", 1899, "Dover Publications", false);
		book2.checkoutBook();
		System.out.println(book2);
		
		Book book3 = new Book("The Catcher in the Rye", "J.D. Salinger", 1951, "Little, Brown and Company", false);
		book3.returnBook();
		System.out.println(book3);
		
		Book book4 = new Book("Where the SideWalk Ends", "Shel Silverstein", 1974, "HarperCollins", true);
		book4.checkoutBook();
		book4.returnBook();
		System.out.println(book4);
		
		Book book5 = new Book("Slaughterhouse-Five", "Kurt Vonnegut", 1969, "Dell Publishing", true);
		book5.returnBook();
		System.out.println(book5);
		*/
		
		//creating a new LibraryCatalog object named catalog
		//call addBooksFromFile method
		LibraryCatalog catalog = new LibraryCatalog();
		catalog.addBooksFromFile("bookList");
		
		//create instance of UserInterface & call mainLoop
		UserInterface ui = new UserInterface();
		ui.mainLoop(catalog);

	}

}
