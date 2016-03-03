package project01;

import java.util.Scanner;

public class UserInterface {
	
	String input, input2;
	LibraryCatalog library;
	
	
	
	public void mainLoop(LibraryCatalog bc)
	{
		//first scanner to take in 1, 2, 3, or 4
		//second scanner takes in user's commands/ actions for books
		Scanner scan = new Scanner(System.in);
		Scanner scanner = new Scanner(System.in);
		
		//use while loop to repeatedly prompt the user until they exit
		
		while (true)
		{
			System.out.println("Enter 1 to check out a book, 2 to return a book, 3 to print the list of available books, or 4 to exit: ");
			input = scan.nextLine();
			
			//checks out a book
			if (input.equals("1"))
			{
				System.out.println("Checking out the book? Please enter the title: ");
				input2 = scanner.nextLine();
				
				bc.checkoutBook(input2);
			}
			
			//returns a book
			if (input.equals("2"))
			{
				System.out.println("Returning the book? Please enter the title: ");
				input2 = scanner.nextLine();
				//search for the book
				bc.returnBook(input2);
			}
			
			//prints list of available books
			if (input.equals("3"))
			{
				//bc.printAvailableBooks();
			}
			
			//exit & breaks out of loop, terminating the program
			if (input.equals("4"))
			{
				break;
			}

		}
	}
	
	
	
	

}
