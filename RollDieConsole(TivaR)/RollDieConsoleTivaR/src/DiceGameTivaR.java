import java.awt.EventQueue;
/*
 * Created by: Tiva Rait
 * Created on: 20-Feb-2019
 * Created for: ICS4U
 * Daily Assignment – Day #8 Dice game
 * This program ...
*/

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DiceGameTivaR {

	private JFrame frame;
	private JTextField txtUserGuess;
	private JButton btnGuess;
	private JLabel lblNumberOfGuesses;
	private JLabel lblAnswerRandomNumber;
	private JLabel lblCorrect;
	private JLabel lblWrong;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DiceGameTivaR window = new DiceGameTivaR();
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
	public DiceGameTivaR() {
		initialize();
		int randomNumber = (int)((Math.random() * 5) + 1 );
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblInformation = new JLabel("I will generate a random number. Can you guess what number I am thinking of? ");
		lblInformation.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblInformation.setHorizontalAlignment(SwingConstants.CENTER);
		lblInformation.setBounds(10, 11, 414, 38);
		frame.getContentPane().add(lblInformation);
		
		JLabel lblQuestion = new JLabel("What number do you think it is?");
		lblQuestion.setBounds(10, 76, 156, 17);
		frame.getContentPane().add(lblQuestion);
		
		txtUserGuess = new JTextField();
		txtUserGuess.setBounds(176, 74, 86, 20);
		frame.getContentPane().add(txtUserGuess);
		txtUserGuess.setColumns(10);
		
		lblNumberOfGuesses = new JLabel("Number of guesses before correct: ");
		lblNumberOfGuesses.setBounds(10, 198, 211, 14);
		frame.getContentPane().add(lblNumberOfGuesses);
		
		lblAnswerRandomNumber = new JLabel("Random Number: ");
		lblAnswerRandomNumber.setBounds(10, 223, 211, 14);
		frame.getContentPane().add(lblAnswerRandomNumber);
		
		lblCorrect = new JLabel("Correct!!!");
		lblCorrect.setHorizontalAlignment(SwingConstants.LEFT);
		lblCorrect.setBounds(10, 173, 149, 14);
		frame.getContentPane().add(lblCorrect);
		
		lblWrong = new JLabel("Sorry that answer is wrong");
		lblWrong.setHorizontalAlignment(SwingConstants.CENTER);
		lblWrong.setBounds(10, 142, 149, 14);
		frame.getContentPane().add(lblWrong);
		
		// Hide all of the labels that I don't want to see
		lblNumberOfGuesses.setVisible(false);
		lblAnswerRandomNumber.setVisible(false);
		lblCorrect.setVisible(false);
		lblWrong.setVisible(false);
		
		btnGuess = new JButton("Guess");
		btnGuess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Get the users guess
				String userGuessString = txtUserGuess.getText();
				
				int userGuess = Integer.parseInt(userGuessString);
			}
		});
		btnGuess.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnGuess.setBounds(20, 104, 149, 23);
		frame.getContentPane().add(btnGuess);
		
		
	}
}
