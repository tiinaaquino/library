package project01;

//professor said no getters and setters!

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
	
	//other methods
	
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
			else
				return null;
		}
	}
	
	public boolean checkoutBook(String title)
	{
		getBook(title);
		
		
		
	}
	
	public boolean returnBook(String title)
	{
		for (Book bookName : books)
		{
			if (title.equals(bookName))
			{
				if (book.isCheckedOut() == true)
				{
					book.returnBook();
				}
			}
			else
			{
				return false;
			}
		}
	}
	
	public void addBooksFromFile(String filename) throws IOException
	{
		fileScan = new Scanner(new File("bookList.java"));
		while (fileScan.hasNext())
		{
			bookInfo = fileScan.nextLine();
			
			bookScan = new Scanner(bookInfo);
			bookScan.useDelimiter("/");
			
			while (bookScan.hasNext())
				System.out.println();
		}
		
		//something.add();
	}

}
