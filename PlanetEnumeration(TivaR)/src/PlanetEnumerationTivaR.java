import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
/*
 * Created by: Tiva Rait
 * Created on: 10-April-2019
 * Created for: ICS4U
 * Daily Assignment – Day #14 Planet Enumeration
 * This program Uses enumeration to assign values to planets.
*/
public class PlanetEnumerationTivaR {

	 
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
	
	// Create enum
	public enum planetsEnum 
	{
		Mercury,
		Venus,
		Earth,
		Mars,
		Jupiter,
		Saturn,
		Uranus,
		Neptune,
		Pluto;
		
		//public int order;
		
		//planetsEnum (int order)
		//{
		//	this.order = order;
		//}
			
		
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
		// These are all of the planets I need in my list
		DefaultListModel planetsInList= new DefaultListModel();
		planetsInList.addElement(planetsEnum.Mercury);
		planetsInList.addElement(planetsEnum.Venus);
		planetsInList.addElement(planetsEnum.Earth);
		planetsInList.addElement(planetsEnum.Mars);
		planetsInList.addElement(planetsEnum.Jupiter);
		planetsInList.addElement(planetsEnum.Saturn);
		planetsInList.addElement(planetsEnum.Uranus);
		planetsInList.addElement(planetsEnum.Neptune);
		planetsInList.addElement(planetsEnum.Pluto);
		lstPlanets.setModel(planetsInList);
				
		lstPlanets.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
				
		lstPlanets.addListSelectionListener(new ListSelectionListener() {	
			public void valueChanged(ListSelectionEvent arg0) {
				Object selectedChoiceObj;
				selectedChoiceObj = lstPlanets.getSelectedIndex();
				System.out.println("I am working " + selectedChoiceObj);
				
				System.out.println("This thing" + planetsEnum.Mercury);
				System.out.println("This other thing" + selectedChoiceObj); 
				
				int selectedChoiceint = (Integer) selectedChoiceObj;
				if (selectedChoiceint == 0  )
				{
					JOptionPane.showMessageDialog(null, "You would like to go to Mercury " + planetsEnum.Mercury.ordinal());
					
				}

			}
		});

		lstPlanets.setBounds(36, 36, 222, 182);
		frame.getContentPane().add(lstPlanets);
		
		
		JButton btnJustEarth = new JButton("Travel Here");
		btnJustEarth.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Test to add the planets to the list
				 
				
				// Variables
				//String planetSelected
				
				// If statement to determine which planet user selected.
				
				
				
			}
		});
		btnJustEarth.setBounds(281, 152, 114, 23);
		frame.getContentPane().add(btnJustEarth);
		
	}
}

