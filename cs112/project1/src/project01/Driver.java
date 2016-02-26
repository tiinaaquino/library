package project01;

public class Driver {

	public static void main(String[] args) {
		
		LibraryCatalog book = new LibraryCatalog();
		book.addBooksFromFile("booklist");
		
		UserInerface ui = new UserInterface();
		ui.mainLoop(book);

	}

}
