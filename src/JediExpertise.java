import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Image;
import java.awt.Color;
import java.awt.Label;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.Toolkit;

public class JediExpertise {

	private JFrame frmJediExpertise;
	private Label availablePointsLabel;
	
	private boolean addPoints = true;
	
	private int enhancedStr;
	private int enhancedCon;
	private int enhancedAgi;
	private int enhancedSta;
	private int availablePoints = 45;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	
	// Enhanced Strength
	Image imgStrSpent = new ImageIcon(this.getClass().getResource("/Jedi/First Row/Enhanced Strength/StrengthSpent.png")).getImage();
	Image imgStrAvail = new ImageIcon(this.getClass().getResource("/Jedi/First Row/Enhanced Strength/StrengthAvailable.png")).getImage();
	
	// Enhanced Constitution
	Image imgConSpent = new ImageIcon(this.getClass().getResource("/Jedi/First Row/Enhanced Constitution/ConSpent.png")).getImage();
	Image imgConSpentHover = new ImageIcon(this.getClass().getResource("/Jedi/First Row/Enhanced Constitution/ConSpentHover.png")).getImage();
	Image imgConAvail = new ImageIcon(this.getClass().getResource("/Jedi/First Row/Enhanced Constitution/ConAvailable.png")).getImage();
	Image imgConAvailHover = new ImageIcon(this.getClass().getResource("/Jedi/First Row/Enhanced Constitution/ConHover.png")).getImage();
	
	// Enhanced Agility
	Image imgAgiSpent = new ImageIcon(this.getClass().getResource("/Jedi/First Row/Enhanced Agility/AgilitySpent.png")).getImage();
	Image imgAgiAvail = new ImageIcon(this.getClass().getResource("/Jedi/First Row/Enhanced Agility/AgilityAvailable.png")).getImage();
	
	// Enhanced Stamina
	Image imgStaSpent = new ImageIcon(this.getClass().getResource("/Jedi/First Row/Enhanced Stamina/StaminaSpent.png")).getImage();
	Image imgStaAvail = new ImageIcon(this.getClass().getResource("/Jedi/First Row/Enhanced Stamina/StaminaAvailable.png")).getImage();

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
		frmJediExpertise.setIconImage(Toolkit.getDefaultToolkit().getImage(JediExpertise.class.getResource("/icon/icon.png")));
		frmJediExpertise.getContentPane().setBackground(new Color(0, 128, 128));
		frmJediExpertise.setResizable(false);
		frmJediExpertise.setTitle("Jedi Expertise Calculator");
		frmJediExpertise.setBounds(100, 100, 1080, 720);
		frmJediExpertise.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJediExpertise.getContentPane().setLayout(null);
		
		advancedStrength();
		advancedStamina();
		advancedAgility();
		advancedConstitution();
		availablePointsLabel();
		
		JRadioButton addRadioButton = new JRadioButton("");
		addRadioButton.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				addPoints = true;
			}
		});
		buttonGroup.add(addRadioButton);
		addRadioButton.setSelected(true);
		addRadioButton.setBounds(1000, 601, 21, 23);
		frmJediExpertise.getContentPane().add(addRadioButton);
		
		JRadioButton removeRadioButton = new JRadioButton("");
		removeRadioButton.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				addPoints = false;
			}
		});
		buttonGroup.add(removeRadioButton);
		removeRadioButton.setBounds(1000, 627, 21, 23);
		frmJediExpertise.getContentPane().add(removeRadioButton);
		
		Label addLabel = new Label("Add Points");
		addLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		addLabel.setBounds(929, 599, 65, 22);
		frmJediExpertise.getContentPane().add(addLabel);
		
		Label removeLabel = new Label("Remove Points");
		removeLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		removeLabel.setBounds(907, 627, 87, 22);
		frmJediExpertise.getContentPane().add(removeLabel);
		
		JLabel TooltipImg = new JLabel("");
		TooltipImg.setIcon(new ImageIcon(JediExpertise.class.getResource("/SkillBoxComponents/aSkillBox.jpg")));
		TooltipImg.setBounds(742, 53, 87, 87);
		frmJediExpertise.getContentPane().add(TooltipImg);
		
		JRadioButton generalRadioButton = new JRadioButton("");
		buttonGroup_1.add(generalRadioButton);
		generalRadioButton.setSelected(true);
		generalRadioButton.setBounds(116, 10, 21, 23);
		frmJediExpertise.getContentPane().add(generalRadioButton);
		
		JRadioButton pathRadioButton = new JRadioButton("");
		pathRadioButton.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (pathRadioButton.isSelected()) {
					// TODO: Implement Path Selection
					System.out.println("Debug: The Path part of the Jedi expertise is not implemented.");
				}
			}
		});
		buttonGroup_1.add(pathRadioButton);
		pathRadioButton.setBounds(206, 10, 21, 23);
		frmJediExpertise.getContentPane().add(pathRadioButton);
		
		JRadioButton beastMasteryRadioButton = new JRadioButton("");
		beastMasteryRadioButton.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (beastMasteryRadioButton.isSelected()) {
					// TODO: Implement Beast Mastery Selection
					System.out.println("Debug: The Beast Mastery part of the Jedi expertise is not implemented.");
				}
			}
		});
		buttonGroup_1.add(beastMasteryRadioButton);
		beastMasteryRadioButton.setBounds(368, 10, 21, 23);
		frmJediExpertise.getContentPane().add(beastMasteryRadioButton);
		
		Label generalLabel = new Label("Jedi General");
		generalLabel.setFont(new Font("Dialog", Font.BOLD, 15));
		generalLabel.setBounds(10, 10, 100, 22);
		frmJediExpertise.getContentPane().add(generalLabel);
		
		Label pathLabel = new Label("Path");
		pathLabel.setFont(new Font("Dialog", Font.BOLD, 15));
		pathLabel.setBounds(163, 10, 37, 22);
		frmJediExpertise.getContentPane().add(pathLabel);
		
		Label beastMasteryLabel = new Label("Beast Mastery");
		beastMasteryLabel.setFont(new Font("Dialog", Font.BOLD, 15));
		beastMasteryLabel.setBounds(256, 10, 106, 22);
		frmJediExpertise.getContentPane().add(beastMasteryLabel);
		
		Label skillNameLabel = new Label("Current Skill Name");
		skillNameLabel.setFont(new Font("Dialog", Font.BOLD, 20));
		skillNameLabel.setBounds(835, 82, 184, 22);
		frmJediExpertise.getContentPane().add(skillNameLabel);
		
		Label skillDescriptionLabel = new Label("Current skill description.");
		skillDescriptionLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		skillDescriptionLabel.setBounds(752, 146, 177, 22);
		frmJediExpertise.getContentPane().add(skillDescriptionLabel);
	}
	
	public void availablePointsLabel() {
		availablePointsLabel = new Label("Available Points: " + availablePoints);
		availablePointsLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		availablePointsLabel.setAlignment(Label.CENTER);
		availablePointsLabel.setBounds(907, 571, 115, 22);
		frmJediExpertise.getContentPane().add(availablePointsLabel);
	}
	
	public void advancedConstitution() {
		JLabel conImg = new JLabel("");
		conImg.setIcon(new ImageIcon(JediExpertise.class.getResource("/SkillBoxComponents/aSkillBox.jpg")));
		conImg.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (enhancedCon < 2 && addPoints) {
					availablePoints--;
					enhancedCon++;
					
					
					conImg.setIcon(new ImageIcon(imgConSpentHover));
				}
				else if (enhancedCon > 0 && !addPoints) {
					availablePoints++;
					enhancedCon--;
					
					if (enhancedCon == 0) {
						
						conImg.setIcon(new ImageIcon(imgConAvail));
					}
				}
				setAvailablePoints();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				if (enhancedCon > 0) {
					conImg.setIcon(new ImageIcon(imgConSpentHover));
				}
				else {
					conImg.setIcon(new ImageIcon(imgConAvailHover));
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				if (enhancedCon > 0) {
					conImg.setIcon(new ImageIcon(imgConSpent));
				}
				else {
					conImg.setIcon(new ImageIcon(imgConAvail));
				}
			}
		});
		if (enhancedCon == 0) {
			conImg.setIcon(new ImageIcon(imgConAvail));
		}
		conImg.setBounds(240, 110, 87, 87);
		frmJediExpertise.getContentPane().add(conImg);
	}
	
	public void advancedStamina() {
		JLabel staImg = new JLabel("");
		staImg.setIcon(new ImageIcon(JediExpertise.class.getResource("/SkillBoxComponents/aSkillBox.jpg")));
		staImg.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (enhancedSta < 2 && addPoints) {
					availablePoints--;
					enhancedSta++;
					staImg.setIcon(new ImageIcon(imgStaSpent));
				}
				else if (enhancedSta > 0 && !addPoints) {
					availablePoints++;
					enhancedSta--;
					
					if (enhancedSta == 0) {
						staImg.setIcon(new ImageIcon(imgStaAvail));
					}
				}
				setAvailablePoints();
			}
		});
		if (enhancedSta == 0) {
			staImg.setIcon(new ImageIcon(imgStaAvail));
		}
		staImg.setBounds(330, 110, 87, 87);
		frmJediExpertise.getContentPane().add(staImg);
	}
	
	public void advancedAgility() {
		JLabel agiImg = new JLabel("");
		agiImg.setIcon(new ImageIcon(JediExpertise.class.getResource("/SkillBoxComponents/aSkillBox.jpg")));
		agiImg.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (enhancedAgi < 2 && addPoints) {
					availablePoints--;
					enhancedAgi++;
					agiImg.setIcon(new ImageIcon(imgAgiSpent));
				}
				else if (enhancedAgi > 0 && !addPoints) {
					availablePoints++;
					enhancedAgi--;
					
					if (enhancedAgi == 0) {
						agiImg.setIcon(new ImageIcon(imgAgiAvail));
					}
				}
				setAvailablePoints();
			}
		});
		if (enhancedAgi == 0) {
			agiImg.setIcon(new ImageIcon(imgAgiAvail));
		}
		agiImg.setBounds(420, 110, 87, 87);
		frmJediExpertise.getContentPane().add(agiImg);
	}
	
	public void advancedStrength() {
		JLabel strImg = new JLabel("");
		strImg.setIcon(new ImageIcon(JediExpertise.class.getResource("/SkillBoxComponents/aSkillBox.jpg")));
		strImg.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (enhancedStr < 2 && addPoints) {
					availablePoints--;
					enhancedStr++;
				}
				else if (enhancedStr > 0 && !addPoints) {
					availablePoints++;
					enhancedStr--;
				}
				setAvailablePoints();
			}
		});
		if (enhancedStr == 0) {
			strImg.setIcon(new ImageIcon(imgStrAvail));
		}
		strImg.setBounds(150, 110, 87, 87);
		frmJediExpertise.getContentPane().add(strImg);
	}
	
	private void setAvailablePoints() {
		if (availablePointsLabel.getText() != "Available Points: " + availablePoints) {
			availablePointsLabel.setText("Available Points: " + availablePoints);
		}
	}
}
