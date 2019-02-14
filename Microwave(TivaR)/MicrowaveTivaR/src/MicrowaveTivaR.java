import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/*
 * Created by: Tiva Rait
 * Created on: 11-Feb-2019
 * Created for: ICS4U
 * Daily Assignment – Day #6 Microwave
 * This program Calculates the amount of time a food...
 * ... show be heated up in the microwave based on how...
 * ... many of the same food have been placed in the microwave.
*/
public class MicrowaveTivaR {
	
	// Put all of the Global variables here.
			static double TWOITEMS = 0.5;
			static double THREEITEMS = 1;
			
			// All in seconds of how long it should be in for
			static double SUBTIME = 60;
			static double PIZZATIME = 45;
			static double SOUPTIME = 135;
			
			// Booleans
			boolean subSelected = false;
			boolean pizzaSelected = false;
			boolean soupSelected = false;
			boolean oneItemSelected = false;
			boolean twoItemsSelected = false;
			boolean threeItemsSelected = false;

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MicrowaveTivaR window = new MicrowaveTivaR();
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
	public MicrowaveTivaR() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 20, 147));
		frame.setBounds(100, 100, 408, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblAnswer = new JLabel("=");
		lblAnswer.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnswer.setBounds(10, 173, 354, 14);
		frame.getContentPane().add(lblAnswer);
		
		
		JButton btnSub = new JButton("Sub");
		btnSub.addActionListener(new ActionListener() {
			// Sub
			public void actionPerformed(ActionEvent arg0) {
				// Booleans
				subSelected = true;
				pizzaSelected = false;
				soupSelected = false;
				
				// Make sure answer text says nothing at first
				lblAnswer.setText(" ");
				
			}
		});
		btnSub.setBounds(10, 36, 89, 23);
		frame.getContentPane().add(btnSub);
		
		JButton btnPizza = new JButton("Pizza");
		btnPizza.addActionListener(new ActionListener() {
			// Pizza
			public void actionPerformed(ActionEvent e) {
				subSelected = false;
				pizzaSelected = true;
				soupSelected = false;
				
				// Make sure answer text says nothing at first
				lblAnswer.setText(" ");
			}
		});
		btnPizza.setBounds(143, 36, 89, 23);
		frame.getContentPane().add(btnPizza);
		
		JButton btnSoup = new JButton("Soup");
		btnSoup.addActionListener(new ActionListener() {
			// Soup
			public void actionPerformed(ActionEvent e) {
				subSelected = false;
				pizzaSelected = false;
				soupSelected = true;
				
				// Make sure answer text says nothing at first
				lblAnswer.setText(" ");
			}
		});
		btnSoup.setBounds(275, 36, 89, 23);
		frame.getContentPane().add(btnSoup);
		
		JLabel lblQuestionFood = new JLabel("Select the food:");
		lblQuestionFood.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuestionFood.setBounds(10, 11, 354, 14);
		frame.getContentPane().add(lblQuestionFood);
		
		JLabel lblQuestionItemNum = new JLabel("Select number of items:");
		lblQuestionItemNum.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuestionItemNum.setBounds(10, 88, 354, 14);
		frame.getContentPane().add(lblQuestionItemNum);
		
		JButton btnOneItem = new JButton("1");
		btnOneItem.addActionListener(new ActionListener() {
			// One Item
			public void actionPerformed(ActionEvent e) {
				
				// Local answer variable
				double answer = 1;
				
				// Determine which food is being placed in
				if (subSelected == true)
				{
					answer = SUBTIME;
				}
				else if (pizzaSelected == true)
				{
					answer = PIZZATIME;
				}
				else if (soupSelected == true)
				{
					answer = SOUPTIME;
				}
				else
				{
					lblAnswer.setText("Please select a food");
					
				}
				
				//Give the answer 
				lblAnswer.setText("Your food should be placed in for "+ answer);
					
			}
		});
		btnOneItem.setBounds(10, 113, 89, 23);
		frame.getContentPane().add(btnOneItem);
		
		JButton btnTwoItems = new JButton("2");
		btnTwoItems.addActionListener(new ActionListener() {
			// Two Items
			public void actionPerformed(ActionEvent e) {
				
				// Local answer variable
				double answer = 1;
				
				// Determine which food is being placed in and calculate
				if (subSelected == true)
				{
					answer = ((TWOITEMS * SUBTIME) + SUBTIME);
				}
				else if (pizzaSelected == true)
				{
					answer = ((TWOITEMS * PIZZATIME) + PIZZATIME);
				}
				else if (soupSelected == true)
				{
					answer = ((TWOITEMS * SOUPTIME) + SOUPTIME);
				}
				else
				{
					lblAnswer.setText("Please select a food");
					
				}
				
				//Give the answer 
				lblAnswer.setText("Your food should be placed in for "+ answer);
			}
		});
		btnTwoItems.setBounds(143, 113, 89, 23);
		frame.getContentPane().add(btnTwoItems);
		
		JButton btnThreeItems = new JButton("3");
		btnThreeItems.addActionListener(new ActionListener() {
			// Three Items
			public void actionPerformed(ActionEvent e) {
				
				// Local answer variable
				double answer = 1;
				
				// Determine which food is being placed in and calculate
				if (subSelected == true)
				{
					answer = ((THREEITEMS * SUBTIME) + SUBTIME);
				}
				else if (pizzaSelected == true)
				{
					answer = ((THREEITEMS * PIZZATIME) + PIZZATIME);
				}
				else if (soupSelected == true)
				{
					answer = ((THREEITEMS * SOUPTIME) + SOUPTIME);
				}
				else
				{
					lblAnswer.setText("Please select a food");
					
				}
				
				//Give the answer 
				lblAnswer.setText("Your food should be placed in for "+ answer);
				
			}
		});
		btnThreeItems.setBounds(275, 113, 89, 23);
		frame.getContentPane().add(btnThreeItems);
		
		
	}
}
