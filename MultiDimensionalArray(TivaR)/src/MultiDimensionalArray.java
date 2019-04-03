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
			}
		});
		btnClassAverage.setBounds(156, 103, 131, 23);
		frame.getContentPane().add(btnClassAverage);
	}
}
