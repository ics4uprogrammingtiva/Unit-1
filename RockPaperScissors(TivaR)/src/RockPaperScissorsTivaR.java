import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/*
 * Created by: Tiva Rait
 * Created on: 01-Mar-2019
 * Created for: ICS4U
 * Daily Assignment – Day #10 Rock Papper Scissors
 * This program plays rock paper scissors with the user.
*/
public class RockPaperScissorsTivaR {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RockPaperScissorsTivaR window = new RockPaperScissorsTivaR();
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
	public RockPaperScissorsTivaR() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	// Global Variables
	int userSelection;
	
	private void initialize() {
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JLabel lblResults = new JLabel("Press go to begin!");
		lblResults.setHorizontalAlignment(SwingConstants.CENTER);
		lblResults.setBounds(6, 148, 418, 14);
		frame.getContentPane().add(lblResults);
		
		// create all of the options for the user
		JRadioButton radUserRock = new JRadioButton("Rock");
		JRadioButton radUserPaper = new JRadioButton("Paper");
		JRadioButton radUserScissors = new JRadioButton("Scissors");
		
		// Create the button to get the results
		JButton btnGetResults = new JButton("Go!");
		
		// Set up the action listeners
		radUserRock.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			// Set all of the rad buttons to be deselected except this one
				radUserRock.setSelected(true);
				radUserPaper.setSelected(false);
				radUserScissors.setSelected(false);
				
				// Set the users selection
				userSelection = 1;
				
				
			}
		});
		radUserRock.setBounds(6, 23, 109, 23);
		frame.getContentPane().add(radUserRock);
		
		radUserPaper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Set all of the rad buttons to be deselected except this one
				radUserRock.setSelected(false);
				radUserPaper.setSelected(true);
				radUserScissors.setSelected(false);
				
				// Set the users selection
				userSelection = 2;
				
			}
		});
		radUserPaper.setBounds(6, 49, 109, 23);
		frame.getContentPane().add(radUserPaper);
		
		radUserScissors.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Set all of the rad buttons to be deselected except this one
				radUserRock.setSelected(false);
				radUserPaper.setSelected(false);
				radUserScissors.setSelected(true);
				
				// Set the users selection
				userSelection = 3;
				
			}
		});
		radUserScissors.setBounds(6, 75, 109, 23);
		frame.getContentPane().add(radUserScissors);
		
		JRadioButton radComRock = new JRadioButton("Rock");
		radComRock.setEnabled(false);
		radComRock.setBounds(319, 23, 109, 23);
		frame.getContentPane().add(radComRock);
		
		JRadioButton radComPaper = new JRadioButton("Paper");
		radComPaper.setEnabled(false);
		radComPaper.setBounds(319, 49, 109, 23);
		frame.getContentPane().add(radComPaper);
		
		JRadioButton radComScissors = new JRadioButton("Scissors");
		radComScissors.setEnabled(false);
		radComScissors.setBounds(319, 75, 109, 23);
		frame.getContentPane().add(radComScissors);

		
		JLabel lblTitle = new JLabel("Rock Papper Scissors");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(10, 11, 414, 14);
		frame.getContentPane().add(lblTitle);
		
		// Select computers choice, find winner, display winner
		btnGetResults.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Local variables
				int comSelection;
				
				// Select the computers choice
				comSelection = (int)((Math.random() * 3 ) + 1);
				
				// If else statement to find the winner
				// Also display the selection that the computer
				// made in the if else statement
				if (userSelection == 1)
				{
					if (comSelection == 1)
					{
						lblResults.setText("It's a tie");
						radComRock.setSelected(true);
						radComPaper.setSelected(false);
						radComScissors.setSelected(false);
					}
					else if (comSelection == 2)
					{
						lblResults.setText("Computer Wins");
						radComRock.setSelected(false);
						radComPaper.setSelected(true);
						radComScissors.setSelected(false);
					}
					else
					{
						lblResults.setText("You Win!!");
						radComRock.setSelected(false);
						radComPaper.setSelected(false);
						radComScissors.setSelected(true);
					}
				}
				else if (userSelection == 2)
				{
					if (comSelection == 1)
					{
						lblResults.setText("You Win!!");
						radComRock.setSelected(true);
						radComPaper.setSelected(false);
						radComScissors.setSelected(false);
					}
					else if (comSelection == 2)
					{
						lblResults.setText("It's a tie");
						radComRock.setSelected(false);
						radComPaper.setSelected(true);
						radComScissors.setSelected(false);
					}
					else
					{
						lblResults.setText("Computer Wins");
						radComRock.setSelected(false);
						radComPaper.setSelected(false);
						radComScissors.setSelected(true);
					}
				}
				else if (userSelection == 3)
				{
					if (comSelection == 1)
					{
						lblResults.setText("Computer Wins");
						radComRock.setSelected(true);
						radComPaper.setSelected(false);
						radComScissors.setSelected(false);
					}
					else if (comSelection == 2)
					{
						lblResults.setText("You Win!!");
						radComRock.setSelected(false);
						radComPaper.setSelected(true);
						radComScissors.setSelected(false);
					}
					else
					{
						lblResults.setText("It's a tie");
						radComRock.setSelected(false);
						radComPaper.setSelected(false);
						radComScissors.setSelected(true);
					}
				}
				else
				{
					lblResults.setText("You don't want to play?");
					radComRock.setSelected(false);
					radComPaper.setSelected(false);
					radComScissors.setSelected(false);
				}
					
				
			}
		});
		btnGetResults.setBounds(6, 114, 418, 23);
		frame.getContentPane().add(btnGetResults);
	}
}
