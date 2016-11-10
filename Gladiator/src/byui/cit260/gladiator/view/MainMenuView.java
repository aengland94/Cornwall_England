/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.view;

import byui.cit260.gladiator.control.GameControl;
import gladiator.Gladiator;
import java.util.Scanner;

/**
 *
 * @author Anthony
 */
public class MainMenuView extends MenuView{
    public MainMenuView() {
        super("MAIN", "NEW - (starts a new game)", "LOAD - (loads an existing game)",
                "SAVE - (saves the current game)", "HELP - (displays the help menu)");        
    }

    /**
     *
     * @param choice
     * @return
     */
    @Override
    protected boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch (choice){
            case "NEW":
                startNewGame();
                break;
            case "LOAD":
                loadExistingGame();
                break;
            case "HELP":
                displayHelpMenu();
                break;
            case "SAVE":
                saveGame();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
        }
        return false;
    }
    private void startNewGame() {
        GameControl.createNewGame(Gladiator.getPlayer());
    }
    private void loadExistingGame() {
        System.out.println("*** loadExistingGame() function called ***");
    }
    private void saveGame() {
        System.out.println("*** saveGame() function called ***");
    }
    private void displayHelpMenu() {
        System.out.println("*** displayHelpMenu() function called ***");
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }
}
