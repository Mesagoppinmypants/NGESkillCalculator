import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StartUpScreen {

	private JFrame frmNgeSkillCalculator;
	public String selectedProf;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartUpScreen window = new StartUpScreen();
					window.frmNgeSkillCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public StartUpScreen() {
		initialize();
	}
	
	public void initialize() {
		frmNgeSkillCalculator = new JFrame();
		frmNgeSkillCalculator.setTitle("NGE Skill Calculator");
		frmNgeSkillCalculator.setBounds(100, 100, 450, 300);
		frmNgeSkillCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNgeSkillCalculator.getContentPane().setLayout(null);
		
		JLabel lblHello = new JLabel("Welcome to the NGE Skill Calculator!");
		lblHello.setBounds(0, 0, 434, 19);
		lblHello.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblHello.setHorizontalAlignment(SwingConstants.CENTER);
		frmNgeSkillCalculator.getContentPane().add(lblHello);
		
		JLabel lblPleaseSelectA = new JLabel("Please select a profession to begin.");
		lblPleaseSelectA.setHorizontalAlignment(SwingConstants.CENTER);
		lblPleaseSelectA.setBounds(0, 69, 434, 14);
		frmNgeSkillCalculator.getContentPane().add(lblPleaseSelectA);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(160, 94, 114, 20);
		comboBox.addItem("Jedi");
		frmNgeSkillCalculator.getContentPane().add(comboBox);
		
		JButton btnSelect = new JButton("Select");
		btnSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedProf = (String) comboBox.getSelectedItem();
				if (selectedProf != null) {
					CalculatorSkills.NewScreen();
				}
				else
				{
					System.out.println("Please select a valid profession.");
				}
			}
		});
		btnSelect.setBounds(172, 125, 89, 23);
		frmNgeSkillCalculator.getContentPane().add(btnSelect);
	}
}
