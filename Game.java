/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package package1;

/**
 *
 * @author sport
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game {
    ChoiceHandler handler = new ChoiceHandler();
    GUI gui = new GUI();
    whatShows showing = new whatShows(gui);
    Story story = new Story(this, gui, showing);
    
    String nextPosition1, nextPosition2, nextPosition3, nextPosition4;
    
    public static void main(String[] args) {
        new Game();
    }

    public Game() {
        gui.createGUI(handler);
        story.defaultSetup();
        showing.showTitleScreen();
    }
        
    public class ChoiceHandler implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            showing.showMainScreen();
            
            String yourChoice = event.getActionCommand();
            
            System.out.printf(yourChoice + "\n");
            
            switch(yourChoice){
                case "start": showing.showMainScreen(); story.stranded(); break;
                case "o1": story.selectPosition(nextPosition1); break;
                case "o2": story.selectPosition(nextPosition2); break;
                case "o3": story.selectPosition(nextPosition3); break;
                case "o4": story.selectPosition(nextPosition4); break;
                
            }
        }
    }
}
