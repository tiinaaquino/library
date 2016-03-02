package project01;

//professor said no getters and setters!

import java.util.ArrayList;

public class LibraryCatalog {
	
	//variables
	private ArrayList<Book> books;
	
	//constructor
	public LibraryCatalog()
	{
		books = new ArrayList<Book>();
	}
	
	public LibraryCatalog(ArrayList books)
	{
		this.books = books;
	}
	
	
	//method that prints the list of available books that aren't checked out
	// check parameter??? is this not one of the methods she provided?
	public String printAvailableBooks(String filename)
	{
		
	}
	
	public void add(Book book)
	{
		books.add(book);
	}
	
	public Book getBook(String title)
	{
		for (Book bookName : books)
		{
			if (title.equals(bookName))
			{
				return bookName;
			}
			//else
				//return bookName;
		}
	}
	
	public boolean checkoutBook(String title)
	{
		getBook(title);
		Book book = new Book(title);
		
		
	}
	
	public boolean returnBook(String title)
	{
		
	}
	
	public void addBooksFromFile(String filename)
	{
		
	}

}
