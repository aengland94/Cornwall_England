/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.view;

import byui.cit260.gladiator.control.GameControl;
import byui.cit260.gladiator.model.Player;
import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Anthony
 */
public class StartProgramView implements Serializable{
    public StartProgramView() { 
        promptMessage = "Welcome Warrior! What should we call you?";
        
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
        + "your people as well as the winning of the Game!\n");
    }
    private String getPlayersName() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while(!valid){
            System.out.println("\n" + promptMessage);
            
            value = keyboard.nextLine();
            value = value.trim();
            
            if(value.length() < 1){
                System.out.println("\nINVALID!!! Your name cannot be left blank!");
            }
            else{
                valid = true;
            }
        }
        return value;
    }
    private boolean doAction(String playersName){
        if(playersName.length() < 2){
            System.out.println("Invalid name: The name must be > 1 character");
            return false;
        }
        Player player = GameControl.createPlayer(playersName);
        if(player == null){
            System.out.println("\nError creating the player.");
            return false;
        }
        displayNextView(player);
        return true;
    }
    private void displayNextView(Player player) {
        System.out.println("\n*** displayNextView() called ***");
        System.out.println("\n========================================"
                         + "\n Welcome " + player.getName()
                         + "\n Your people are counting on you!"
                         + "\n Good luck :)"
                         + "\n========================================");
        MainMenuView mainMenuView = new MainMenuView(); 
        
        mainMenuView.display();
    }
    public void displayStartProgramView() {
        System.out.println("\n*** displayStartProgram() called ***\n");
        
        boolean done = false;
        do{
            String name = getPlayersName(); 
            if(name.toUpperCase().equals("Q")){
                return;
            }
            done = doAction(name);
        }while(!done);
    }

private String promptMessage;
}
