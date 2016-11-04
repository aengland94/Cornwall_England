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
        type = "ACTION";
        command1 = "\n \tLOOK - (discribes the room you are in)";
        command2 = "\n \tTALK - (starts conversation with someone)";
        command3 = "\n \tFIGHT - (starts a battle)";
        command4 = "\n \tGET - (puts item in your inventory)";
        command5 = "\n \tGO - (moves you to another room)";
        command6 = "\n \tHELP - (displays the Help Menu)";
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
            case "LOOK":
                displayLook();
                break;
            case "TALK":
                displayTalk();
                break;
            case "FIGHT":
                displayFight();
                break;
            case "GET":
                displayGet();
                break;
            case "GO":
                displayGo();
                break;
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
