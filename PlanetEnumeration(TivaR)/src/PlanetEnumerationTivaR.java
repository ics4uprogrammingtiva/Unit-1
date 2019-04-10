import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.AbstractListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/*
 * Created by: Tiva Rait
 * Created on: 10-April-2019
 * Created for: ICS4U
 * Daily Assignment – Day #14 Planet Enumeration
 * This program ...
*/
public class PlanetEnumerationTivaR {

	enum planets
	{
		mercury,
		venus,
		earth,
		Mars,
		Jupiter,
		Saturn,
		Uranus,
		Neptune
		
		
		
	}
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlanetEnumerationTivaR window = new PlanetEnumerationTivaR();
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
	public PlanetEnumerationTivaR() {
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
	
		JList lstPlanets = new JList();
		lstPlanets.setModel(new AbstractListModel() {
			String[] values = new String[] {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		lstPlanets.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		lstPlanets.setBounds(36, 36, 222, 182);
		frame.getContentPane().add(lstPlanets);
		
		JButton btnTravelHere = new JButton("Travel Here");
		btnTravelHere.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// Variables
				
				
			}
		});
		btnTravelHere.setBounds(281, 152, 114, 23);
		frame.getContentPane().add(btnTravelHere);
		
	}
}

