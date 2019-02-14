import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SimpleCalculatorTivaR {

	private JFrame frame;
	private JTextField txtFirstNumber;
	private JTextField txtSecondNumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleCalculatorTivaR window = new SimpleCalculatorTivaR();
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
	public SimpleCalculatorTivaR() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 420, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtFirstNumber = new JTextField();
		txtFirstNumber.setBounds(62, 65, 86, 20);
		frame.getContentPane().add(txtFirstNumber);
		txtFirstNumber.setColumns(10);
		
		txtSecondNumber = new JTextField();
		txtSecondNumber.setBounds(260, 65, 86, 20);
		frame.getContentPane().add(txtSecondNumber);
		txtSecondNumber.setColumns(10);
		
		JLabel lblAnswer = new JLabel("=");
		lblAnswer.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnswer.setBounds(10, 219, 386, 14);
		frame.getContentPane().add(lblAnswer);
		
		JLabel lblFirstNumber = new JLabel("First Number");
		lblFirstNumber.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblFirstNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblFirstNumber.setBounds(62, 26, 86, 14);
		frame.getContentPane().add(lblFirstNumber);
		
		JLabel lblSecondNumber = new JLabel("Second Number");
		lblSecondNumber.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblSecondNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblSecondNumber.setBounds(233, 26, 136, 14);
		frame.getContentPane().add(lblSecondNumber);
		/*
		 * Created by: Tiva Rait
		 * Created on: 07-Feb-2019
		 * Created for: ICS4U
		 * Daily Assignment – Day #07
		 * This program will allow the user to type in two numbers and...
		 * ... Ask for the numbers to be added, subtracted, multiplied or divided.
		*/
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			// Addition
			public void actionPerformed(ActionEvent arg0) {
				// Variables
				Double firstNumber;
				Double secondNumber;
				Double answer;
				
				// Get text from both text boxes 
				String firstNumberString = txtFirstNumber.getText();
				String secondNumberString = txtSecondNumber.getText();
				
				//Parse the numbers into Doubles
				firstNumber = (Double.parseDouble(firstNumberString));
				secondNumber = (Double.parseDouble(secondNumberString));
				
				// Calculate the answer
				answer = (firstNumber + secondNumber);
				
				//Display answer
				lblAnswer.setText("The answer is: " + answer);
			}
		});
		btnAdd.setBounds(10, 154, 89, 23);
		frame.getContentPane().add(btnAdd);
		
		JButton btnSubtract = new JButton("-");
		btnSubtract.addActionListener(new ActionListener() {
			// Subtraction
			public void actionPerformed(ActionEvent e) {
				// Variables
				Double firstNumber;
				Double secondNumber;
				Double answer;
				
				// Get text from both text boxes 
				String firstNumberString = txtFirstNumber.getText();
				String secondNumberString = txtSecondNumber.getText();
				
				//Parse the numbers into Doubles
				firstNumber = (Double.parseDouble(firstNumberString));
				secondNumber = (Double.parseDouble(secondNumberString));
				
				// Calculate the answer
				answer = (firstNumber - secondNumber);
				
				//Display answer
				lblAnswer.setText("The answer is: " + answer);
			}
		});
		btnSubtract.setBounds(109, 154, 89, 23);
		frame.getContentPane().add(btnSubtract);
		
		JButton btnMultiply = new JButton("*");
		btnMultiply.addActionListener(new ActionListener() {
			// Multiply
			public void actionPerformed(ActionEvent e) {
				// Variables
				Double firstNumber;
				Double secondNumber;
				Double answer;
				
				// Get text from both text boxes 
				String firstNumberString = txtFirstNumber.getText();
				String secondNumberString = txtSecondNumber.getText();
				
				//Parse the numbers into Doubles
				firstNumber = (Double.parseDouble(firstNumberString));
				secondNumber = (Double.parseDouble(secondNumberString));
				
				// Calculate the answer
				answer = (firstNumber * secondNumber);
				
				//Display answer
				lblAnswer.setText("The answer is: " + answer);
			}
		});
		btnMultiply.setBounds(208, 154, 89, 23);
		frame.getContentPane().add(btnMultiply);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			// Division
			public void actionPerformed(ActionEvent e) {
				// Variables
				Double firstNumber;
				Double secondNumber;
				Double answer;
				
				// Get text from both text boxes 
				String firstNumberString = txtFirstNumber.getText();
				String secondNumberString = txtSecondNumber.getText();
				
				//Parse the numbers into Doubles
				firstNumber = (Double.parseDouble(firstNumberString));
				secondNumber = (Double.parseDouble(secondNumberString));
				
				// Calculate the answer 
				answer = (firstNumber / secondNumber);
				
				//Display answer
				lblAnswer.setText("The answer is: " + answer);
			}
		});
		btnDivide.setBounds(307, 154, 89, 23);
		frame.getContentPane().add(btnDivide);
	}
}
