package spaceExplorer;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.w3c.dom.ranges.Range;

import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import javax.swing.SpringLayout;
import javax.swing.JList;
import javax.swing.JProgressBar;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.ListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JToggleButton;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JSplitPane;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.ImageIcon;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;

public class MainGame extends JFrame {

	private JPanel contentPane;
	private String MemberName;
	public LinkedList<JButton> linkedList = new LinkedList<JButton>();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGame frame = new MainGame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the frame.
	 */
	public MainGame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 50, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCrew = new JLabel("Crew Members");
		lblCrew.setBounds(64, 53, 237, 25);
		lblCrew.setHorizontalAlignment(SwingConstants.CENTER);
		lblCrew.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(lblCrew);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(307, 78, 16, 219);
		separator.setOrientation(SwingConstants.VERTICAL);
		contentPane.add(separator);
		
		JLabel lblCharacterInfo = new JLabel("Member Status");
		lblCharacterInfo.setBounds(319, 53, 237, 25);
		lblCharacterInfo.setToolTipText("");
		lblCharacterInfo.setHorizontalAlignment(SwingConstants.CENTER);
		lblCharacterInfo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(lblCharacterInfo);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(64, 106, 237, 40);
		btnNewButton.setToolTipText("Click to see info.");
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("");
		button.setBounds(64, 152, 237, 40);
		button.setToolTipText("Click to see info.");
		contentPane.add(button);
		
		JButton button_1 = new JButton("");
		button_1.setBounds(64, 198, 237, 40);
		button_1.setToolTipText("Click to see info.");
		contentPane.add(button_1);		
		
		JButton button_2 = new JButton("");
		button_2.setToolTipText("Click to see info.");
		button_2.setBounds(64, 244, 237, 40);
		contentPane.add(button_2);
		
		JLabel lblShipStatus = new JLabel("");
		lblShipStatus.setBounds(181, 308, 268, 39);
		lblShipStatus.setHorizontalAlignment(SwingConstants.CENTER);
		lblShipStatus.setFont(new Font("Palatino Linotype", Font.PLAIN, 25));
		contentPane.add(lblShipStatus);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(163, 341, 304, 25);
		progressBar.setStringPainted(true);
		progressBar.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		progressBar.setToolTipText("Ship status.");
		progressBar.setForeground(new Color(144, 238, 144));
		progressBar.setBackground(new Color(100, 149, 237));
		contentPane.add(progressBar);
		
		JLabel lblHealth = new JLabel("HEALTH");
		lblHealth.setBounds(323, 134, 117, 25);
		contentPane.add(lblHealth);
		
		JProgressBar progressBar_1 = new JProgressBar();
		progressBar_1.setName("");
		progressBar_1.setBounds(410, 134, 171, 25);
		progressBar_1.setToolTipText("");
		progressBar_1.setForeground(new Color(127, 255, 0));
		progressBar_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		progressBar_1.setBackground(UIManager.getColor("ProgressBar.background"));
		contentPane.add(progressBar_1);
		
		JLabel lblTiredness = new JLabel("TIREDNESS");
		lblTiredness.setBounds(323, 180, 84, 25);
		contentPane.add(lblTiredness);
		
		JProgressBar progressBar_2 = new JProgressBar();
		progressBar_2.setToolTipText("");
		progressBar_2.setForeground(new Color(255, 215, 0));
		progressBar_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		progressBar_2.setBackground(UIManager.getColor("ProgressBar.background"));
		progressBar_2.setBounds(410, 180, 171, 25);
		contentPane.add(progressBar_2);
		
		JLabel lblHunger = new JLabel("HUNGER");
		lblHunger.setBounds(323, 226, 84, 25);
		contentPane.add(lblHunger);
		
		JProgressBar progressBar_3 = new JProgressBar();
		progressBar_3.setToolTipText("");
		progressBar_3.setForeground(new Color(255, 215, 0));
		progressBar_3.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		progressBar_3.setBackground(new Color(255, 255, 255));
		progressBar_3.setBounds(410, 226, 171, 25);
		contentPane.add(progressBar_3);
		
		JButton btnNewButton_1 = new JButton("Day");
		btnNewButton_1.setFont(new Font("Agency FB", Font.BOLD, 28));
		btnNewButton_1.setBounds(911, 610, 334, 53);
		contentPane.add(btnNewButton_1);
		
		JPanel panel = new JPanel();
		panel.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setBounds(598, 308, 299, 355);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnEat = new JButton("Use Items");							//btnEat  btnSleep  btnRepairShip  btnLoot  btnExplorePlanet
		btnEat.setEnabled(false);
		btnEat.setBounds(59, 27, 181, 38);
		panel.add(btnEat);
		
		JButton btnSleep = new JButton("Sleep");
		btnSleep.setEnabled(false);
		btnSleep.setBounds(59, 92, 181, 38);
		panel.add(btnSleep);
		
		JButton btnRepairShip = new JButton("Repair ship");
		btnRepairShip.setEnabled(false);
		btnRepairShip.setBounds(59, 157, 181, 38);
		panel.add(btnRepairShip);
		
		JButton btnExplorePlanet = new JButton("Explore new planet");
		btnExplorePlanet.setEnabled(false);
		btnExplorePlanet.setBounds(59, 287, 181, 38);
		panel.add(btnExplorePlanet);
		
		JButton btnLoot = new JButton("Loot");
		btnLoot.setEnabled(false);
		btnLoot.setBounds(59, 222, 181, 38);
		panel.add(btnLoot);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_1.setBounds(64, 461, 522, 202);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblInventory = new JLabel("Inventory");
		lblInventory.setFont(new Font("Roboto", Font.BOLD, 20));
		lblInventory.setBounds(194, 11, 104, 24);
		panel_1.add(lblInventory);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(10, 51, 89, 23);
		panel_1.add(btnNewButton_2);
		
		JLabel lblMoney = new JLabel("Money: $" + GameEnvironment.money);
		lblMoney.setHorizontalAlignment(SwingConstants.CENTER);
		lblMoney.setFont(new Font("Palatino Linotype", Font.PLAIN, 25));
		lblMoney.setBounds(64, 395, 207, 39);
		contentPane.add(lblMoney);
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon("C:\\Users\\Ashan Perera\\Downloads\\rsz_kissclipart-cartoon-space-suit-png-clipart-astronaut-space-sui-a3c7a6be6ef12bb3.png"));
		label.setBounds(684, 31, 127, 146);
		contentPane.add(label);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("Actions");
		tglbtnNewToggleButton.setBounds(659, 231, 177, 53);
		contentPane.add(tglbtnNewToggleButton);
		
		JLabel lblMembername = new JLabel("");
		lblMembername.setVerticalAlignment(SwingConstants.BOTTOM);
		lblMembername.setFont(new Font("Palatino Linotype", Font.BOLD, 20));
		lblMembername.setHorizontalAlignment(SwingConstants.CENTER);
		lblMembername.setBounds(637, 180, 224, 40);
		contentPane.add(lblMembername);
		
		
		/*
		 * ship name and ship health bar
		 * 
		 */
		lblShipStatus.setText(CrewInfo.ShipName + " Health");
		progressBar.setValue(CrewInfo.ShipHealth);
		
		
		/*
		 * setting up game environment
		 */
		CrewInfo crewinfo = new CrewInfo();
		crewinfo.addMember(spaceExplorer.Type.TYPE1, "MECHANIC");
		crewinfo.addMember(spaceExplorer.Type.TYPE2, "LIFELINE");
		crewinfo.addMember(spaceExplorer.Type.TYPE3, "SKINNY");
		crewinfo.addMember(spaceExplorer.Type.TYPE4, "TRACKER");
		
		if (GameEnvironment.NumberOfDays == 0) {						//default number of days for testing
			GameEnvironment.NumberOfDays = 5;
		}
		
		if (GameEnvironment.pieces == 0) {								//default pieces
			GameEnvironment.pieces = 3;
		}
		
		if (GameEnvironment.money == 0) {								//default Money
			GameEnvironment.money = 100;
			lblMoney.setText("Money: $" + GameEnvironment.money);
		}
		
		GameEnvironment.actions = crewinfo.CrewList.size() * 2;
		
		
		/*
		 * 
		 * adding crew member to buttons
		 * 
		 */
		int crewNum = 0;
		for (CrewMember i : crewinfo.getCrewList() ) {
			MemberName = i.getName();
			if (i.easterEgg) {
				i.ability = "SKINNY FOR A REASON";
			}
			
			if (crewNum == 0) {
				btnNewButton.setText(MemberName);
				btnNewButton.setToolTipText("Ability: " + i.ability);
//				if (i.NumberOfMoves == 0) {
//					btnNewButton.setEnabled(false);
//					btnNewButton.revalidate();
//					btnNewButton.repaint();
//				}
				
				//add buttons to a list
				linkedList.add(btnNewButton);
				
			}
			
			if (crewNum == 1) {
				button.setText(MemberName);
				button.setToolTipText("Ability: " + i.ability);
				
				//add buttons to a list
				linkedList.add(button);
			}
			
			if (crewNum == 2) {
				button_1.setText(MemberName);			
				button_1.setToolTipText("Ability: " + i.ability);
				
				//add buttons to a list
				linkedList.add(button_1);
			}
			
			if (crewNum == 3) {
				button_2.setText(MemberName);
				button_2.setToolTipText("Ability: " + i.ability);
				
				//add buttons to a list
				linkedList.add(button_2);
			}
			
			crewNum += 1;
		}
		
		
		/*
		 * 
		 * setting actions
		 * 
		 */
		tglbtnNewToggleButton.setEnabled(false);
		
		JLabel lblShipPieces = new JLabel("Ship Pieces: 0");
		lblShipPieces.setHorizontalAlignment(SwingConstants.CENTER);
		lblShipPieces.setFont(new Font("Palatino Linotype", Font.PLAIN, 25));
		lblShipPieces.setBounds(291, 395, 268, 39);
		contentPane.add(lblShipPieces);
		tglbtnNewToggleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tglbtnNewToggleButton.isSelected()) {						//ENABLE btnEat  btnSleep  btnRepairShip  btnLoot  btnExplorePlanet
//					System.out.println("A");
					btnEat.setEnabled(true);
					btnSleep.setEnabled(true);
					btnRepairShip.setEnabled(true);
					btnLoot.setEnabled(true);
					btnExplorePlanet.setEnabled(true);
				} else {
//					System.out.println("B");
					btnEat.setEnabled(false);
					btnSleep.setEnabled(false);
					btnRepairShip.setEnabled(false);
					btnLoot.setEnabled(false);
					btnExplorePlanet.setEnabled(false);
				}
			}
		});
				
		
		/*
		 * 
		 * Member info
		 * 
		 */
		btnNewButton.addActionListener(new ActionListener() {					//set progress bars
			public void actionPerformed(ActionEvent e) {
				CrewMember s = crewinfo.CrewList.get(0);
				progressBar_1.setValue(s.health);
				progressBar_1.setStringPainted(true);
				
				progressBar_2.setValue(s.tiredness);
				progressBar_2.setStringPainted(true);
				
				progressBar_3.setValue(s.hunger);
				progressBar_3.setStringPainted(true);
				
				lblMembername.setText(s.name);
				tglbtnNewToggleButton.setText("Actions    X " + s.NumberOfMoves);
				if (s.NumberOfMoves > 0) {
					tglbtnNewToggleButton.setEnabled(true);
				} else {
					tglbtnNewToggleButton.setEnabled(false);
				}
				
				GameEnvironment.currentplayer = 0;
			}
		});
		
		if (crewNum >= 2) {
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					CrewMember j = crewinfo.CrewList.get(1);
					progressBar_1.setValue(j.health);
					progressBar_1.setStringPainted(true);
					progressBar_1.repaint();
					
					progressBar_2.setValue(j.tiredness);
					progressBar_2.setStringPainted(true);
					progressBar_2.repaint();
					
					progressBar_3.setValue(j.hunger);
					progressBar_3.setStringPainted(true);
					progressBar_3.repaint();
					
					lblMembername.setText(j.name);
					tglbtnNewToggleButton.setText("Actions    X " + j.NumberOfMoves);
					if (j.NumberOfMoves > 0) {
						tglbtnNewToggleButton.setEnabled(true);
					} else {
						tglbtnNewToggleButton.setEnabled(false);
					}
					
					GameEnvironment.currentplayer = 1;
				}
			});
		}
		
		if (crewNum >= 3) {
			button_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					CrewMember k = crewinfo.CrewList.get(2);
					progressBar_1.setValue(k.health);
					progressBar_1.setStringPainted(true);
					
					progressBar_2.setValue(k.tiredness);
					progressBar_2.setStringPainted(true);
					
					progressBar_3.setValue(k.hunger);
					progressBar_3.setStringPainted(true);
					
					lblMembername.setText(k.name);
					tglbtnNewToggleButton.setText("Actions    X " + k.NumberOfMoves);
					if (k.NumberOfMoves > 0) {
						tglbtnNewToggleButton.setEnabled(true);
					} else {
						tglbtnNewToggleButton.setEnabled(false);
					}
					
					GameEnvironment.currentplayer = 2;
				}
			});
		}
		
		if (crewNum >= 4) {
			button_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					CrewMember k = crewinfo.CrewList.get(3);
					progressBar_1.setValue(k.health);
					progressBar_1.setStringPainted(true);
					
					progressBar_2.setValue(k.tiredness);
					progressBar_2.setStringPainted(true);
					
					progressBar_3.setValue(k.hunger);
					progressBar_3.setStringPainted(true);
					
					lblMembername.setText(k.name);
					tglbtnNewToggleButton.setText("Actions    X " + k.NumberOfMoves);
					if (k.NumberOfMoves > 0) {
						tglbtnNewToggleButton.setEnabled(true);
					} else {
						tglbtnNewToggleButton.setEnabled(false);
					}
					
					GameEnvironment.currentplayer = 3;
				}
			});
		}
		
		
		
		/*
		 * 
		 * disable if no moves left in any members
		 * 		
		 */
		if (GameEnvironment.actions <= 0) {
			tglbtnNewToggleButton.setEnabled(false);
		}
		
		/*
		 * 
		 * USE ITEMS FROM THE INVENTORY
		 * 
		 */
		btnEat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (crewinfo.CrewList.get(GameEnvironment.currentplayer).NumberOfMoves > 0) {
//					textPane.se
					crewinfo.CrewList.get(GameEnvironment.currentplayer).NumberOfMoves -= 1;
				}
				tglbtnNewToggleButton.setText("Actions    X " + crewinfo.CrewList.get(GameEnvironment.currentplayer).NumberOfMoves);
				
				//Disable actions after number of moves == 0
				if (crewinfo.CrewList.get(GameEnvironment.currentplayer).NumberOfMoves == 0) {
					btnEat.setEnabled(false);
					btnSleep.setEnabled(false);
					btnRepairShip.setEnabled(false);
					btnLoot.setEnabled(false);
					btnExplorePlanet.setEnabled(false);
					tglbtnNewToggleButton.setSelected(false);
					tglbtnNewToggleButton.setEnabled(false);
					
//					for (JButton i: linkedList) {
//						if (GameEnvironment.currentplayer == linkedList.indexOf(i)) {
//							i.setEnabled(false);
//							i.revalidate();
//							i.repaint();
//						}
//					}
					
					
				}
				tglbtnNewToggleButton.revalidate();
				tglbtnNewToggleButton.repaint();
			}
		});
		
//		if (crewinfo.CrewList.get(GameEnvironment.currentplayer).NumberOfMoves == 0) {
//			btnNewButton.setEnabled(false);
//			tglbtnNewToggleButton.setEnabled(false);
//			btnNewButton.revalidate();
//			btnNewButton.repaint();
//			btnNewButton.getText();
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * 
		 * Next day
		 * 
		 */
		btnNewButton_1.setText(GameEnvironment.NumberOfDays + " Days Remaining");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				if (GameEnvironment.NumberOfDays != 0) {					//Next day
					for (CrewMember i : crewinfo.getCrewList()) {
						
						//decrease health over time 
						i.health -= (Math.random() * ((4 - 1) + 1)) + 1;
						i.tiredness += (Math.random() * ((25 - 5) + 1)) + 2;
						i.hunger += (Math.random() * ((30 - 15) + 1)) + 15;
						
						progressBar_1.setValue(i.health);
						progressBar_2.setValue(i.tiredness);
						progressBar_3.setValue(i.hunger);
						
						//reset number of moves
						i.NumberOfMoves = 2;
						for (JButton j: linkedList) {
							j.setEnabled(true);
							j.revalidate();
							j.repaint();
						}
						
					}
				} else if (GameEnvironment.NumberOfDays == 0) {				//Game finishing
					GameOver gameover = new GameOver();
					gameover.setVisible(true);
					setVisible(false);
				}
				
				GameEnvironment.NumberOfDays -= 1;							//Decrease number of days
				if (GameEnvironment.NumberOfDays > 1) {
					btnNewButton_1.setText(" " + GameEnvironment.NumberOfDays + " Days remaining ");
				} else if(GameEnvironment.NumberOfDays == 1) {
					btnNewButton_1.setText(" " + GameEnvironment.NumberOfDays + " Day remaining ");
				} else {
					btnNewButton_1.setText(" Finish ");
				}
				btnNewButton_1.revalidate();
				btnNewButton_1.repaint();
			}
		});
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
