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
        super("Hit enter to go to the current room");
    }
    @Override
    protected boolean doAction(String string){
        NextRoomView next = new NextRoomView();
        next.display();
        return true;
    }
    
    @Override
    protected String getInput(){
        Scanner keyboard = new Scanner(System.in);
        String value = null;

        //prompt for the player's name
        System.out.println("\n" + this.displayMessage);

        //get the value entered from the keyboard
        value = keyboard.nextLine();
        value = value.trim();
            
        return value; //return the name
    }
}
