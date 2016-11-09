/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.view;

import byui.cit260.gladiator.model.Player;
import gladiator.Gladiator;

/**
 *
 * @author Anthony
 */
public class HelpMenuView extends MenuView{
    public HelpMenuView() { 
        type = "HELP";
        command1 = "\n \tMAIN - (displays the main menu)";
        command2 = "\n \tACTION - (displays the action menu)";
        command3 = "\n \tSTATS - (displays stats like health and room)";
        command4 = "\n \tPLAY - (returns to the current game)";
    }
    @Override
    protected boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch (choice){
            case "MAIN":
                displayMain();
                break;
            case "ACTION":
                displayAction();
                break;
            case "STATS":
                displayStats();
                break;
            case "PLAY":
                displayPlay();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
        }
        return false;
    }
    private void displayMain() {
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }
    private void displayAction() {
        ActionMenuView actionMenuView = new ActionMenuView();
        actionMenuView.display();
    }
    private void displayStats() {
        Player player = Gladiator.getPlayer();
        player.displayStats();
    }
    private void displayPlay() {
        System.out.println("\n*** displayPlay() has been called ***");
    }
}