/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.view;

import byui.cit260.gladiator.control.GameControl;
import byui.cit260.gladiator.model.Game;
import byui.cit260.gladiator.model.Room;
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
            displayFight();
        }
        else {
            System.out.println("\nThere is nothing here to fight.");
        }
        return false;
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
    }
}
