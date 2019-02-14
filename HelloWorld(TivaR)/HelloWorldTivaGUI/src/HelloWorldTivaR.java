import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HelloWorldTivaR {
	/*
	 * Created by: Tiva Rait
	 * Created on: 14-Feb-2019
	 * Created for: ICS4U
	 * Daily Assignment – Day #2 Hello World
	 * This program  asks the user to input their name ...
	 * ... and outputs "Hello World" and then "Hello "name
	*/

	private JFrame frame;
	private JTextField txtNameOfUser;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HelloWorldTivaR window = new HelloWorldTivaR();
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
	public HelloWorldTivaR() {
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
		
		JLabel lblNameQuestion = new JLabel("Please type in your name.");
		lblNameQuestion.setHorizontalAlignment(SwingConstants.CENTER);
		lblNameQuestion.setBounds(10, 11, 414, 22);
		frame.getContentPane().add(lblNameQuestion);
		
		txtNameOfUser = new JTextField();
		txtNameOfUser.setBounds(173, 55, 86, 20);
		frame.getContentPane().add(txtNameOfUser);
		txtNameOfUser.setColumns(10);
		
		JLabel lblOriginalMessage = new JLabel("");
		lblOriginalMessage.setBounds(10, 184, 414, 14);
		frame.getContentPane().add(lblOriginalMessage);
		
		JLabel lblMessageWithName = new JLabel("");
		lblMessageWithName.setBounds(10, 209, 414, 14);
		frame.getContentPane().add(lblMessageWithName);
		
		JButton btnStartProgram = new JButton("Start");
		btnStartProgram.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Declare the Strings 
				String wordOne = "Hello";
				String wordTwo = "World";
				
				// Get input from the text box
				String usersName = txtNameOfUser.getText();
				
				// Change the labels to these two messages
				lblOriginalMessage.setText(wordOne + " " + wordTwo);
				lblMessageWithName.setText(wordOne + " " + usersName);
			}
		});
		btnStartProgram.setBounds(170, 104, 89, 23);
		frame.getContentPane().add(btnStartProgram);
	}
}
