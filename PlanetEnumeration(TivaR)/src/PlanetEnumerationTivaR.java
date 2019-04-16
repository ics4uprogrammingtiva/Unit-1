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
				int selectedChoiceInt = 0;
				int planetNumber = 0;
				selectedChoiceObj = lstPlanets.getSelectedIndex();
				selectedChoiceInt = (Integer) selectedChoiceObj;
				selectedChoiceInt = (selectedChoiceInt + 1);
				
				if (selectedChoiceInt == 1)
				{
					planetNumber = (planetsEnum.Mercury.ordinal() + 1);
					JOptionPane.showMessageDialog(null, "You would like to go to Mercury. Planet #" + planetNumber);
				}
				if (selectedChoiceInt == 2)
				{
					planetNumber = (planetsEnum.Venus.ordinal() + 1);
					JOptionPane.showMessageDialog(null, "You would like to go to Venus. Planet #" + planetNumber);
				}
				if (selectedChoiceInt == 3)
				{
					planetNumber = (planetsEnum.Earth.ordinal() + 1);
					JOptionPane.showMessageDialog(null, "You would like to go to Earth. Planet #" + planetNumber);
				}
				if (selectedChoiceInt == 4)
				{
					planetNumber = (planetsEnum.Mars.ordinal() + 1);
					JOptionPane.showMessageDialog(null, "You would like to go to Mars. Planet #" + planetNumber);
				}
				if (selectedChoiceInt == 5)
				{
					planetNumber = (planetsEnum.Jupiter.ordinal() + 1);
					JOptionPane.showMessageDialog(null, "You would like to go to Jupiter. Planet #" + planetNumber);
				}
				if (selectedChoiceInt == 6)
				{
					planetNumber = (planetsEnum.Saturn.ordinal() + 1);
					JOptionPane.showMessageDialog(null, "You would like to go to Saturn. Planet #" + planetNumber);
				}
				if (selectedChoiceInt == 7)
				{
					planetNumber = (planetsEnum.Uranus.ordinal() + 1);
					JOptionPane.showMessageDialog(null, "You would like to go to Uranus. Planet #" + planetNumber);
				}
				if (selectedChoiceInt == 8)
				{
					planetNumber = (planetsEnum.Neptune.ordinal() + 1);
					JOptionPane.showMessageDialog(null, "You would like to go to Neptune. Planet #" + planetNumber);
				}
				if (selectedChoiceInt == 9)
				{
					planetNumber = (planetsEnum.Pluto.ordinal() + 1);
					JOptionPane.showMessageDialog(null, "You would like to go to Pluto. Planet #" + planetNumber);
				}

			}
		});

		lstPlanets.setBounds(36, 36, 222, 182);
		frame.getContentPane().add(lstPlanets);
		
		
		JButton btnJustEarth = new JButton("Just Earth");
		btnJustEarth.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Test to add the planets to the list
				int planetNumber = (planetsEnum.Earth.ordinal() + 1);
				JOptionPane.showMessageDialog(null, "You would like to stay on Earth. Planet #" + planetNumber);
			}
		});
		btnJustEarth.setBounds(281, 152, 114, 23);
		frame.getContentPane().add(btnJustEarth);
		
	}
}

