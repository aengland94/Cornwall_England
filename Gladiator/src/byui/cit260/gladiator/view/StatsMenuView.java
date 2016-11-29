/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.view;

import byui.cit260.gladiator.control.GameControl;
import byui.cit260.gladiator.model.Player;
import gladiator.Gladiator;

/**
 *
 * @author Anthony
 */
public class StatsMenuView extends MenuView{
    StatsMenuView(){
        super("STATS","BASICS - (displays basic stats like health and room)",
              "KILLS - (displays the number of your kills)",
              "DEATHS - (displays the number of your deaths)",
              "ROOMS - (displays the number of rooms visited)",
              "HELP - (displays help menu)");
    }
    
    @Override
    protected boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch (choice){
            case "B":
            case "BASICS":
                displayBasics();
                nextView();
                break;
            case "K":
            case "KILLS":
                displayKills();
                nextView();
                break;
            case "D":
            case "DEATHS":
                displayDeaths();
                nextView();
                break;
            case "R":
            case "ROOM":
                displayRooms();
                nextView();
                break;
            case "H":
            case "Help":
                displayHelp();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
        }
        return false;
    }
    private void displayBasics(){
        Player player = Gladiator.getPlayer();
        player.displayStats();
    }
    private void displayKills(){
        int kills = GameControl.kills();
        System.out.println("You have succesfully killed someone " + kills + " time(s)");
    }
    private void displayDeaths(){
        int deaths = GameControl.deaths();
        System.out.println("You have died " + deaths + " time(s)");
    }
    private void displayRooms(){
        
    }
    private void displayHelp(){
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }
    private void nextView(){
        GTRoomView room = new GTRoomView();
        room.display();
    }
}
