import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/*
 * Created by: Tiva Rait
 * Created on: 04-Mar-2019
 * Created for: ICS4U
 * Daily Assignment – Day #11 Board Foot
 * This program tells you what the third dimension should be...
 * ... so the total can be one board foot
*/
public class BoardFootTivaR {

	private JFrame frame;
	private JTextField txtFirstDimension;
	private JTextField txtSecondDimension;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BoardFootTivaR window = new BoardFootTivaR();
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
	public BoardFootTivaR() {
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
		
		JLabel lblInstructionFirstDimension = new JLabel("Enter First Dimension");
		lblInstructionFirstDimension.setHorizontalAlignment(SwingConstants.CENTER);
		lblInstructionFirstDimension.setBounds(25, 86, 137, 14);
		frame.getContentPane().add(lblInstructionFirstDimension);
		
		txtFirstDimension = new JTextField();
		txtFirstDimension.setBounds(48, 112, 86, 20);
		frame.getContentPane().add(txtFirstDimension);
		txtFirstDimension.setColumns(10);
		
		JLabel lblInstructionSecondDimension = new JLabel("Enter Second Dimension");
		lblInstructionSecondDimension.setHorizontalAlignment(SwingConstants.CENTER);
		lblInstructionSecondDimension.setBounds(219, 86, 137, 14);
		frame.getContentPane().add(lblInstructionSecondDimension);
		
		txtSecondDimension = new JTextField();
		txtSecondDimension.setBounds(244, 112, 86, 20);
		frame.getContentPane().add(txtSecondDimension);
		txtSecondDimension.setColumns(10);
		
		JLabel lblThirdDimensionAnswer = new JLabel("Third Dimension: ");
		lblThirdDimensionAnswer.setBounds(10, 212, 346, 14);
		frame.getContentPane().add(lblThirdDimensionAnswer);
		lblThirdDimensionAnswer.setVisible(false);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Define local variables
				int firstDimension;
				int secondDimension;
				int thirdDimension;
				
				// Get the variables from the first and second dimension boxes
				firstDimension = Integer.parseInt(txtFirstDimension.getText());
				secondDimension = Integer.parseInt(txtSecondDimension.getText());
				
				// Call the CalculateBoardFoot()
				thirdDimension = CalculateBoardFoot(firstDimension, secondDimension);
				
				// show the thirdDimension
				lblThirdDimensionAnswer.setVisible(true);
				lblThirdDimensionAnswer.setText("Third Dimension: "+ thirdDimension + " inches ^3" );
				
			}
		});
		btnCalculate.setBounds(140, 154, 89, 23);
		frame.getContentPane().add(btnCalculate);
		
		
	}
	
	// Functions
	
	// Calculates to try and find the third dimension
	public static int CalculateBoardFoot(int length , int width)
	{
		// Variable
		int answer;
		
		// Calculate
		answer = (144/ (length * width));
		
		return (answer);
	}
}
