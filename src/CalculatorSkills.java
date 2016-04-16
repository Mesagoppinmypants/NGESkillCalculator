import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class CalculatorSkills {

	private JFrame frame;
	
	StartUpScreen sus = new StartUpScreen();
	public String selectedProf = sus.selectedProf;
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
		
		JLabel lblSelectedProfessionNone = new JLabel("Selected Profession: None");
		lblSelectedProfessionNone.setBounds(242, 26, 198, 14);
		lblSelectedProfessionNone.setText("Selected Profession: " + selectedProf);
		frame.getContentPane().add(lblSelectedProfessionNone);
	}
}
