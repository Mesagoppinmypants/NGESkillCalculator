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
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.Color;

public class StartUpScreen {

	private JFrame frmNgeSkillCalculator;
	public String selectedProf;
	public String availableProfessions[] = {"Jedi", "Bounty Hunter"};

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
		frmNgeSkillCalculator.setIconImage(Toolkit.getDefaultToolkit().getImage(StartUpScreen.class.getResource("/icon/icon.png")));
		frmNgeSkillCalculator.setResizable(false);
		frmNgeSkillCalculator.setTitle("NGE Skill Calculator");
		frmNgeSkillCalculator.setBounds(100, 100, 450, 300);
		frmNgeSkillCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNgeSkillCalculator.getContentPane().setLayout(null);
		
		JLabel selectProfLabel = new JLabel("Please select a profession to begin.");
		selectProfLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		selectProfLabel.setForeground(new Color(0, 128, 128));
		selectProfLabel.setHorizontalAlignment(SwingConstants.CENTER);
		selectProfLabel.setBounds(0, 181, 434, 19);
		frmNgeSkillCalculator.getContentPane().add(selectProfLabel);
		
		JLabel welcomeLabel = new JLabel("Welcome to the NGE Skill Calculator!");
		welcomeLabel.setForeground(new Color(0, 128, 128));
		welcomeLabel.setBounds(0, 0, 434, 19);
		welcomeLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frmNgeSkillCalculator.getContentPane().add(welcomeLabel);
		
		
		JComboBox<?> comboBox = new JComboBox<Object>(availableProfessions);
		comboBox.setBounds(165, 206, 114, 20);
		frmNgeSkillCalculator.getContentPane().add(comboBox);
		
		JButton btnSelect = new JButton("Select");
		btnSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedProf = (String) comboBox.getSelectedItem();
				if (selectedProf == "Jedi") {
					JediExpertise.NewScreen();
				}
				else if (selectedProf == "Bounty Hunter") {
					JOptionPane.showMessageDialog(null, "The 'Bounty Hunter' skill expertise is currently not implemented.");
				}
				else if (selectedProf == null) {
					JOptionPane.showMessageDialog(null, "Please select a valid profession.");
				}
			}
		});
		btnSelect.setBounds(182, 237, 79, 23);
		frmNgeSkillCalculator.getContentPane().add(btnSelect);
		
		JLabel backgroundImageLabel = new JLabel("");
		backgroundImageLabel.setIcon(new ImageIcon(StartUpScreen.class.getResource("/icon/swg.jpg")));
		backgroundImageLabel.setBounds(0, 0, 444, 271);
		frmNgeSkillCalculator.getContentPane().add(backgroundImageLabel);
	}
}
