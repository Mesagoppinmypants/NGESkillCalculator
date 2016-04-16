import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Image;
import java.awt.Color;
import java.awt.Label;
import java.awt.Font;

public class JediExpertise {

	private JFrame frmJediExpertise;
	
	private int enhancedStr;
	private int enhancedCon;
	private int enhancedAgi;
	private int enhancedSta;
	private int availablePoints = 45;

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
		frmJediExpertise.getContentPane().setBackground(new Color(0, 128, 128));
		frmJediExpertise.setResizable(false);
		frmJediExpertise.setTitle("Jedi Expertise Calculator");
		frmJediExpertise.setBounds(100, 100, 1080, 720);
		frmJediExpertise.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJediExpertise.getContentPane().setLayout(null);
		
		JLabel strImg = new JLabel("");
		if (enhancedStr == 0) {
			Image imgStr = new ImageIcon(this.getClass().getResource("/Jedi/First Row/Enhanced Strength/StrengthAvailable.png")).getImage();
			strImg.setIcon(new ImageIcon(imgStr));
		}
		strImg.setBounds(145, 43, 87, 87);
		frmJediExpertise.getContentPane().add(strImg);
		
		JLabel conImg = new JLabel("");
		if (enhancedCon == 0) {
			Image imgCon = new ImageIcon(this.getClass().getResource("/Jedi/First Row/Enhanced Constitution/ConAvailable.png")).getImage();
			conImg.setIcon(new ImageIcon(imgCon));
		}
		conImg.setBounds(377, 43, 87, 87);
		frmJediExpertise.getContentPane().add(conImg);
		
		JLabel agiImg = new JLabel("");
		if (enhancedAgi == 0) {
			Image imgAgi = new ImageIcon(this.getClass().getResource("/Jedi/First Row/Enhanced Agility/AgilityAvailable.png")).getImage();
			agiImg.setIcon(new ImageIcon(imgAgi));
		}
		agiImg.setBounds(609, 43, 87, 87);
		frmJediExpertise.getContentPane().add(agiImg);
		
		JLabel staImg = new JLabel("");
		if (enhancedSta == 0) {
			Image imgSta = new ImageIcon(this.getClass().getResource("/Jedi/First Row/Enhanced Stamina/StaminaAvailable.png")).getImage();
			staImg.setIcon(new ImageIcon(imgSta));
		}
		staImg.setBounds(841, 43, 87, 87);
		frmJediExpertise.getContentPane().add(staImg);
		
		Label label = new Label("Available Points: 45");
		label.setFont(new Font("Dialog", Font.BOLD, 12));
		label.setAlignment(Label.CENTER);
		label.setBounds(10, 10, 115, 22);
		frmJediExpertise.getContentPane().add(label);
	}
}
