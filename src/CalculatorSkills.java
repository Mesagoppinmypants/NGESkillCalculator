import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class CalculatorSkills {

	private JFrame frame;
	
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorSkills window = new CalculatorSkills();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CalculatorSkills() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		StartUpScreen sus = new StartUpScreen();
		String selectedProf = sus.selectedProf;
		if (selectedProf == null) {
			selectedProf = "None";
		}
		
		JLabel lblSelectedProfessionTest = new JLabel("Selected Profession: Test");
		lblSelectedProfessionTest.setBounds(270, 31, 240, 14);
		lblSelectedProfessionTest.setText("Selected Profession: " + selectedProf);
		frame.getContentPane().add(lblSelectedProfessionTest);
	}
}
