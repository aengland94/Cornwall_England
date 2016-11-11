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
public class FightYesNoView extends YesNoView{
    FightYesNoView(){
        super("Would you like to fight back?");
    }
    
    @Override
    protected void yes() {
        FightView fight = new FightView();
        fight.display();
    }
    
    @Override
    protected void no() {
        ActionMenuView menu = new ActionMenuView();
        menu.display();
    }
}
