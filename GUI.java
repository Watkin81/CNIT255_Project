/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package package1;

/**
 *
 * @author sport
 */
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JTextArea; 
import package1.Game.ChoiceHandler;

public class GUI {
    JFrame window;
    JPanel titleNamePanel, startButtonPanel, mainTextPanel, optionButtonPanel, playerPanel;
    JLabel titleNameLabel, hpLabel, hpNumber, gearLabel, gearName, conditionLabel, conditionName;
    JButton startButton, option1, option2, option3, option4;
    JTextArea mainTextArea;
    Font titleFont = new Font("Arial", Font.PLAIN, 90);
    Font regularFont = new Font("Arial", Font.PLAIN, 28);
    
    
    public void createGUI(ChoiceHandler handler) {
        
        // This section sets up the window for the game
        window = new JFrame();
        window.setSize(1000, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);
        window.setVisible(true);
        
        // This section is for the title of the game at the beginning screen
        titleNamePanel = new JPanel();
	titleNamePanel.setBounds(100, 100, 800, 150);
	titleNamePanel.setBackground(Color.black);
	titleNameLabel = new JLabel("Lone Survivor");
	titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(titleFont);
        titleNamePanel.add(titleNameLabel);
        
        // This section is for the button to start the game at the beginning screen
        startButtonPanel = new JPanel();
	startButtonPanel.setBounds(300, 400, 400, 100);
	startButtonPanel.setBackground(Color.black);	
	startButton = new JButton("Let's Begin");
	startButton.setBackground(Color.black);
	startButton.setForeground(Color.white);
        startButton.setFont(regularFont);
        startButton.setFocusPainted(false);
        startButton.addActionListener(handler);
        startButton.setActionCommand("start");
        startButtonPanel.add(startButton);
        
        // Adds the elements wanted to the window while also allowing it to be visible without resizing
        window.add(titleNamePanel);
        window.add(startButtonPanel);
        window.setVisible(true);
        
        // Creates the same window for the main game
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100, 100, 800, 250);
        mainTextPanel.setBackground(Color.black);
        window.add(mainTextPanel);
        
        // Sets the text box that will display the information
        mainTextArea = new JTextArea("This is where the main text will be.");
	mainTextArea.setBounds(100, 100, 800, 250);
	mainTextArea.setBackground(Color.black);
	mainTextArea.setForeground(Color.white);
	mainTextArea.setFont(regularFont);
	mainTextArea.setLineWrap(true);
        mainTextArea.setWrapStyleWord(true); 
	mainTextArea.setEditable(false);
        mainTextPanel.add(mainTextArea);
        
        // Creates the area where the buttons will be
        optionButtonPanel = new JPanel();
	optionButtonPanel.setBounds(250, 350, 400, 150);
	optionButtonPanel.setBackground(Color.black);
	optionButtonPanel.setLayout(new GridLayout(4,1));
        window.add(optionButtonPanel);
        
        // Creates the buttons
        option1 = new JButton("Option 1");
	option1.setBackground(Color.black);
	option1.setForeground(Color.white);
	option1.setFont(regularFont);
	option1.setFocusPainted(false);
        option1.addActionListener(handler);
        option1.setActionCommand("o1");
        optionButtonPanel.add(option1);
        option2 = new JButton("Option 2");
	option2.setBackground(Color.black);
	option2.setForeground(Color.white);
	option2.setFont(regularFont);
	option2.setFocusPainted(false);
        option2.addActionListener(handler);
        option2.setActionCommand("o2");
        optionButtonPanel.add(option2);
        option3 = new JButton("Option 3");
	option3.setBackground(Color.black);
	option3.setForeground(Color.white);
	option3.setFont(regularFont);
	option3.setFocusPainted(false);
        option3.addActionListener(handler);
        option3.setActionCommand("o3");
        optionButtonPanel.add(option3);
        option4 = new JButton("Option 4");
	option4.setBackground(Color.black);
	option4.setForeground(Color.white);
	option4.setFont(regularFont);
	option4.setFocusPainted(false);
        option4.addActionListener(handler);
        option4.setActionCommand("o4");
        optionButtonPanel.add(option4);
        
        // Creates the area where the player stats will be
        playerPanel = new JPanel();
	playerPanel.setBounds(100, 15, 800, 50);
	playerPanel.setBackground(Color.black);
	playerPanel.setLayout(new GridLayout(1,6));
        window.add(playerPanel);
        
        // Creates the player information
        hpLabel = new JLabel("HP:");
	hpLabel.setFont(regularFont);
	hpLabel.setForeground(Color.white);
	playerPanel.add(hpLabel);
        hpNumber = new JLabel();
	hpNumber.setFont(regularFont);
	hpNumber.setForeground(Color.white);
	playerPanel.add(hpNumber);
        conditionLabel = new JLabel("Condition:");
	conditionLabel.setFont(regularFont);
	conditionLabel.setForeground(Color.white);
	playerPanel.add(conditionLabel);
        conditionName = new JLabel();
	conditionName.setFont(regularFont);
	conditionName.setForeground(Color.white);
	playerPanel.add(conditionName);
        gearLabel = new JLabel("Gear:");
	gearLabel.setFont(regularFont);
	gearLabel.setForeground(Color.white);
        playerPanel.add(gearLabel);
        gearName = new JLabel();
	gearName.setFont(regularFont);
	gearName.setForeground(Color.white);
	playerPanel.add(gearName);
    }
}
