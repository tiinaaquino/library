package project01;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class LibraryCatalog {
	
	//variables
	private ArrayList<Book> books;
	Book book;
	Scanner fileScan, bookScan;
	String bookInfo;
	
	//constructor
	public LibraryCatalog()
	{
		books = new ArrayList<Book>();
	}
	
	public LibraryCatalog(ArrayList books)
	{
		this.books = books;
	}
	
	//professor said no getters and setters!
	
	/*
	 * prints the list of available books (books that are not checked out)
	 * goes through ArrayList books
	 * if book is not checked out, add book to new ArrayList available
	 * prints available
	 */
	 public void printAvailableBooks()
	 {
		 ArrayList<Book> available = new ArrayList<Book>();
		 for (Book bookName: books)
		 {
			 if (bookName.getIsCheckedOut() == false)
			 {
				 available.add(bookName);
			 }
		 }
		 int index = 0;
		 while (index < available.size())
		 {
			 System.out.println(available.get(index));
			 index++;
		 }
	 }
	
	//other methods
	// adds a book to the ArrayList books
	public void add(Book book)
	{
		books.add(book);
	}
	
	/*
	 * searches for the book in ArrayList books & returns it
	 * returns null if it doesn't exist
	 */
	public Book getBook(String title)
	{
		for (Book bookName : books)
		{
			if (title.equals(bookName.getTitle()))
			{
				return bookName;
			}
		}
		return null;
	}
	
	/*
	 * calls & saves getBook method, checks out the book
	 * if user can checkout the book return true, else return false
	 */
	public boolean checkoutBook(String title)
	{
		Book a = getBook(title);
		if (a.getIsCheckedOut() == false)
		{
			System.out.println("Book checked out.");
			a.checkoutBook();
			return true;
		}
		else
			{
			System.out.println("Book not found in catalog.");
			return false;
			}
	}
	
	/*
	 * returns the book
	 * searches for the book in ArrayList books
	 * if the book has the same title & is checked out, returns true
	 */
	public boolean returnBook(String title)
	{
		for (Book bookName : books)
		{
			if (title.equals(bookName.getTitle()))
			{
				if (bookName.getIsCheckedOut() == true)
				{
					System.out.println("Book is returned.");
					bookName.returnBook();
					return true;
				}
			}
		}
		System.out.println("This book has not been checked out.");
		return false;
	}
	
	/* 1 scanner to read user's input, 1 scanner to read bookList
	 * uses delimiter to get & create the variables for book
	 * format: name/author/year/publisher
	 */
	public void addBooksFromFile(String filename) throws IOException
	{
		String title, author, publisher;
		int year;
		
		fileScan = new Scanner(new File("bookList"));
		while (fileScan.hasNext())
		{
			Book newBook;
			bookInfo = fileScan.nextLine();
			bookScan = new Scanner(bookInfo);
			bookScan.useDelimiter("/");
			while (bookScan.hasNext())
			{
				title = bookScan.next();
				author = bookScan.next();
				year = bookScan.nextInt();
				publisher = bookScan.next();
				newBook = new Book(title, author, year, publisher);
				books.add(newBook);
			}
		}
	}

}
