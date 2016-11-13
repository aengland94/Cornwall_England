/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.view;

import gladiator.Gladiator;

/**
 *
 * @author Anthony
 */
public class QuitYNView extends YesNoView {
    public QuitYNView(){
        super("Are you sure you want to quite?");
    }
    
    @Override
    protected void yes(){
        System.out.println("\nGOODBYE " + Gladiator.getPlayer().getName());
    }
    
    @Override
    protected void no(){
        MainMenuView menu = new MainMenuView();
        menu.display();
    }
}
