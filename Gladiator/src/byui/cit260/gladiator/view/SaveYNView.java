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
public class SaveYNView extends YesNoView {
    public SaveYNView(){
        super("Would you like to save first?");
    }
    
    @Override
    protected void yes(){
        SaveView save = new SaveView();
        save.display();
    }
    
    @Override
    protected void no(){
        QuitYNView quit = new QuitYNView();
        quit.display();
    }
}
