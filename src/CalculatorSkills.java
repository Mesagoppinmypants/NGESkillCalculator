import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

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
		
		JLabel lblSelectedProfessionNone = new JLabel("Selected Profession: Test");
		lblSelectedProfessionNone.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectedProfessionNone.setBounds(243, 26, 198, 14);
		StartUpScreen sus = new StartUpScreen();
		String selectedProf = "";
		if (selectedProf == "") {
			selectedProf = "No profession selected";
		}
		frame.getContentPane().add(lblSelectedProfessionNone);
	}
}
