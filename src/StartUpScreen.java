import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
		frmNgeSkillCalculator.setResizable(false);
		frmNgeSkillCalculator.setTitle("NGE Skill Calculator");
		frmNgeSkillCalculator.setBounds(100, 100, 450, 300);
		frmNgeSkillCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNgeSkillCalculator.getContentPane().setLayout(null);
		
		JLabel welcomeLabel = new JLabel("Welcome to the NGE Skill Calculator!");
		welcomeLabel.setBounds(0, 0, 434, 19);
		welcomeLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frmNgeSkillCalculator.getContentPane().add(welcomeLabel);
		
		JLabel selectProfLabel = new JLabel("Please select a profession to begin.");
		selectProfLabel.setHorizontalAlignment(SwingConstants.CENTER);
		selectProfLabel.setBounds(0, 69, 434, 14);
		frmNgeSkillCalculator.getContentPane().add(selectProfLabel);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(160, 94, 114, 20);
		comboBox.addItem("Jedi");
		frmNgeSkillCalculator.getContentPane().add(comboBox);
		
		JButton btnSelect = new JButton("Select");
		btnSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedProf = (String) comboBox.getSelectedItem();
				if (selectedProf == "Jedi") {
					JediExpertise.NewScreen();
				}
				else if (selectedProf == null) {
					JOptionPane.showMessageDialog(null, "Please select a valid profession.");
				}
			}
		});
		btnSelect.setBounds(182, 125, 79, 23);
		frmNgeSkillCalculator.getContentPane().add(btnSelect);
	}
}
