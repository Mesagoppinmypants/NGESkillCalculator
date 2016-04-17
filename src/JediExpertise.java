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
import javax.swing.SwingConstants;

public class JediExpertise {

	private JFrame frmJediExpertise;
	private Label availablePointsLabel;
	private Label skillNameLabel;
	private Label skillDescriptionLabel;
	private JLabel strAmountLabel;
	
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
		frmJediExpertise.getContentPane().setBackground(new Color(15, 32, 32));
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
		addRadioButton.setBounds(863, 627, 21, 23);
		frmJediExpertise.getContentPane().add(addRadioButton);
		
		JRadioButton removeRadioButton = new JRadioButton("");
		removeRadioButton.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				addPoints = false;
			}
		});
		buttonGroup.add(removeRadioButton);
		removeRadioButton.setBounds(983, 627, 21, 23);
		frmJediExpertise.getContentPane().add(removeRadioButton);
		
		Label addLabel = new Label("Add Points");
		addLabel.setForeground(Color.WHITE);
		addLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		addLabel.setBounds(792, 628, 65, 22);
		frmJediExpertise.getContentPane().add(addLabel);
		
		Label removeLabel = new Label("Remove Points");
		removeLabel.setForeground(Color.WHITE);
		removeLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		removeLabel.setBounds(890, 627, 87, 22);
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
		generalLabel.setForeground(Color.WHITE);
		generalLabel.setAlignment(Label.CENTER);
		generalLabel.setFont(new Font("Dialog", Font.BOLD, 15));
		generalLabel.setBounds(10, 10, 100, 22);
		frmJediExpertise.getContentPane().add(generalLabel);
		
		Label pathLabel = new Label("Path");
		pathLabel.setForeground(Color.WHITE);
		pathLabel.setAlignment(Label.CENTER);
		pathLabel.setFont(new Font("Dialog", Font.BOLD, 15));
		pathLabel.setBounds(163, 10, 37, 22);
		frmJediExpertise.getContentPane().add(pathLabel);
		
		Label beastMasteryLabel = new Label("Beast Mastery");
		beastMasteryLabel.setForeground(Color.WHITE);
		beastMasteryLabel.setAlignment(Label.CENTER);
		beastMasteryLabel.setFont(new Font("Dialog", Font.BOLD, 15));
		beastMasteryLabel.setBounds(256, 10, 106, 22);
		frmJediExpertise.getContentPane().add(beastMasteryLabel);
		
		skillNameLabel = new Label("Current Skill Name");
		skillNameLabel.setForeground(new Color(227, 199, 106));
		skillNameLabel.setFont(new Font("Dialog", Font.BOLD, 20));
		skillNameLabel.setBounds(835, 82, 229, 22);
		frmJediExpertise.getContentPane().add(skillNameLabel);
		
		skillDescriptionLabel = new Label("Current skill description.");
		skillDescriptionLabel.setForeground(new Color(227, 199, 106));
		skillDescriptionLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		skillDescriptionLabel.setBounds(752, 146, 312, 22);
		frmJediExpertise.getContentPane().add(skillDescriptionLabel);
		
		Label requiresLabel = new Label("Requires: None");
		requiresLabel.setForeground(Color.WHITE);
		requiresLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		requiresLabel.setBounds(752, 197, 93, 23);
		frmJediExpertise.getContentPane().add(requiresLabel);
		
		Label rankLabel = new Label("Rank: 0/2");
		rankLabel.setForeground(Color.WHITE);
		rankLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		rankLabel.setBounds(752, 247, 69, 23);
		frmJediExpertise.getContentPane().add(rankLabel);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(JediExpertise.class.getResource("/SkillBoxComponents/aSkillBox.jpg")));
		label_2.setBounds(411, 197, 87, 87);
		frmJediExpertise.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(JediExpertise.class.getResource("/SkillBoxComponents/aSkillBox.jpg")));
		label_3.setBounds(324, 197, 87, 87);
		frmJediExpertise.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(JediExpertise.class.getResource("/SkillBoxComponents/aSkillBox.jpg")));
		label_4.setBounds(237, 197, 87, 87);
		frmJediExpertise.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon(JediExpertise.class.getResource("/SkillBoxComponents/aSkillBox.jpg")));
		label_5.setBounds(63, 197, 87, 87);
		frmJediExpertise.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon(JediExpertise.class.getResource("/SkillBoxComponents/aSkillBox.jpg")));
		label_6.setBounds(411, 284, 87, 87);
		frmJediExpertise.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("");
		label_7.setIcon(new ImageIcon(JediExpertise.class.getResource("/SkillBoxComponents/aSkillBox.jpg")));
		label_7.setBounds(324, 284, 87, 87);
		frmJediExpertise.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("");
		label_8.setIcon(new ImageIcon(JediExpertise.class.getResource("/SkillBoxComponents/aSkillBox.jpg")));
		label_8.setBounds(237, 284, 87, 87);
		frmJediExpertise.getContentPane().add(label_8);
		
		JLabel label_9 = new JLabel("");
		label_9.setIcon(new ImageIcon(JediExpertise.class.getResource("/SkillBoxComponents/aSkillBox.jpg")));
		label_9.setBounds(150, 284, 87, 87);
		frmJediExpertise.getContentPane().add(label_9);
		
		JLabel label_10 = new JLabel("");
		label_10.setIcon(new ImageIcon(JediExpertise.class.getResource("/SkillBoxComponents/aSkillBox.jpg")));
		label_10.setBounds(63, 284, 87, 87);
		frmJediExpertise.getContentPane().add(label_10);
		
		JLabel label_11 = new JLabel("");
		label_11.setIcon(new ImageIcon(JediExpertise.class.getResource("/SkillBoxComponents/aSkillBox.jpg")));
		label_11.setBounds(63, 371, 87, 87);
		frmJediExpertise.getContentPane().add(label_11);
		
		JLabel label_12 = new JLabel("");
		label_12.setIcon(new ImageIcon(JediExpertise.class.getResource("/SkillBoxComponents/aSkillBox.jpg")));
		label_12.setBounds(150, 371, 87, 87);
		frmJediExpertise.getContentPane().add(label_12);
		
		JLabel label_13 = new JLabel("");
		label_13.setIcon(new ImageIcon(JediExpertise.class.getResource("/SkillBoxComponents/aSkillBox.jpg")));
		label_13.setBounds(324, 371, 87, 87);
		frmJediExpertise.getContentPane().add(label_13);
		
		JLabel label_14 = new JLabel("");
		label_14.setIcon(new ImageIcon(JediExpertise.class.getResource("/SkillBoxComponents/aSkillBox.jpg")));
		label_14.setBounds(63, 458, 87, 87);
		frmJediExpertise.getContentPane().add(label_14);
		
		JLabel label_15 = new JLabel("");
		label_15.setIcon(new ImageIcon(JediExpertise.class.getResource("/SkillBoxComponents/aSkillBox.jpg")));
		label_15.setBounds(150, 458, 87, 87);
		frmJediExpertise.getContentPane().add(label_15);
		
		JLabel label_16 = new JLabel("");
		label_16.setIcon(new ImageIcon(JediExpertise.class.getResource("/SkillBoxComponents/aSkillBox.jpg")));
		label_16.setBounds(237, 458, 87, 87);
		frmJediExpertise.getContentPane().add(label_16);
		
		JLabel label_17 = new JLabel("");
		label_17.setIcon(new ImageIcon(JediExpertise.class.getResource("/SkillBoxComponents/aSkillBox.jpg")));
		label_17.setBounds(324, 458, 87, 87);
		frmJediExpertise.getContentPane().add(label_17);
		
		Label requiredLevelLabel = new Label("Required Level: 10");
		requiredLevelLabel.setForeground(new Color(255, 255, 0));
		requiredLevelLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		requiredLevelLabel.setAlignment(Label.CENTER);
		requiredLevelLabel.setBounds(835, 569, 115, 22);
		frmJediExpertise.getContentPane().add(requiredLevelLabel);
	}
	
	public void availablePointsLabel() {
		availablePointsLabel = new Label("Available Points: " + availablePoints);
		availablePointsLabel.setForeground(new Color(255, 255, 0));
		availablePointsLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		availablePointsLabel.setAlignment(Label.CENTER);
		availablePointsLabel.setBounds(835, 597, 115, 22);
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
				skillNameLabel.setText("Enhanced Constitution");
				skillDescriptionLabel.setText("Constitution increased by 25 points per point spent.");
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
		conImg.setBounds(237, 110, 87, 87);
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
		staImg.setBounds(324, 110, 87, 87);
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
		agiImg.setBounds(411, 110, 87, 87);
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
					strAmountLabel.setVisible(true);	
				}
				else if (enhancedStr > 0 && !addPoints) {
					availablePoints++;
					enhancedStr--;
				}
				setAvailablePoints();
				if (enhancedStr == 0) {
					strAmountLabel.setVisible(false);
				}
				else if (enhancedStr == 1) {
					strAmountLabel.setVisible(true);
					strAmountLabel.setIcon(new ImageIcon(JediExpertise.class.getResource("/SkillBoxComponents/skillpoints1.jpg")));
				}
				else if (enhancedStr == 2) {
					strAmountLabel.setVisible(true);
					strAmountLabel.setIcon(new ImageIcon(JediExpertise.class.getResource("/SkillBoxComponents/skillpoints2.jpg")));
				}
			}
		});
		if (enhancedStr == 0) {
			strImg.setIcon(new ImageIcon(imgStrAvail));
		}
		
		strAmountLabel = new JLabel("");
		strAmountLabel.setHorizontalAlignment(SwingConstants.CENTER);
		strAmountLabel.setVisible(false);
		strAmountLabel.setIcon(new ImageIcon(JediExpertise.class.getResource("/SkillBoxComponents/skillpoints1.jpg")));
		strAmountLabel.setBounds(213, 173, 24, 24);
		frmJediExpertise.getContentPane().add(strAmountLabel);
		strImg.setBounds(150, 110, 87, 87);
		frmJediExpertise.getContentPane().add(strImg);
	}
	
	private void setAvailablePoints() {
		if (availablePointsLabel.getText() != "Available Points: " + availablePoints) {
			availablePointsLabel.setText("Available Points: " + availablePoints);
		}
	}
	public Color getFrmJediExpertiseContentPaneBackground() {
		return frmJediExpertise.getContentPane().getBackground();
	}
	public void setFrmJediExpertiseContentPaneBackground(Color background) {
		frmJediExpertise.getContentPane().setBackground(background);
	}
}
