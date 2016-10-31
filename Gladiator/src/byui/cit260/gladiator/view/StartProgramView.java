/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.view;

import byui.cit260.gladiator.control.GameControl;
import byui.cit260.gladiator.model.Player;
import java.io.Serializable;

/**
 *
 * @author Anthony
 */
public class StartProgramView implements Serializable{
    public StartProgramView() { 
        System.out.println("Welcome Warrior! What should we call you?");
        
        displayBanner();
    }
    private void displayBanner() {
        System.out.println("WELCOME TO GLADIATOR!\n"
        + "This is a game where you will be fighting your way through\n"
        + "a collecium to overthrow the current Ceaser of Rome to free\n"
        + "yourself and your people from the bondage you are in as a\n"
        + "Roman Gladiator.\n\n"
        + "You will start at the bottom of the collecium. You will have\n"
        + "to search rooms, fight Bosses, and complete different objectives\n"
        + "each floor to be able to move onto the next floor. Each floor will\n"
        + "progressively get harder in diffuculty until you finally are able\n"
        + "to reach the top. There you will be given the oppertunity to fight\n"
        + "Ceaser himself. Beating Ceaser will result in freedom for you and\n"
        + "your people as well as the winning of the Game!\n\n");
    }
    public void displayStartProgramView() {
        
        
        //String myName = System.console().readLine();
        
        //Player player = GameControl.createPlayer(myName);
        //System.out.println("Hello " + player.getName());
    }
}
