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
public class GameMenuView extends MenuView{
    public GameMenuView() { 
        super("", "", "");
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
                break;
            case "LOAD":
                break;
            case "HELP":
                break;
            case "SAVE":
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
        }
        return false;
    }
    
}
