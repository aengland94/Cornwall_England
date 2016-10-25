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
    public StartProgramView() { }
    public void displayStartProgramView() {
        System.out.println("WELCOME TO GLADIATOR");
        System.out.print("Welcome Warrior! What should we call you?");
        String myName = System.console().readLine();
        
        Player player = GameControl.createPlayer(myName);
        //System.out.println("Hello " + player.getName());
    }
}
