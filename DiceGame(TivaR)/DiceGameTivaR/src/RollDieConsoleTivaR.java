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
// Need to get real random number and I have to add a try catch
public class RollDieConsoleTivaR {

	public static void main(String[] args) {
		// Variables
		int maxValue;
		int minValue;
		
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
		
		
		int randomNumber = RollDie(minValue, maxValue);
		
		
		// Display the random number to the user
		System.out.println("Random number is: "+ randomNumber);
		
		// Close the input
		input.close();

	}
	
	// Put Procedure here
			public static int RollDie( int minValue, int maxValue)
			{
				int randomNumber = 1; 
				return randomNumber;
			}

}
