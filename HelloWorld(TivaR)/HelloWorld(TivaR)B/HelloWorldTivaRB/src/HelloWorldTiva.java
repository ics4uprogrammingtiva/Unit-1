import java.util.Scanner;

public class HelloWorldTiva {
	/*
	 * Created by: Tiva Rait
	 * Created on: 02-Feb-2019
	 * Created for: ICS4U
	 * Daily Assignment – Day #2 Hello World
	 * This program asks the user to input their name ...
	 * ... and outputs "Hello World" and then "Hello "name

	*/

	public static void main(String[] args) {
		// Declare the Strings 
		String wordOne = "Hello";
		String wordTwo = "World";
		
		// Allows the program to take input
		Scanner input = new Scanner(System.in);
		
		// Print out question
		System.out.println("Type in your name");
		
		// Gets users answer and places it in a String
		String usersName = input.nextLine();
		
		// Print out the code
		System.out.println(wordOne + " " + wordTwo);
		System.out.println(wordOne + " " + usersName);
		input.close();

	}

}
