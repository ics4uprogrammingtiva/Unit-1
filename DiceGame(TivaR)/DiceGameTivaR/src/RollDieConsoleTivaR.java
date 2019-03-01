import java.util.Scanner;
/*
 * Created by: Tiva Rait
 * Created on: 22-Feb-2019
 * Created for: ICS4U
 * Daily Assignment – Day #9 Roll Die Console
 * This program will randomly generate a value between...
 * ... 1 and maxValue and place the value in the console.
*/

// Not finished this day work on it more at home. 
// Need to make an if else statement to output "Invalid please enter number"...
//...if the user enters something other than a number
// then you need to test this day
public class RollDieConsoleTivaR {

	public static void main(String[] args) {
		// Variables
		int maxValue;
		int minValue;
		int range;
		
		// To get users answer from the console
		Scanner input = new Scanner(System.in);
		
		// Ask question in the console
		System.out.println("Please enter a max value for the random number:");
		// Get the answer from the console
		maxValue = input.nextInt();
		
		// Ask question to get minimum value
		System.out.println("Please enter a min value for the random number");
		// Get answer from console
		minValue = input.nextInt();
		
		// To get the range that should be used
		range = ((maxValue - minValue)+1);
		
		// To call the procedure
		int randomNumber = RollDie(minValue, range);
		
		
		// Display the random number to the user
		System.out.println("Random number is: "+ randomNumber);
		
		// Close the input
		input.close();

	}
	
	// Put Procedure here
			public static int RollDie( int minValue, int range)
			{
				int randomNumber = (int)((Math.random() * range ) + minValue); 
				
				return randomNumber;
			}

}
