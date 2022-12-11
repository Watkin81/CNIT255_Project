/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package package1;

import package2.Gear_Jacket;
import package2.Gear_Fishing;

/**
 *
 * @author sport
 */
public class Story {
    Game game;
    GUI gui;
    whatShows showing;
    Player player = new Player();    
    public Story(Game g, GUI guInterface, whatShows shows) {
        game = g;
        gui = guInterface;
        showing = shows;
    }
    
    public void defaultSetup() {
        player.hp = 10;
        gui.hpNumber.setText("" + player.hp);
        player.condition = "None";
        gui.conditionName.setText("" + player.condition);
        gui.gearName.setText("None");
    }
    
    public void selectPosition(String nextPosition) {
            switch(nextPosition){
                case "examineWreckage": examineWreckage(); break;
                case "enterForest": enterForest(); break;
                case "sleep": sleep(); break;
                case "findRiver": findRiver(); break;
                case "downstream": downstream(); break;
                case "crossRiver": crossRiver(); break;
                case "riverShelter": riverShelter(); break;
                case "planeShelter": planeShelter(); break;
                case "fishingRod": fishingRod(); break;
                case "riverFire": riverFire(); break;
                case "riverFishFail": riverFishFail(); break;
                case "riverSleep": riverSleep(); break;
                case "oceanSleep": oceanSleep(); break;
                case "planeFire": planeFire(); break;
                case "returnPlane": returnPlane(); break;
                case "oceanFire": oceanFire(); break;
                case "fishRiver": fishRiver(); break;
                case "fishOcean": fishOcean(); break;
                case "returnPlane2": returnPlane2(); break;
                case "wolfRun": wolfRun(); break;
                case "wolfFight": wolfFight(); break;
                case "wolfHide": wolfHide(); break;
                case "returnPlane3": returnPlane3(); break;
                case "sleepPlane2": sleepPlane2(); break;
                case "examine": examine(); break;
                case "end": end(); break;
                //can add more but this feels like enough.
            }
    }
    
    public void stranded(){ //done
        gui.mainTextArea.setText("Your plane has just crash landed on an island covered in forest. You are the lone survivor. \nWhat do you do first?");
        gui.option1.setText("Examine the wreckage.");
        gui.option2.setText("Walk into the forest.");
        gui.option3.setText("Go to sleep.");
        gui.option4.setText("");
        game.nextPosition1 = "examineWreckage";
        game.nextPosition2 = "enterForest";
        game.nextPosition3 = "sleep";
        game.nextPosition4 = "";
    }
    
    public void examineWreckage() { //done
        gui.mainTextArea.setText("You decide to examine the wreckage of the plane. After a few minutes of searching, you find that no supplies have survived the crash. \nWhat do you do next?");
        gui.option1.setText("Walk into the forest.");
        gui.option2.setText("Try to find a river.");
        gui.option3.setText("Go to sleep.");
        gui.option4.setText("");
        game.nextPosition1 = "enterForest";
        game.nextPosition2 = "findRiver";
        game.nextPosition3 = "sleep";
        game.nextPosition4 = "";
    }
    
    public void enterForest() { //done
        gui.mainTextArea.setText("You decide to explore the forest. There are thousands of trees in every direction. It is getting dark.\nWhat do you do next?");
        gui.option1.setText("Go back to the wreckage.");
        gui.option2.setText("Try to find a river.");
        gui.option3.setText("");
        gui.option4.setText("");
        game.nextPosition1 = "returnPlane";
        game.nextPosition2 = "findRiver";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
    
    public void returnPlane() { //done
        gui.mainTextArea.setText("You head back to the wreckage of the plane.\nWhat do you do next?");
        gui.option1.setText("Examine the wreckage.");
        gui.option2.setText("Try to find a river.");
        gui.option3.setText("Go to sleep.");
        gui.option4.setText("Build a shelter.");
        game.nextPosition1 = "examineWreckage";
        game.nextPosition2 = "findRiver";
        game.nextPosition3 = "sleep";
        game.nextPosition4 = "planeShelter";
    }
    
    public void sleep() { //done
        gui.mainTextArea.setText("You sleep for a few hours. The sun is close to setting.\nWhat do you do next?");
        gui.option1.setText("Walk into the forest.");
        gui.option2.setText("Build a shelter.");
        gui.option3.setText("");
        gui.option4.setText("");
        game.nextPosition1 = "enterForest";
        game.nextPosition2 = "planeShelter";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
    
    public void findRiver() { //done
        gui.mainTextArea.setText("You decide to try to find a river. You walk downhill for just over an hour, and at the bottom you find one!\nWhat do you do next?");
        gui.option1.setText("Follow the river downstream.");
        gui.option2.setText("Try to cross the river.");
        gui.option3.setText("Build a shelter.");
        gui.option4.setText("");
        game.nextPosition1 = "downstream";
        game.nextPosition2 = "crossRiver";
        game.nextPosition3 = "riverShelter";
        game.nextPosition4 = "";
    }
    
    public void downstream() { //done
        gui.mainTextArea.setText("You walk downstream. Eventually, you reach a beach and can see miles out into the ocean.\nWhat do you do next?");
        gui.option1.setText("Get food.");
        gui.option2.setText("Make a fire.");
        gui.option3.setText("Go to sleep.");
        gui.option4.setText("");
        game.nextPosition1 = "fishingRod";
        game.nextPosition2 = "oceanFire";
        game.nextPosition3 = "oceanSleep";
        game.nextPosition4 = "";
    }
    
    public void crossRiver() { //done
        gui.mainTextArea.setText("You decide to try cross the river. The water is moving fast, but you manage to wade across.\nWhat do you do next?");
        gui.option1.setText("Walk downstream.");
        gui.option2.setText("Make a shelter.");
        gui.option3.setText("");
        gui.option4.setText("");
        game.nextPosition1 = "downstream";
        game.nextPosition2 = "riverShelter";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
    
    public void riverShelter() { //done
        gui.mainTextArea.setText("Using pieces of wood from around the river you make a shelter.\nWhat do you do next?");
        gui.option1.setText("Make a fire.");
        gui.option2.setText("Sleep.");
        gui.option3.setText("Head downstream.");
        gui.option4.setText("");
        game.nextPosition1 = "riverFire";
        game.nextPosition2 = "riverSleep";
        game.nextPosition3 = "downstream";
        game.nextPosition4 = "";
    }
    
    public void planeShelter() { //done
        gui.mainTextArea.setText("Using parts from the plane you create a makeshift shelter.\nWhat do you do next?");
        gui.option1.setText("Make a fire.");
        gui.option2.setText("Try to find a river.");
        gui.option3.setText("");
        gui.option4.setText("");
        game.nextPosition1 = "planeFire";
        game.nextPosition2 = "findRiver";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
    
    public void fishingRod() { //done
        player.currentGear = new Gear_Fishing();
        gui.gearName.setText(player.currentGear.name);
        gui.mainTextArea.setText("You make a fishing rod with sticks on the beach.\nWhere do you fish?");
        gui.option1.setText("In the river.");
        gui.option2.setText("In the ocean.");
        gui.option3.setText("");
        gui.option4.setText("");
        game.nextPosition1 = "fishRiver";
        game.nextPosition2 = "fishOcean";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
    
    public void riverFire() { //done
        gui.mainTextArea.setText("You gather wood from around the river and make a fire.\nWhat do you do next?");
        gui.option1.setText("Fish.");
        gui.option2.setText("Head downstream.");
        gui.option3.setText("Sleep.");
        gui.option4.setText("");
        game.nextPosition1 = "riverFishFail";
        game.nextPosition2 = "downstream";
        game.nextPosition3 = "riverSleep";
        game.nextPosition4 = "";
    }
    
    public void riverSleep() { //done
        gui.mainTextArea.setText("You sleep for a few hours.\nWhat do you do next?");
        gui.option1.setText("Make a fire.");
        gui.option2.setText("Head downstream.");
        gui.option3.setText("Sleep again.");
        gui.option4.setText("");
        game.nextPosition1 = "riverFire";
        game.nextPosition2 = "downstream";
        game.nextPosition3 = "riverSleep";
        game.nextPosition4 = "";
    }
    
    public void oceanSleep() { //done
        gui.mainTextArea.setText("You fall asleep for a few hours listening to the waves.\nWhat do you do next?");
        gui.option1.setText("Get food.");
        gui.option2.setText("Make a fire.");
        gui.option3.setText("");
        gui.option4.setText("");
        game.nextPosition1 = "fishingRod";
        game.nextPosition2 = "oceanFire";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
    
    public void planeFire () { //done
        gui.mainTextArea.setText("There are no items around the wreckage to make a fire.\nWhere do you go?");
        gui.option1.setText("Try to find a river.");
        gui.option2.setText("");
        gui.option3.setText("");
        gui.option4.setText("");
        game.nextPosition1 = "findRiver";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
    
    public void riverFishFail () { //done
        gui.mainTextArea.setText("After a long time of looking, the river does not have the supplies to make a fishing rod.\nWhat do you do next?");
        gui.option1.setText("Head downstream.");
        gui.option2.setText("Sleep.");
        gui.option3.setText("");
        gui.option4.setText("");
        game.nextPosition1 = "downstream";
        game.nextPosition2 = "riverSleep";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
    
    public void oceanFire() { //done
        gui.mainTextArea.setText("You make a fire from wood near the beach.\nWhat do you do next?");
        gui.option1.setText("Get food.");
        gui.option2.setText("");
        gui.option3.setText("");
        gui.option4.setText("");
        game.nextPosition1 = "fishingRod";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
    
    public void fishRiver() { //done
        gui.mainTextArea.setText("You cast your line into the nearby river. After a while, you catch a fish.\nWhat do you do next?");
        gui.option1.setText("Go back to the wreckage.");
        gui.option2.setText("Fish in the Ocean.");
        gui.option3.setText("");
        gui.option4.setText("");
        game.nextPosition1 = "returnPlane2";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
    
    public void fishOcean() { //done
        gui.mainTextArea.setText("You cast your line into the ocean. You catch a tiny fish.\nWhat do you do next?");
        gui.option1.setText("Go back to the wreckage.");
        gui.option2.setText("Fish in the River.");
        gui.option3.setText("");
        gui.option4.setText("");
        game.nextPosition1 = "returnPlane2";
        game.nextPosition2 = "fishRiver";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
    
     public void returnPlane2() { //done
        gui.mainTextArea.setText("You start to head back to the plane, when you encounter a Wolf.\nWhat do you do next?");
        gui.option1.setText("Run away.");
        gui.option2.setText("Fight the Wolf.");
        gui.option3.setText("Hide.");
        gui.option4.setText("");
        game.nextPosition1 = "wolfRun";
        game.nextPosition2 = "wolfFight";
        game.nextPosition3 = "wolfHide";
        game.nextPosition4 = "";
    }
     
     public void wolfHide() { //done
        gui.mainTextArea.setText("You hide behind a tree, hoping the Wolf will not find you. Unfortunately, the Wolf runs up to the tree and finds you.\nWhat do you do next?");
        gui.option1.setText("Run away.");
        gui.option2.setText("Fight the Wolf.");
        gui.option3.setText("");
        gui.option4.setText("");
        game.nextPosition1 = "wolfRun";
        game.nextPosition2 = "wolfFight";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
     
     public void wolfFight() { //done 
        gui.mainTextArea.setText("You decide to fight the Wolf. You run at it. The Wolf somehow gets startled and flees. Where do you go next?");
        gui.option1.setText("Continue back to the wreckage.");
        gui.option2.setText("");
        gui.option3.setText("");
        gui.option4.setText("");
        game.nextPosition1 = "returnPlane3";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
     
     public void wolfRun() { //done
        gui.mainTextArea.setText("You run away from the Wolf. You narrowly escape it. Where do you go next?");
        gui.option1.setText("Continue back to the wreckage.");
        gui.option2.setText("");
        gui.option3.setText("");
        gui.option4.setText("");
        game.nextPosition1 = "returnPlane3";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
     
     public void returnPlane3() { //done
        gui.mainTextArea.setText("You return to the wreckage. It is getting very cold out. What do you do?");
        gui.option1.setText("Examine the wreckage.");
        gui.option2.setText("Sleep.");
        gui.option3.setText("");
        gui.option4.setText("");
        game.nextPosition1 = "examine";
        game.nextPosition2 = "sleepPlane2";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
     
     public void sleepPlane2() { //done
        gui.mainTextArea.setText("You cannot fall asleep in the cold. What do you do?");
        gui.option1.setText("Examine the wreckage.");
        gui.option2.setText("");
        gui.option3.setText("");
        gui.option4.setText("");
        game.nextPosition1 = "examine";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
     
     public void examine() { //done
        player.currentGear = new Gear_Jacket();
        gui.gearName.setText(player.currentGear.name);
        gui.mainTextArea.setText("You examine the wreckage. This time, you find a Jacket that is under a seat. You put on the jacket.");
        gui.option1.setText("Wait for help.");
        gui.option2.setText("");
        gui.option3.setText("");
        gui.option4.setText("");
        game.nextPosition1 = "end";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
     
     public void end() { //done
        gui.mainTextArea.setText("You wait for help in the cold, but you do not freeze with the jacket. A few hours later, you hear a helicopter! You are saved!!!");
        gui.option1.setText("");
        gui.option2.setText("");
        gui.option3.setText("");
        gui.option4.setText("");
        game.nextPosition1 = "";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
}   
//end