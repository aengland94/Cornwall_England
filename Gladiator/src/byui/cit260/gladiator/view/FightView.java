/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.view;

import byui.cit260.gladiator.control.GameControl;
import byui.cit260.gladiator.model.Game;
import byui.cit260.gladiator.model.Room;
import gladiator.Gladiator;
import java.util.Scanner;

/**
 *
 * @author Camdey
 */
public class FightView {
    public FightView() {
       
    }
    private void displayFight() {
        System.out.println("\n*** Displays the Fight ***");
    }
    private boolean doAction(String fght) {
        Room room = GameControl.createRoom();
        if(room == null){
            System.out.println("\n*** ERROR ** Room is null ***");
            return true;
        }
        if(room.isPerson()){
        if(room.getCharacter() == null){
            System.out.println("\n*** ERROR ** Character is null ***");
        }
        else if(fght.equals(room.getCharacter().getName())){
            displayFight();
        }
        else if (fght.equals(Gladiator.getPlayer().getName())){
            System.out.println("\nAs you are walking, you trip over your feet."
                             + "\nThis causes you to fly foreward and land on your face."
                             + "\nYou stand up to find the only thing dammaged is your pride.");
            return false;
        }
        else {
            System.out.println("\nYou run around the room looking for " + fght + "." 
                             + "You can't find them in the room.");
            return false;
        }}
        else {
            System.out.println("\nYou charge foreward ready for the fight with your fists clenched."
                             + "\nYou can fill the adrenaline pumping through your vains as your " 
                             + "\nknucles turn white. Your head pounds, and you start to break a " 
                             + "sweat. Suddenly your body relaxes a bit as you realize you are the " 
                             + "one in the room. You feel your face turn a bright red.");
        }
        return true;
    }
    private String getChoice() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while(!valid){
            
            value = keyboard.nextLine();
            value = value.trim();
            
            if(value.length() < 1){
                System.out.println("\nINVALID!!! Please enter a command!");
            }
            else{
                valid = true;
            }
        }
        return value;
    }
 public void display() {
        boolean done = false;
        do{
            System.out.println("\nWhat are you fighting?");
            String action = getChoice(); 
            if(action.toUpperCase().equals("Q")){
                return;
            }

            done = doAction(action);
        }while(!done);
        return;
    }
}
