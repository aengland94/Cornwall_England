/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.view;

import byui.cit260.gladiator.control.CharacterControl;
import byui.cit260.gladiator.exceptions.PlayerControlExceptions;
import gladiator.Gladiator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Anthony
 */
public class CharacterFightView extends NoInputView {
    public CharacterFightView() { 
        super("\nThey decide to fight");
    }
    
    private void displayFight() throws PlayerControlExceptions {
        
        int health;
        int mod =  
                CharacterControl.fight(Gladiator.getCurrentRoom().getCharacter().getAttack(), 
                Gladiator.getCurrentRoom().getCharacter().getWeapon().getModifier(), 
                Gladiator.getPlayer().getDefence(),
                Gladiator.getPlayer().getArmour().getModifier());
        health = Gladiator.getPlayer().getHealth() + mod;
        Gladiator.getPlayer().setHealth(health);
        if(mod < 0){
            System.out.println("\nYou were hit!!!");
        }
        else{
            System.out.println("\nYou were missed");
        }
        nextView(health);
    }
    @Override
    protected void nextView() { }
    private void nextView(int health){
        if(health > 0){
            FightYesNoView fight = new FightYesNoView();
            fight.display();
        }
        else{
            System.out.println("\nThe last hit was too much for you to handle. "
                    + "\nYou die and your body slumps to the floor.");
            KeepPlayingYNView play = new KeepPlayingYNView();
            play.display();
        }
    }
    
    @Override
    protected boolean doAction(String string) {
        System.out.println(string);
        try {
            displayFight();
        } catch (PlayerControlExceptions ex) {
            Logger.getLogger(CharacterFightView.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    
}
