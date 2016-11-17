/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.view;

import java.util.Scanner;

/**
 *
 * @author Krissy
 */
public abstract class View implements ViewInterface {
    public View() { }
    
    protected String displayMessage = "*** Stub ***";
    
    public View(String message) {
        this.displayMessage = message;
    }
    
    protected abstract boolean doAction(String string);
    
    @Override
    public void display() {
        boolean done;
        do{
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the view
            
            //do the requested action and display the next view
            done = this.doAction(value);
            
        } while (!done);
    }
    
    
    protected String getInput(){
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String value = null;
        
        // while a valid name has not be retrieved
        while (!valid) {
            
            //prompt for the player's name
            System.out.println("\n" + this.displayMessage);
            
            //get the value entered from the keyboard
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length() < 1) { // blank value entered
                System.out.println("\n*** INVALID!!! ** Please enter a command! ***");
            }
            else{
                valid = true;
            }
        }
        return value; //return the name
    }
}
