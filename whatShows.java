/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package package1;

/**
 *
 * @author sport
 */
public class whatShows {
    GUI gui;
    
    
    public whatShows(GUI graphicalUserInterface) {
        gui = graphicalUserInterface;
    }
    
    public void showTitleScreen() {
        // Displays the title screen
        gui.titleNamePanel.setVisible(true);
        gui.startButtonPanel.setVisible(true);
        gui.mainTextPanel.setVisible(false);
        gui.optionButtonPanel.setVisible(false);
        gui.playerPanel.setVisible(false);
    }
    
    public void showMainScreen() {
        // Displays the main game
        gui.titleNamePanel.setVisible(false);
        gui.startButtonPanel.setVisible(false);
        gui.mainTextPanel.setVisible(true);
        gui.optionButtonPanel.setVisible(true);
        gui.playerPanel.setVisible(true);
    }
}
