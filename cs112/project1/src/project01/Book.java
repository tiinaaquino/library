package project01;

public class Book {
	
	//variables
	private String title, author, publisher;
	private int year;
	private boolean isCheckedOut;
	
	//constructor
	public Book(String title, String author, int year, String publisher, boolean isCheckedOut)
	{
		this.title = title;
		this.author = author;
		this.year = year;
		this.publisher = publisher;
		this.isCheckedOut = isCheckedOut;
	}
	
	public Book(String title, String author, int year, String publisher)
	{
		this.title = title;
		this.year = year;
		this.publisher = publisher;
		isCheckedOut = false;
	}
	
	//getters
	public String getTitle()
	{
		return title;
	}
	
	public String getAuthor()
	{
		return author;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public String getPublisher()
	{
		return publisher;
	}
	
	public boolean isCheckedOut()
	{
		return isCheckedOut;
	}
	
	//setters
	
	public void setTitle(String bookTitle)
	{
		title = bookTitle;
	}
	
	public void setAuthor(String writer)
	{
		author = writer;
	}
	
	public void setYear(int date)
	{
		year = date;
	}
	
	public void setPublisher(String publishingCompany)
	{
		publisher = publishingCompany;
	}
	
	public void setIsCheckedOut(boolean status)
	{
		isCheckedOut = status;
	}
	
	
	//String toString
	//return a string w/ book title, author, year & publisher
	public String toString()
	{
		return (isCheckedOut + "Title: " + title + " Author: " + author + " Year published: " + year + " Publisher: " + publisher);
	}
	
	//other methods
	// sets isCheckedOut to true when the book is borrowed
	public void checkoutBook()
	{
		if (isCheckedOut == false)
		{
			isCheckedOut = true;
		}
		
		if (isCheckedOut == true)
		{
			isCheckedOut = false;
		}
	}
	
	//sets isCheckedOut to false when book is returned
	public void returnBook()
	{
		if (isCheckedOut == true)
		{
			isCheckedOut = false;
		}
		
		if (isCheckedOut == false)
		{
			isCheckedOut = true;
		}
	}

}
