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
public class StillYNView extends YesNoView{
    public StillYNView(){
        super("Do you still want to do this?");
    }
    boolean yes = false;
    public boolean display(String string) {
        boolean done;
        do{
            System.out.println(string);
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) // user wants to quit
                return false; // exit the view
            
            //do the requested action and display the next view
            done = this.doAction(value);
            
        } while (!done);
        return yes;
    }
    
    @Override
    protected void yes(){
        yes = true;
    }
}
