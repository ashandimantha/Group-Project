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
import java.awt.Cursor;
import java.awt.ComponentOrientation;
import javax.swing.border.MatteBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import java.awt.Dimension;

public class MainGame extends JFrame {

	private JPanel contentPane;
	private String MemberName;
	public LinkedList<JButton> btnFoodList = new LinkedList<JButton>();				
	public LinkedList<JButton> btnMedList = new LinkedList<JButton>();
	public LinkedList<JLabel> lblItemCountList = new LinkedList<JLabel>();			//food item count list
	public LinkedList<JLabel> lblItemCountList2 = new LinkedList<JLabel>();			//Med item count list
	
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
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCrew = new JLabel("Crew Members");
		lblCrew.setBounds(27, 53, 237, 25);
		lblCrew.setHorizontalAlignment(SwingConstants.CENTER);
		lblCrew.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(lblCrew);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(280, 78, 16, 219);
		separator.setOrientation(SwingConstants.VERTICAL);
		contentPane.add(separator);
		
		JLabel lblCharacterInfo = new JLabel("Member Status");
		lblCharacterInfo.setBounds(312, 53, 237, 25);
		lblCharacterInfo.setToolTipText("");
		lblCharacterInfo.setHorizontalAlignment(SwingConstants.CENTER);
		lblCharacterInfo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(lblCharacterInfo);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(27, 106, 237, 40);
		btnNewButton.setToolTipText("Click to see info.");
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("");
		button.setBounds(27, 152, 237, 40);
		button.setToolTipText("Click to see info.");
		contentPane.add(button);
		
		JButton button_1 = new JButton("");
		button_1.setBounds(27, 198, 237, 40);
		button_1.setToolTipText("Click to see info.");
		contentPane.add(button_1);		
		
		JButton button_2 = new JButton("");
		button_2.setToolTipText("Click to see info.");
		button_2.setBounds(27, 244, 237, 40);
		contentPane.add(button_2);
		
		JLabel lblShipStatus = new JLabel("");
		lblShipStatus.setBounds(154, 308, 268, 39);
		lblShipStatus.setHorizontalAlignment(SwingConstants.CENTER);
		lblShipStatus.setFont(new Font("Palatino Linotype", Font.PLAIN, 25));
		contentPane.add(lblShipStatus);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(136, 341, 304, 25);
		progressBar.setStringPainted(true);
		progressBar.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		progressBar.setToolTipText("Ship status.");
		progressBar.setForeground(new Color(144, 238, 144));
		progressBar.setBackground(new Color(100, 149, 237));
		contentPane.add(progressBar);
		
		JLabel lblHealth = new JLabel("HEALTH");
		lblHealth.setBounds(293, 134, 117, 25);
		contentPane.add(lblHealth);
		
		JProgressBar progressBar_1 = new JProgressBar();
		progressBar_1.setName("");
		progressBar_1.setBounds(378, 134, 171, 25);
		progressBar_1.setToolTipText("");
		progressBar_1.setForeground(new Color(127, 255, 0));
		progressBar_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		progressBar_1.setBackground(UIManager.getColor("text"));
		contentPane.add(progressBar_1);
		
		JLabel lblTiredness = new JLabel("TIREDNESS");
		lblTiredness.setBounds(293, 180, 84, 25);
		contentPane.add(lblTiredness);
		
		JProgressBar progressBar_2 = new JProgressBar();
		progressBar_2.setToolTipText("");
		progressBar_2.setForeground(new Color(255, 215, 0));
		progressBar_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		progressBar_2.setBackground(UIManager.getColor("window"));
		progressBar_2.setBounds(378, 180, 171, 25);
		contentPane.add(progressBar_2);
		
		JLabel lblHunger = new JLabel("HUNGER");
		lblHunger.setBounds(293, 226, 84, 25);
		contentPane.add(lblHunger);
		
		JProgressBar progressBar_3 = new JProgressBar();
		progressBar_3.setToolTipText("");
		progressBar_3.setForeground(new Color(255, 215, 0));
		progressBar_3.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		progressBar_3.setBackground(UIManager.getColor("window"));
		progressBar_3.setBounds(378, 226, 171, 25);
		contentPane.add(progressBar_3);
		
		JButton btnNewButton_1 = new JButton("Day");
		btnNewButton_1.setEnabled(false);
		btnNewButton_1.setFont(new Font("Agency FB", Font.BOLD, 28));
		btnNewButton_1.setBounds(902, 610, 334, 53);
		contentPane.add(btnNewButton_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		panel.setBounds(576, 344, 299, 319);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JToggleButton btnUseItem = new JToggleButton("Use Items");
		btnUseItem.setEnabled(false);
		btnUseItem.setBounds(59, 80, 181, 38);
		panel.add(btnUseItem);
		
		JButton btnSleep = new JButton("Sleep");
		btnSleep.setEnabled(false);
		btnSleep.setBounds(59, 139, 181, 38);
		panel.add(btnSleep);
		
		JButton btnRepairShip = new JButton("Repair ship");
		btnRepairShip.setEnabled(false);
		btnRepairShip.setBounds(59, 198, 181, 38);
		panel.add(btnRepairShip);
		
		JButton btnExplorePlanet = new JButton("Explore new planet");
		btnExplorePlanet.setEnabled(false);
		btnExplorePlanet.setBounds(59, 257, 181, 38);
		panel.add(btnExplorePlanet);
		
		JButton btnLoot = new JButton("Loot");
		btnLoot.setEnabled(false);
		btnLoot.setBounds(59, 21, 181, 38);
		panel.add(btnLoot);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		panel_1.setBounds(27, 461, 522, 202);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblInventory = new JLabel("Inventory");
		lblInventory.setVisible(false);
		lblInventory.setHorizontalAlignment(SwingConstants.CENTER);
		lblInventory.setFont(new Font("Agency FB", Font.BOLD, 28));
		lblInventory.setBounds(187, 0, 148, 49);
		panel_1.add(lblInventory);
		
		JButton button_3 = new JButton("");
		button_3.setVisible(false);
		button_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_3.setContentAreaFilled(false);
		button_3.setIcon(new ImageIcon(MainGame.class.getResource("/spaceExplorer/Bread.png")));
		button_3.setBounds(20, 108, 63, 60);
		panel_1.add(button_3);
		
		JButton button_4 = new JButton("");
		button_4.setVisible(false);
		button_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_4.setContentAreaFilled(false);
		button_4.setBounds(103, 108, 63, 60);
		panel_1.add(button_4);
		
		JButton button_5 = new JButton("");
		button_5.setVisible(false);
		button_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_5.setContentAreaFilled(false);
		button_5.setBounds(186, 108, 63, 60);
		panel_1.add(button_5);
		
		JButton button_6 = new JButton("");
		button_6.setVisible(false);
		button_6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_6.setContentAreaFilled(false);
		button_6.setBounds(269, 108, 63, 60);
		panel_1.add(button_6);
		
		JButton button_7 = new JButton("");
		button_7.setVisible(false);
		button_7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_7.setContentAreaFilled(false);
		button_7.setBounds(352, 108, 63, 60);
		panel_1.add(button_7);
		
		JButton button_8 = new JButton("");
		button_8.setHorizontalTextPosition(SwingConstants.CENTER);
		button_8.setVisible(false);
		button_8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_8.setContentAreaFilled(false);
		button_8.setBounds(435, 108, 63, 60);
		panel_1.add(button_8);
		
		JButton btnInventoryChange = new JButton("");
		btnInventoryChange.setVisible(false);
		btnInventoryChange.setBounds(192, 60, 138, 29);
		panel_1.add(btnInventoryChange);
		
		JLabel lblMoney = new JLabel("Money: $" + GameEnvironment.money);
		lblMoney.setHorizontalAlignment(SwingConstants.CENTER);
		lblMoney.setFont(new Font("Palatino Linotype", Font.PLAIN, 25));
		lblMoney.setBounds(27, 395, 207, 39);
		contentPane.add(lblMoney);
		
		JLabel label = new JLabel("");
		label.setVerticalAlignment(SwingConstants.TOP);
		label.setIcon(new ImageIcon(MainGame.class.getResource("/spaceExplorerImages/character 3.png")));
		label.setVisible(false);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("Actions");
		tglbtnNewToggleButton.setBackground(UIManager.getColor("Button.background"));
		tglbtnNewToggleButton.setBorder(UIManager.getBorder("Button.border"));
		tglbtnNewToggleButton.setEnabled(false);
		tglbtnNewToggleButton.setBounds(637, 280, 177, 53);
		contentPane.add(tglbtnNewToggleButton);
		tglbtnNewToggleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tglbtnNewToggleButton.isSelected()) {						//ENABLE btnEat  btnSleep  btnRepairShip  btnLoot  btnExplorePlanet
//					System.out.println("A");
					btnUseItem.setEnabled(true);
					btnSleep.setEnabled(true);
					btnRepairShip.setEnabled(true);
					btnLoot.setEnabled(true);
					btnExplorePlanet.setEnabled(true);
					panel.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(0, 204, 153), null));
				} else {
//					System.out.println("B");
					btnUseItem.setEnabled(false);
					btnUseItem.setSelected(false);
					btnSleep.setEnabled(false);
					btnRepairShip.setEnabled(false);
					btnLoot.setEnabled(false);
					btnExplorePlanet.setEnabled(false);
					panel.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
					panel_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
					
					for (JButton i: btnFoodList) {
						i.setVisible(false);
					}
					
					for (JButton i: btnMedList) {
						i.setVisible(false);
					}
					
					for (JLabel i: lblItemCountList) {
						i.setVisible(false);
					}
					
					for (JLabel i: lblItemCountList2) {
						i.setVisible(false);
					}
					
					btnInventoryChange.setVisible(false);
					lblInventory.setVisible(false);
				}
			}
		});
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(576, 21, 280, 217);
		contentPane.add(label);
		
		JLabel lblMembername = new JLabel("");
		lblMembername.setVerticalAlignment(SwingConstants.BOTTOM);
		lblMembername.setFont(new Font("Agency FB", Font.BOLD, 25));
		lblMembername.setHorizontalAlignment(SwingConstants.CENTER);
		lblMembername.setBounds(613, 229, 224, 40);
		contentPane.add(lblMembername);
		
		JButton label_1 = new JButton("");
		label_1.setContentAreaFilled(false);
		label_1.setBorder(UIManager.getBorder("Button.border"));
		label_1.setVisible(false);
		label_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
//		label_1.setIcon(new ImageIcon(MainGame.class.getResource("/spaceExplorerImages/syring.png")));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(221, 107, 79, 75);
		panel_1.add(label_1);
		
		JButton label_2 = new JButton("");
		label_2.setContentAreaFilled(false);
		label_2.setBorder(UIManager.getBorder("Button.border"));
		label_2.setHorizontalTextPosition(SwingConstants.LEFT);
		label_2.setVisible(false);
		label_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
//		label_2.setIcon(new ImageIcon(MainGame.class.getResource("/spaceExplorerImages/Painkillers1.png")));
		label_2.setBounds(371, 107, 79, 75);
		panel_1.add(label_2);
		
		JButton lblMeditems = new JButton("");
		lblMeditems.setContentAreaFilled(false);
		lblMeditems.setBorder(UIManager.getBorder("Button.border"));
		lblMeditems.setVisible(false);
		lblMeditems.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblMeditems.setBounds(71, 107, 79, 75);
		panel_1.add(lblMeditems);
//		ImageIcon img = lblMeditems.getIcon();
//		lblMeditems.setIcon(new ImageIcon(MainGame.class.getResource("/spaceExplorerImages/Bandage1.png")));
		lblMeditems.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblX = new JLabel("");
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setFont(new Font("Agency FB", Font.BOLD, 18));
		lblX.setBounds(20, 171, 63, 20);
		panel_1.add(lblX);
		
		JLabel lblX_1 = new JLabel("");
		lblX_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblX_1.setFont(new Font("Agency FB", Font.BOLD, 18));
		lblX_1.setBounds(103, 171, 63, 20);
		panel_1.add(lblX_1);
		
		JLabel lblX_2 = new JLabel("");
		lblX_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblX_2.setFont(new Font("Agency FB", Font.BOLD, 18));
		lblX_2.setBounds(186, 171, 63, 20);
		panel_1.add(lblX_2);
		
		JLabel lblX_3 = new JLabel("");
		lblX_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblX_3.setFont(new Font("Agency FB", Font.BOLD, 18));
		lblX_3.setBounds(269, 171, 63, 20);
		panel_1.add(lblX_3);
		
		JLabel lblX_4 = new JLabel("");
		lblX_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblX_4.setFont(new Font("Agency FB", Font.BOLD, 18));
		lblX_4.setBounds(352, 171, 63, 20);
		panel_1.add(lblX_4);
		
		JLabel lblX_5 = new JLabel("");
		lblX_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblX_5.setFont(new Font("Agency FB", Font.BOLD, 18));
		lblX_5.setBounds(435, 171, 63, 20);
		panel_1.add(lblX_5);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setVisible(false);
		panel_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 255, 204), new Color(51, 51, 255)));
		panel_2.setBounds(902, 96, 334, 491);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton lblStoreitems = new JButton("");
		lblStoreitems.setToolTipText("DECREASE HUNGER BY 25%");
		lblStoreitems.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblStoreitems.setContentAreaFilled(false);
		lblStoreitems.setBounds(25, 20, 79, 66);
		panel_2.add(lblStoreitems);
		lblStoreitems.setPreferredSize(new Dimension(2, 2));
		lblStoreitems.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 102, 0), new Color(204, 255, 0)));
		lblStoreitems.setHorizontalAlignment(SwingConstants.CENTER);
		lblStoreitems.setIcon(new ImageIcon(MainGame.class.getResource("/spaceExplorer/Chicken.png")));
		
		JButton label_3 = new JButton("");
		label_3.setToolTipText("DECREASE HUNGER BY 15%");
		label_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_3.setContentAreaFilled(false);
		label_3.setIcon(new ImageIcon(MainGame.class.getResource("/spaceExplorer/burger.png")));
		label_3.setBounds(128, 20, 79, 66);
		label_3.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 102, 0), new Color(204, 255, 0)));
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(label_3);
		
		JButton label_4 = new JButton("");
		label_4.setToolTipText("DECREASE HUNGER BY 10%");
		label_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_4.setContentAreaFilled(false);
		label_4.setIcon(new ImageIcon(MainGame.class.getResource("/spaceExplorer/Bread.png")));
		label_4.setBounds(231, 20, 79, 66);
		label_4.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 102, 0), new Color(204, 255, 0)));
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(label_4);
		
		JButton label_5 = new JButton("");
		label_5.setToolTipText("DECREASE HUNGER BY 5%");
		label_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_5.setContentAreaFilled(false);
		label_5.setIcon(new ImageIcon(MainGame.class.getResource("/spaceExplorer/ice cream.png")));
		label_5.setBounds(25, 170, 79, 66);
		label_5.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 102, 0), new Color(204, 255, 0)));
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(label_5);
		
		JButton label_6 = new JButton("");
		label_6.setToolTipText("DECREASE HUNGER BY 3%");
		label_6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_6.setContentAreaFilled(false);
		label_6.setIcon(new ImageIcon(MainGame.class.getResource("/spaceExplorer/tea.png")));
		label_6.setBounds(128, 170, 79, 66);
		label_6.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 102, 0), new Color(204, 255, 0)));
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(label_6);
		
		JButton label_7 = new JButton("");
		label_7.setToolTipText("DECREASE HUNGER BY 2%");
		label_7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_7.setContentAreaFilled(false);
		label_7.setIcon(new ImageIcon(MainGame.class.getResource("/spaceExplorer/Toffee.png")));
		label_7.setBounds(231, 170, 79, 66);
		label_7.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 102, 0), new Color(204, 255, 0)));
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(label_7);
		
		JButton label_8 = new JButton("");
		label_8.setToolTipText("+60HP (Cures Plague)");
		label_8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_8.setContentAreaFilled(false);
		label_8.setIcon(new ImageIcon(MainGame.class.getResource("/spaceExplorerImages/syring.png")));
		label_8.setBounds(25, 320, 79, 89);
		label_8.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(204, 0, 0), new Color(255, 51, 102)));
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(label_8);
		
		JButton label_9 = new JButton("");
		label_9.setToolTipText("+20HP");
		label_9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_9.setContentAreaFilled(false);
		label_9.setIcon(new ImageIcon(MainGame.class.getResource("/spaceExplorerImages/Painkillers1.png")));
		label_9.setBounds(128, 320, 79, 89);
		label_9.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(204, 0, 0), new Color(255, 51, 102)));
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(label_9);
		
		JButton label_10 = new JButton("");
		label_10.setToolTipText("+10HP");
		label_10.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_10.setContentAreaFilled(false);
		label_10.setIcon(new ImageIcon(MainGame.class.getResource("/spaceExplorerImages/Bandage1.png")));
		label_10.setBounds(231, 320, 79, 89);
		label_10.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(204, 0, 0), new Color(255, 51, 102)));
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(label_10);
		
		JButton btnBuy = new JButton("Buy");
		btnBuy.setContentAreaFilled(false);
		btnBuy.setBounds(25, 97, 79, 23);
		panel_2.add(btnBuy);
		
		JButton button_9 = new JButton("Buy");
		button_9.setContentAreaFilled(false);
		button_9.setBounds(128, 97, 79, 23);
		panel_2.add(button_9);
		
		JButton button_10 = new JButton("Buy");
		button_10.setContentAreaFilled(false);
		button_10.setBounds(231, 97, 79, 23);
		panel_2.add(button_10);
		
		JButton button_11 = new JButton("Buy");
		button_11.setContentAreaFilled(false);
		button_11.setBounds(25, 247, 79, 23);
		panel_2.add(button_11);
		
		JButton button_12 = new JButton("Buy");
		button_12.setContentAreaFilled(false);
		button_12.setBounds(128, 247, 79, 23);
		panel_2.add(button_12);
		
		JButton button_13 = new JButton("Buy");
		button_13.setContentAreaFilled(false);
		button_13.setBounds(231, 247, 79, 23);
		panel_2.add(button_13);
		
		JButton button_14 = new JButton("Buy");
		button_14.setContentAreaFilled(false);
		button_14.setBounds(231, 423, 79, 23);
		panel_2.add(button_14);
		
		JButton button_15 = new JButton("Buy");
		button_15.setContentAreaFilled(false);
		button_15.setBounds(128, 423, 79, 23);
		panel_2.add(button_15);
		
		JButton button_16 = new JButton("Buy");
		button_16.setContentAreaFilled(false);
		button_16.setBounds(25, 423, 79, 23);
		panel_2.add(button_16);
		
		JButton btnSell = new JButton("Sell");
		btnSell.setContentAreaFilled(false);
		btnSell.setBounds(25, 131, 79, 23);
		panel_2.add(btnSell);
		
		JButton button_17 = new JButton("Sell");
		button_17.setContentAreaFilled(false);
		button_17.setBounds(128, 131, 79, 23);
		panel_2.add(button_17);
		
		JButton button_18 = new JButton("Sell");
		button_18.setContentAreaFilled(false);
		button_18.setBounds(231, 131, 79, 23);
		panel_2.add(button_18);
		
		JButton button_19 = new JButton("Sell");
		button_19.setContentAreaFilled(false);
		button_19.setBounds(25, 281, 79, 23);
		panel_2.add(button_19);
		
		JButton button_20 = new JButton("Sell");
		button_20.setContentAreaFilled(false);
		button_20.setBounds(128, 281, 79, 23);
		panel_2.add(button_20);
		
		JButton button_21 = new JButton("Sell");
		button_21.setContentAreaFilled(false);
		button_21.setBounds(231, 281, 79, 23);
		panel_2.add(button_21);
		
		JButton button_22 = new JButton("Sell");
		button_22.setContentAreaFilled(false);
		button_22.setBounds(25, 457, 79, 23);
		panel_2.add(button_22);
		
		JButton button_23 = new JButton("Sell");
		button_23.setContentAreaFilled(false);
		button_23.setBounds(128, 457, 79, 23);
		panel_2.add(button_23);
		
		JButton button_24 = new JButton("Sell");
		button_24.setContentAreaFilled(false);
		button_24.setBounds(231, 457, 79, 23);
		panel_2.add(button_24);
		
		
		JToggleButton btnSpaceStore = new JToggleButton("Space Outpost");
		btnSpaceStore.setEnabled(false);
		btnSpaceStore.setFont(new Font("Agency FB", Font.BOLD, 28));
		btnSpaceStore.setBounds(902, 21, 334, 53);
		contentPane.add(btnSpaceStore);
		
		JLabel lblX_6 = new JLabel("");
		lblX_6.setFont(new Font("Agency FB", Font.BOLD, 20));
		lblX_6.setBounds(160, 137, 63, 45);
		panel_1.add(lblX_6);
		
		JLabel lblX_7 = new JLabel("");
		lblX_7.setFont(new Font("Agency FB", Font.BOLD, 20));
		lblX_7.setBounds(310, 138, 63, 43);
		panel_1.add(lblX_7);
		
		JLabel lblX_8 = new JLabel("");
		lblX_8.setFont(new Font("Agency FB", Font.BOLD, 20));
		lblX_8.setBounds(459, 138, 63, 43);
		panel_1.add(lblX_8);
		
		
		
		
		/*
		 * ship name and ship health bar
		 * 
		 */
		lblShipStatus.setText(CrewInfo.ShipName + " Health");
		progressBar.setValue(CrewInfo.ShipHealth);
		
		
		/*
		 * 
		 * setting up game environment
		 * 
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
		
		
		//Adding food to game
		crewinfo.addFoodItem(Food.BREAD);
		crewinfo.addFoodItem(Food.TEA);
		
		//Adding Medicine to game
		crewinfo.addMedicalItem(Medicine.MEDICINE3);
		crewinfo.addMedicalItem(Medicine.MEDICINE2);
			
		//adding inventory buttons to a list
		//food items
		btnFoodList.add(button_3);
		btnFoodList.add(button_4);
		btnFoodList.add(button_5);
		btnFoodList.add(button_6);
		btnFoodList.add(button_7);
		btnFoodList.add(button_8);
		
		//med items
		btnMedList.add(lblMeditems);
		btnMedList.add(label_1);
		btnMedList.add(label_2);
		
		//Item count for food
		lblItemCountList.add(lblX);
		lblItemCountList.add(lblX_1);
		lblItemCountList.add(lblX_2);
		lblItemCountList.add(lblX_3);
		lblItemCountList.add(lblX_4);
		lblItemCountList.add(lblX_5);
		
		//Item count for meds
		lblItemCountList2.add(lblX_6);
		lblItemCountList2.add(lblX_7);
		lblItemCountList2.add(lblX_8);
		
		for (JLabel i: lblItemCountList) {
			i.setVisible(false);
		}
		
		for (JLabel i: lblItemCountList2) {
			i.setVisible(false);
		}
		
		
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
				
				
			}
			
			if (crewNum == 1) {
				button.setText(MemberName);
				button.setToolTipText("Ability: " + i.ability);
				
			}
			
			if (crewNum == 2) {
				button_1.setText(MemberName);			
				button_1.setToolTipText("Ability: " + i.ability);
				
			}
			
			if (crewNum == 3) {
				button_2.setText(MemberName);
				button_2.setToolTipText("Ability: " + i.ability);
				
			}
			
			crewNum += 1;
		}
		
		
		/*
		 * 
		 * setting actions
		 * 
		 */		
		JLabel lblShipPieces = new JLabel("Transporter Parts: 0");
		lblShipPieces.setHorizontalAlignment(SwingConstants.CENTER);
		lblShipPieces.setFont(new Font("Palatino Linotype", Font.PLAIN, 25));
		lblShipPieces.setBounds(281, 395, 268, 39);
		contentPane.add(lblShipPieces);
				
		
		/*
		 * 
		 * Member info
		 * 
		 */
		btnNewButton.addActionListener(new ActionListener() {					//set progress bars
			public void actionPerformed(ActionEvent e) {
				btnNewButton_1.setEnabled(true);
				btnSpaceStore.setEnabled(true);
				CrewMember s = crewinfo.CrewList.get(0);
				progressBar_1.setValue(s.health);
				progressBar_1.setStringPainted(true);
				
				progressBar_2.setValue(s.tiredness);
				progressBar_2.setStringPainted(true);
				
				progressBar_3.setValue(s.hunger);
				progressBar_3.setStringPainted(true);
				
				label.setVisible(true);
				label.setIcon(new ImageIcon(MainGame.class.getResource(s.characterimg)));
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
					btnNewButton_1.setEnabled(true);
					btnSpaceStore.setEnabled(true);
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
					
					label.setVisible(true);
					label.setIcon(new ImageIcon(MainGame.class.getResource(j.characterimg)));
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
					btnNewButton_1.setEnabled(true);
					btnSpaceStore.setEnabled(true);
					CrewMember k = crewinfo.CrewList.get(2);
					progressBar_1.setValue(k.health);
					progressBar_1.setStringPainted(true);
					
					progressBar_2.setValue(k.tiredness);
					progressBar_2.setStringPainted(true);
					
					progressBar_3.setValue(k.hunger);
					progressBar_3.setStringPainted(true);
					
					label.setVisible(true);
					label.setIcon(new ImageIcon(MainGame.class.getResource(k.characterimg)));
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
					btnNewButton_1.setEnabled(true);
					btnSpaceStore.setEnabled(true);
					CrewMember k = crewinfo.CrewList.get(3);
					progressBar_1.setValue(k.health);
					progressBar_1.setStringPainted(true);
					
					progressBar_2.setValue(k.tiredness);
					progressBar_2.setStringPainted(true);
					
					progressBar_3.setValue(k.hunger);
					progressBar_3.setStringPainted(true);
					
					label.setVisible(true);
					label.setIcon(new ImageIcon(MainGame.class.getResource(k.characterimg)));
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
		

		btnLoot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		
		/*
		 * 
		 * USE ITEMS FROM THE INVENTORY
		 * 
		 */
		btnUseItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnUseItem.isSelected()) {
					if (crewinfo.CrewList.get(GameEnvironment.currentplayer).NumberOfMoves > 0) {
						
						//ADDING ITEMS TO THE INVENTORY
						lblInventory.setVisible(true);
						btnInventoryChange.setVisible(true);
						btnInventoryChange.setText("Healing Items");
						panel_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(0, 204, 153), null));
						
						for (FoodItem i: crewinfo.FoodList) {						//FOOD BUTTON ICONS
							btnFoodList.get(crewinfo.FoodList.indexOf(i)).setVisible(true);
							btnFoodList.get(crewinfo.FoodList.indexOf(i)).setIcon(new ImageIcon(MainGame.class.getResource(i.imageIcon)));
							btnFoodList.get(crewinfo.FoodList.indexOf(i)).setName(i.name);
							lblItemCountList.get(crewinfo.FoodList.indexOf(i)).setVisible(true);
							lblItemCountList.get(crewinfo.FoodList.indexOf(i)).setText("X " + i.foodCount);
						}
					}
					
					//Disable actions after number of moves == 0
					if (crewinfo.CrewList.get(GameEnvironment.currentplayer).NumberOfMoves <= 0) {
						btnUseItem.setEnabled(false);
						btnUseItem.setSelected(false);
						btnSleep.setEnabled(false);
						btnRepairShip.setEnabled(false);
						btnLoot.setEnabled(false);
						btnExplorePlanet.setEnabled(false);
						tglbtnNewToggleButton.setSelected(false);
						tglbtnNewToggleButton.setEnabled(false);
					}
					tglbtnNewToggleButton.revalidate();
					tglbtnNewToggleButton.repaint();
					
					
				} else {													//WHEN BUTTON NOT SELECTED
					for (JButton i: btnFoodList) {
						i.setVisible(false);
					}
					for (JButton j: btnMedList) {
						j.setVisible(false);
					}
					for (JLabel s: lblItemCountList) {
						s.setVisible(false);
					}
					
					for (JLabel s: lblItemCountList2) {
						s.setVisible(false);
					}
					
					btnInventoryChange.setText("Space Food");
					btnInventoryChange.setVisible(false);
					btnInventoryChange.revalidate();
					lblInventory.setVisible(false);
					panel_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
				}

			}
		});
		
		
		/*
		 * 
		 * Inventory switch food and medicine button
		 * 
		 */
		btnInventoryChange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnInventoryChange.getText() == "Healing Items") {
					btnInventoryChange.setText("Space Food");
					
					for (JButton i: btnFoodList) {								//food buttons
						i.setVisible(false);
					}
					for (JLabel i: lblItemCountList) {
						i.setVisible(false);
					}
															
					for (MedicalItem i: crewinfo.MedicalList) {						//FOOD BUTTON ICONS
						btnMedList.get(crewinfo.MedicalList.indexOf(i)).setVisible(true);
						btnMedList.get(crewinfo.MedicalList.indexOf(i)).setIcon(new ImageIcon(MainGame.class.getResource(i.medimg)));
						lblItemCountList2.get(crewinfo.MedicalList.indexOf(i)).setVisible(true);
						lblItemCountList2.get(crewinfo.MedicalList.indexOf(i)).setText("X " + i.medCount);
						
					}
					
				} else {
					btnInventoryChange.setText("Healing Items");
					
					int j = 0;
					for (FoodItem i: crewinfo.FoodList) {						//FOOD BUTTON ICONS
						btnFoodList.get(j).setVisible(true);
						btnFoodList.get(j).setIcon(new ImageIcon(MainGame.class.getResource(i.imageIcon)));
						j += 1;
					}
					
					for (JButton i: btnMedList) {
						i.setVisible(false);
					}
					for (JLabel i: lblItemCountList) {
						i.setVisible(true);
					}
					
					for (JLabel i: lblItemCountList2) {
						i.setVisible(false);
					}
				}
			}
		});
		
		
		
		/*
		 * 
		 * Consuming food when item clicked
		 * 
		 */
		for (JButton i : btnFoodList) {
			i.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (crewinfo.FoodList.get(btnFoodList.indexOf(i)).foodCount != 0 && crewinfo.CrewList.get(GameEnvironment.currentplayer).NumberOfMoves > 0) {
						
						crewinfo.FoodList.get(btnFoodList.indexOf(i)).foodCount -= 1;
						crewinfo.CrewList.get(GameEnvironment.currentplayer).feed(crewinfo.FoodList.get(btnFoodList.indexOf(i)).getNutrition());		//Use food item
						progressBar_3.setValue(crewinfo.CrewList.get(GameEnvironment.currentplayer).getHunger());
						progressBar_3.revalidate();
						progressBar_3.repaint();
						
						btnUseItem.setEnabled(false);
						btnUseItem.setSelected(false);
						btnSleep.setEnabled(false);
						btnRepairShip.setEnabled(false);
						btnLoot.setEnabled(false);
						btnExplorePlanet.setEnabled(false);
						tglbtnNewToggleButton.setSelected(false);
						tglbtnNewToggleButton.setText("Actions    X " + crewinfo.CrewList.get(GameEnvironment.currentplayer).NumberOfMoves);
						if (crewinfo.CrewList.get(GameEnvironment.currentplayer).NumberOfMoves <= 0) {
							tglbtnNewToggleButton.setEnabled(false);
						}
						lblInventory.setVisible(false);
						btnInventoryChange.setVisible(false);
						tglbtnNewToggleButton.revalidate();
						tglbtnNewToggleButton.repaint();
						panel.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
						panel_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
						
						for (JButton i: btnFoodList) {
							i.setVisible(false);
						}
						
						for (JLabel i: lblItemCountList) {
							i.setVisible(false);
						}
					}
				}
			});
		}

		
		/*
		 * 
		 * Consuming medicine when clicked
		 * 
		 */
		for (JButton i : btnMedList) {
			i.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (crewinfo.MedicalList.get(btnMedList.indexOf(i)).medCount != 0 && crewinfo.CrewList.get(GameEnvironment.currentplayer).NumberOfMoves > 0) {
//						System.out.println(crewinfo.CrewList.get(GameEnvironment.currentplayer).NumberOfMoves + "A");
//						crewinfo.CrewList.get(GameEnvironment.currentplayer).NumberOfMoves -= 1;
//						System.out.println(crewinfo.CrewList.get(GameEnvironment.currentplayer).NumberOfMoves + "B");

						crewinfo.MedicalList.get(btnMedList.indexOf(i)).medCount -= 1;
						crewinfo.CrewList.get(GameEnvironment.currentplayer).consumeMedicalItem(crewinfo.MedicalList.get(btnMedList.indexOf(i)));		//Use food item
						progressBar_1.setValue(crewinfo.CrewList.get(GameEnvironment.currentplayer).getHealth());
						progressBar_1.revalidate();
						progressBar_1.repaint();
						
						btnUseItem.setEnabled(false);
						btnUseItem.setSelected(false);
						btnSleep.setEnabled(false);
						btnRepairShip.setEnabled(false);
						btnLoot.setEnabled(false);
						btnExplorePlanet.setEnabled(false);
						tglbtnNewToggleButton.setSelected(false);
						tglbtnNewToggleButton.setText("Actions    X " + CrewInfo.CrewList.get(GameEnvironment.currentplayer).NumberOfMoves);
						if (crewinfo.CrewList.get(GameEnvironment.currentplayer).NumberOfMoves <= 0) {
							tglbtnNewToggleButton.setEnabled(false);
						}
						lblInventory.setVisible(false);
						btnInventoryChange.setVisible(false);
						tglbtnNewToggleButton.revalidate();
						tglbtnNewToggleButton.repaint();
						panel.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
						panel_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
						
						for (JButton i: btnMedList) {
							i.setVisible(false);
						}
						
						for (JLabel i: lblItemCountList2) {
							i.setVisible(false);
						}
						
					}
				}
			});
		}


		
//		System.out.println();
		
		
		
		
		/*
		 * 
		 * SPACE OUTPOST
		 * 
		 */

		btnSpaceStore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnSpaceStore.isSelected()) {
					panel_2.setVisible(true);
				} else {
					panel_2.setVisible(false);
				}
			}
		});
		
		
		
		
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
						for (JButton j: btnFoodList) {
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
					btnNewButton_1.setText(" " + GameEnvironment.NumberOfDays + " Days Remaining ");
				} else if(GameEnvironment.NumberOfDays == 1) {
					btnNewButton_1.setText(" " + GameEnvironment.NumberOfDays + " Day Remaining ");
				} else {
					btnNewButton_1.setText(" Finish ");
				}
				btnNewButton_1.revalidate();
				btnNewButton_1.repaint();
				tglbtnNewToggleButton.setText("Actions    X " + crewinfo.CrewList.get(GameEnvironment.currentplayer).NumberOfMoves);
				tglbtnNewToggleButton.revalidate();
				tglbtnNewToggleButton.repaint();
			}
		});
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
