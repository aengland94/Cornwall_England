/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.view;

/**
 *
 * @author Anthony
 */
public class ActionMenuView extends MenuView{
    public ActionMenuView() {
        super("ACTION", "LOOK - (discribes the room you are in)", 
                "TALK - (starts conversation with someone)",
                "FIGHT - (starts a battle)", "GET - (puts item in your inventory)",
                "GO - (moves you to another room)", "HELP - (displays the Help Menu)");
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
            case "L":
            case "LOOK":
                displayLook();
                break;
            case "T":
            case "TALK":
                displayTalk();
                break;
            case "F":
            case "FIGHT":
                displayFight();
                break;
            case "G":
            case "GET":
                displayGet();
                break;
            case "O":
            case "GO":
                displayGo();
                break;
            case "H":
            case "HELP":
                displayHelp();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
        }
        return false;
    }
    
    private void displayLook() {
        System.out.println("\n*** displayLook() has been called ***");
    }
    private void displayTalk() {
        System.out.println("\n*** displayTalk() has been called ***");
    }
    private void displayFight() {
        System.out.println("\n*** displayFight() has been called ***");
        FightView fight = new FightView();
        fight.display();
    }
    private void displayGet() {
        System.out.println("\n*** displayGet() has been called ***");
    }
    private void displayGo() {
        System.out.println("\n*** displayGo() has been called ***");
    }
    private void displayHelp() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }
    
}
