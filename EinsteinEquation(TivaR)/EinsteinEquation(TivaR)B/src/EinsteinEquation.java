/*
 * Created by: Tiva Rait
 * Created on: 01-Feb-2019
 * Created for: ICS4U
 * Daily Assignment – Day #4 (Einstein's Equation)
 * This program let's the user enter the mass of an object and...
 * ...calculates how much energy can be released from that object
 */
import java.util.Scanner;

public class EinsteinEquation {

	public static void main(String[] args) {
		// Variables
		Double massOfObject;
		Double SPEEDOFLIGHT = (2.998 * Math.pow(10, 8));
		Double energy;
		
		// Allows the program to take input
		Scanner input = new Scanner(System.in);
		
		// Question asked 
		System.out.println("Enter the mass of the object.");
		
		// Get the line where the number was entered
		massOfObject = input.nextDouble();
		
		// Calculate E = mc2
		energy = (massOfObject * Math.pow(SPEEDOFLIGHT, 2));
		
		// Print the Answer
		System.out.println(energy + " energy could be released from your object");
		input.close();

	}

}
