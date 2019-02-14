import java.util.Scanner;

public class LoggingCompanyTiva {

	public static void main(String[] args) {
		// Variables
		Double logWeight;
		Double numLogsCanFit;
		
		// Allows the program to take input
		Scanner input = new Scanner(System.in);
		
		// Asks the question 
		System.out.println("What size are the logs?");
		
		//Takes the line where the number is entered 
		Double logSize = input.nextDouble();
		
		// Calculates
		logWeight = logSize * 20;
		numLogsCanFit = 1100/logWeight;
		numLogsCanFit = 1000/ logWeight;
		
		// Prints the Answer
		System.out.println("You can fit " + numLogsCanFit + " on the truck");
		input.close();

	}

}
