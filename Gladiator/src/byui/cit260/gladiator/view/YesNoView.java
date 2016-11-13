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
abstract class YesNoView extends View{
    public YesNoView(String message) { 
        super("\n" + message + "\nYES or NO?");
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
            case "Y":
            case "YES":
                yes();
                break;
            case "N":
            case "NO":
                no();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
        }
        return false;
    }
    
    protected void yes(){
        
    }
    
    protected void no() {
        
    }
}
