import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTable;

public class StartUpScreen {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartUpScreen window = new StartUpScreen();
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
	public StartUpScreen() {
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
		
		JLabel lblHello = new JLabel("Welcome to the NGE Skill Calculator!");
		lblHello.setBounds(0, 0, 434, 19);
		lblHello.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblHello.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblHello);
		
		JLabel lblPleaseSelectA = new JLabel("Please select a profession to begin.");
		lblPleaseSelectA.setHorizontalAlignment(SwingConstants.CENTER);
		lblPleaseSelectA.setBounds(0, 69, 434, 14);
		frame.getContentPane().add(lblPleaseSelectA);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(160, 94, 114, 20);
		frame.getContentPane().add(comboBox);
		AddComboBoxElements();
	}
	
	private void AddComboBoxElements() {
		System.out.println("Hello, this is a test.");
	}
}
