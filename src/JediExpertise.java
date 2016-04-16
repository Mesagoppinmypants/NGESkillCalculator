import java.awt.EventQueue;

import javax.swing.JFrame;

public class JediExpertise {

	private JFrame frmJediExpertise;

	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JediExpertise window = new JediExpertise();
					window.frmJediExpertise.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JediExpertise() {
		initialize();
	}

	private void initialize() {
		frmJediExpertise = new JFrame();
		frmJediExpertise.setTitle("Jedi Expertise");
		frmJediExpertise.setBounds(100, 100, 700, 475);
		frmJediExpertise.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
