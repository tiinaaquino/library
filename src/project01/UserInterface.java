package project01;

import java.util.Scanner;

public class UserInterface {
	
	String input, input2;
	LibraryCatalog library;
	
	
	
	public void mainLoop(LibraryCatalog bc)
	{
		Scanner scan = new Scanner(System.in);
		Scanner scanner = new Scanner(System.in);
		
		//2 while loops to except second input? or 2 instances of Scanner
		
		while (true)
		{
			System.out.println("Enter 1 to check out a book, 2 to return a book, 3 to print the list of available books, or 4 to exit: ");
			input = scan.nextLine();
			
			if (input.equals("1"))
			{
				System.out.println("Checking out the book? Please enter the title: ");
				input2 = scanner.nextLine();
				//search for the book
				bc.checkoutBook(input2);
			}
			
			if (input.equals("2"))
			{
				System.out.println("Returning the book? Please enter the title: ");
				input2 = scanner.nextLine();
				//search for the book
				bc.returnBook(input2);
			}
			
			if (input.equals("3"))
			{
				//library.printAvailableBooks();
			}
			
			if (input.equals("4"))
			{
				break;
			}

		}
	}
	
	
	
	

}
