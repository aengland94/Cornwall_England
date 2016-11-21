/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.view;

import java.util.Scanner;

/**
 *
 * @author Anthony
 */
public class GTRoomView extends View{
    GTRoomView(){
        
    }
    @Override
    protected boolean doAction(String string){
        return true;
    }
    
    @Override
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
