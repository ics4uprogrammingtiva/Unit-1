import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoggingCompanyTRGUI {

	private JFrame frame;
	private JTextField txtLogSize;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoggingCompanyTRGUI window = new LoggingCompanyTRGUI();
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
	public LoggingCompanyTRGUI() {
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
		
		JLabel lblQuestion = new JLabel("What size are the logs?");
		lblQuestion.setBounds(98, 11, 168, 14);
		frame.getContentPane().add(lblQuestion);
		
		JLabel lblAnswer = new JLabel(" ");
		lblAnswer.setBounds(98, 219, 326, 14);
		lblAnswer.setVerticalAlignment(SwingConstants.TOP);
		frame.getContentPane().add(lblAnswer);
		
		txtLogSize = new JTextField();
		txtLogSize.setBounds(157, 115, 86, 20);
		frame.getContentPane().add(txtLogSize);
		txtLogSize.setColumns(10);
		/*
		 * Created by: Tiva Rait
		 * Created on: 06-Sept-2019
		 * Created for: ICS4U
		 * Daily Assignment – Day #3 Logging Problem
		 * This program calculates how many logs you can fit on a truck based on their size. 
		*/
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//Variables
				Double logWeight;
				Double numLogsCanFit;
				
				// Get the size of logs and parse into a double
				String logSizeString = txtLogSize.getText();
				Double logSize = (Double.parseDouble(logSizeString));
				
				// Calculate
				logWeight = logSize * 20;
				numLogsCanFit = 1100/ logWeight;
				
				// Output answer by changing text
				lblAnswer.setText("You can fit "+ numLogsCanFit + " logs on the truck.");
			}
		});
		btnCalculate.setBounds(157, 157, 89, 23);
		frame.getContentPane().add(btnCalculate);
	}
}
