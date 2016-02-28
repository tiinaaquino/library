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
		isCheckedOut =  false;
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
	
	public String toString()
	{
		return ("Title: " + title + " Author: " + author + " Year published: " + year + " Publisher: " + publisher + " Available to check out: " + isCheckedOut);
	}
	
	//other methods
	
	public void checkoutBook()
	{
		
	}
	
	public void returnBook()
	{
		
	}

}
