import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MultiDimensionalArray {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MultiDimensionalArray window = new MultiDimensionalArray();
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
	public MultiDimensionalArray() {
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
		
		JLabel lblInstructions = new JLabel("This program tells you what the class average is.");
		lblInstructions.setBounds(10, 11, 414, 14);
		frame.getContentPane().add(lblInstructions);
		
		JLabel lblClassAverage = new JLabel("The class average is:");
		lblClassAverage.setBounds(10, 192, 414, 14);
		frame.getContentPane().add(lblClassAverage);
		
		JButton btnClassAverage = new JButton("Get Class Average");
		btnClassAverage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// Variables
				int classAverage;
				int studentIndex;
				int markIndex;
				int numStudents = 4;
				int numAssignments = 6;
				
				// Numbers to generate random grades
				int MAXIMUM = 100;
				int MINIMUM = 0;
				int RANGE = (MAXIMUM - MINIMUM);
				
				// Create 2D array
				int [][] classMarks = new int [4][6];
				
				// Populate the array with randomly generated numbers 
				for (studentIndex = 0; studentIndex <= numStudents - 1; studentIndex++)
				{
					for (markIndex = 0; markIndex <= numAssignments - 1; markIndex++)
					{
						// Randomly generate a mark for each assignment for each student
						classMarks[studentIndex][markIndex] = (int)((Math.random()* RANGE) + MINIMUM);
					}
				}
				
				// Call the CalculateAverage function
				// Return the classAverage
				classAverage = CalculateClassAverage(classMarks);
				
				// Display class average
				lblClassAverage.setText("The class average is: " + classAverage);
			}
		});
		btnClassAverage.setBounds(156, 103, 131, 23);
		frame.getContentPane().add(btnClassAverage);
		
		
	}
	
	public static int CalculateClassAverage (int[][] classMarks)
	{
		int overallAverage = 0;
		int individAverage;
		
		int bigIndex;
		int smallIndex;
		
		for (bigIndex = 0; bigIndex <= 4 -1; bigIndex++)
		{
			individAverage = 0;
			
			for (smallIndex = 0; smallIndex <= 6 -1; smallIndex++)
			{
				individAverage = (individAverage + classMarks[bigIndex][smallIndex]);
			}
			
			individAverage = (individAverage/6);
			overallAverage = (overallAverage + individAverage);
		}
		
		overallAverage = (overallAverage/4);
		
		return overallAverage;
	}
}
