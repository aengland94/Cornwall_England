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
        super("HELP", "MAIN - (displays the main menu)", "ACTION - (displays the action menu)",
                "STATS - (displays stats like health and room)", "MAP - (displays the floors map)",
                "ROOM - (displays the current room you are in)");
    }
    @Override
    protected boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch (choice){
            case "M":
            case "MAIN":
                displayMain();
                break;
            case "A":
            case "ACTION":
                displayAction();
                break;
            case "S":
            case "STATS":
                displayStats();
                break;
            case "I":
            case "INVETORY":
                displayInventory();
                break;
            case "F":
            case "MAP":
                displayMap();
                break;
            case "R":
            case "ROOM":
                displayPlay();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
        }
        return false;
    }
    private void displayInventory(){
        Gladiator.getPlayer().getInventory();
    }
    private void displayMap() {
//        MapView map = new MapView();
//        map.display();
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
