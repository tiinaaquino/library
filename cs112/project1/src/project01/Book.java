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
	
	//String toString
	
	public String toString()
	{
		
	}
	
	//other methods
	
	public void checkoutBook()
	{
		
	}
	
	public void returnBook()
	{
		
	}

}
