import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.List;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/*
 * Created by: Tiva Rait
 * Created on: 03-Mar-2019
 * Created for: ICS4U
 * Daily Assignment – Day #12 Max & Min Numbers 
 * This program generates 10 random numbers between 1 and 99
 * Then it tells the user what the highest number it generated
 * was and what the lowest number it generated was.
*/

// I have so many errors I should fix it
// Tiva don't forget to fix it

public class MaxMinNumbersTivaR {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MaxMinNumbersTivaR window = new MaxMinNumbersTivaR();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MaxMinNumbersTivaR() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		List lstRandomNumbers = new List();
		lstRandomNumbers.setBounds(236, 50, 117, 157);
		frame.getContentPane().add(lstRandomNumbers);
		
		JLabel lblLowestNumber = new JLabel("Lowest:");
		lblLowestNumber.setBounds(51, 162, 94, 14);
		frame.getContentPane().add(lblLowestNumber);
		
		JLabel lblHighestNumber = new JLabel("Highest:");
		lblHighestNumber.setBounds(51, 125, 94, 14);
		frame.getContentPane().add(lblHighestNumber);
		
		JButton btnGenerateRandomNumber = new JButton("Generate Random Number");
		btnGenerateRandomNumber.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Local Variables
				int newRandomNumber;
				int highestNum;
				int lowestNum;
				
				//TO set parameters for generating random numbers
				int MAXIMUM = 99;
				int MINIMUM = 1;
				int RANGE = ((MAXIMUM - MINIMUM)+ 1);
				
				
				// Declare array size
				int[] randomNumbers = new int[9];
				
				// Loop to get randomly generated numbers
				for (int i = 0; i < 10; i++)
				{
					newRandomNumber = GenerateRandomNumber(RANGE, MINIMUM);
					
					// Parse the answer of newrandomNumber to put in list
					lstRandomNumbers.add(Integer.toString(newRandomNumber));
					
					// Add to array
					randomNumbers[i] = newRandomNumber;
					
				}
				
				// Get the highest and lowest numbers in the array
				highestNum = GetMaxValue(randomNumbers);
				
				lowestNum = GetMinValue(randomNumbers);
				
				// Display all of the numbers in labels 
				lblLowestNumber.setText("Lowest: " + lowestNum);
				lblHighestNumber.setText("Highest: " + highestNum );
				
				// Test to see if program is working 
				System.out.println("I am working");
			}
		});
		btnGenerateRandomNumber.setBounds(30, 30, 177, 46);
		frame.getContentPane().add(btnGenerateRandomNumber);
	}
	
	//Procedures
	//Procedure to generate another random numbers
	// Returns: randomNumber
	public static int GenerateRandomNumber(int RANGE, int MINIMUM)
	{
		int randomNumber = (int)((Math.random()* RANGE)+ MINIMUM);
		
		return randomNumber;
	}
	
	//Procedure to get the highest number in the array
	public static int GetMaxValue (int[] randomNumbers)
	{
		int maxValue = 0;
		int currentValue;
		
		for (int i = 0; i < 10; i++)
		{
			currentValue = randomNumbers[i];
			
			// See if currentValue is higher than the highest Number
			if (currentValue > maxValue)
			{
				maxValue = currentValue;
			}
		}
		
		return maxValue;
	}
	
	//Procedure to get the lowest number in the array
		public static int GetMinValue (int[] randomNumbers)
		{
			int minValue = 0;
			int currentValue;
			
			for (int i = 0; i < 10; i++)
			{
				currentValue = randomNumbers[i];
				
				// See if currentValue is higher than the highest Number
				if (currentValue < minValue)
				{
					minValue = currentValue;
				}
			}
			
			return minValue;
		}
}
