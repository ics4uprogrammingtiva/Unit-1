import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class EinGUI {

	protected Shell shell;
	private Text txtMass;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			EinGUI window = new EinGUI();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		
		txtMass = new Text(shell, SWT.BORDER);
		txtMass.setBounds(181, 82, 76, 21);
		
		Label lblQuestion = new Label(shell, SWT.NONE);
		lblQuestion.setAlignment(SWT.CENTER);
		lblQuestion.setBounds(10, 10, 414, 15);
		lblQuestion.setText("Enter the mass of the object.");
		
		Label lblAnswer = new Label(shell, SWT.NONE);
		lblAnswer.setAlignment(SWT.CENTER);
		lblAnswer.setBounds(10, 186, 414, 15);
		lblAnswer.setText("Answer ");
		/*
		 * Created by: Tiva Rait
		 * Created on: 02-Feb-2019
		 * Created for: ICS4U
		 * Daily Assignment – Day #4 (Einstein's Equation)
		 * This program let's the user enter the mass of an object and...
		 * ...calculates how much energy can be released from that object
		 */
		
		Button btnCalculate = new Button(shell, SWT.NONE);
		btnCalculate.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Double massOfObject;
				Double SPEEDOFLIGHT = (2.998 * Math.pow(10, 8));
				Double energy;
				
				// Get the Mass from the text box and convert to double
				String massString = txtMass.getText();
				massOfObject = (Double.parseDouble(massString));
				
				// Calculate E = mc2
				energy = (massOfObject * Math.pow(SPEEDOFLIGHT, 2));
				
				lblAnswer.setText(energy + " energy could be released from your object.");
			}
		});
		btnCalculate.setBounds(182, 125, 75, 25);
		btnCalculate.setText("Calculate");
		
		

	}
}
