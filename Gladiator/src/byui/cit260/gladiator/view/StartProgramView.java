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
public class StartProgramView extends View implements Serializable {
    public StartProgramView() {
        super("************************************************************************************************\n"
            + "************************************************************************************************\n"
            + "***                                                                                          ***\n"
            + "**      ######   ##          ###    ########  ####    ###    ########  #######  ########      **\n"
            + "**     ##    ##  ##         ## ##   ##     ##  ##    ## ##      ##    ##     ## ##     ##     **\n"
            + "**     ##        ##        ##   ##  ##     ##  ##   ##   ##     ##    ##     ## ##     ##     **\n"
            + "**     ##   #### ##       ##     ## ##     ##  ##  ##     ##    ##    ##     ## ########      **\n"
            + "**     ##    ##  ##       ######### ##     ##  ##  #########    ##    ##     ## ##   ##       **\n"
            + "**     ##    ##  ##       ##     ## ##     ##  ##  ##     ##    ##    ##     ## ##    ##      **\n"
            + "**      ######   ######## ##     ## ########  #### ##     ##    ##     #######  ##     ##     **\n"
            + "***                                                                                          ***\n"
            + "************************************************************************************************\n"
            + "************************************************************************************************\n\n"
                
        + "WELCOME TO GLADIATOR!\n"
        + "This is a game where you will be fighting your way through the\n"
        + "Coliseum to overthrow the current Caeser of Rome to free you\n"
        + "and your people from the bondage you are in as a Roman Gladiator.\n\n"
        + "During The Conquest of Rome, the Romans invaded your homeland. \n"
        + "While they were invading, they captured people from every \n"
        + "country they conquered and placed them in the Coliseum to fight \n"
        + "to the death for their own personal enjoyment. \n\n"   
        + "You will start at the bottom of the Coliseum. You will have\n"
        + "to search rooms, fight Bosses, and complete different objectives\n"
        + "each floor to be able to move onto the next floor. Each floor will\n"
        + "progressively get harder in diffuculty until you finally are able\n"
        + "to reach the top. There you will be given the opportunity to fight\n"
        + "Julius Caeser himself. Beating the Ceaser will result in freedom \n"
        + "for you and your people as well as the winning the Game!\n"
        + "\nWelcome Warrior! What should we call you?");
    }
    
    @Override
    protected boolean doAction(String playersName){
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
}
