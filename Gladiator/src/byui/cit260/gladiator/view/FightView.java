/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.view;

import byui.cit260.gladiator.control.PlayerControl;
import byui.cit260.gladiator.model.Room;
import gladiator.Gladiator;

/**
 *
 * @author Camdey
 */
public class FightView extends NoInputView{
    public FightView() {
       super("\nYou decide to fight");
    }
    private void displayFight() {
        
        int health;
        int mod =  
                PlayerControl.fight(Gladiator.getPlayer().getAttack(), 
                Gladiator.getPlayer().getWeapon().getModifier(), 
                Gladiator.getCurrentRoom().getCharacter().getDefence(), 
                Gladiator.getCurrentRoom().getCharacter().getArmour().getModifier());
        health = Gladiator.getCurrentRoom().getCharacter().getHealth() + mod;
        Gladiator.getCurrentRoom().getCharacter().setHealth(health);
        if(mod < 0){
            System.out.println("\nYou hit!!!");
        }
        else{
            System.out.println("\nYou missed");
        }
        nextView(health);
    }
    @Override
    protected void nextView() { }
    private void nextView(int health){
        if(health > 0){
            CharacterFightView fight = new CharacterFightView();
            fight.display();
        }
        else{
            Gladiator.getCurrentRoom().getCharacter().setAlive(false);
            Gladiator.getCurrentRoom().setPerson(false);
            System.out.println("\nYour hit killed them and their body slumps to the floor!");
        }
    }
    @Override
    protected boolean doAction(String fght) {
        System.out.println(fght);
        Room room = Gladiator.getCurrentRoom();
        if(room == null){
            System.out.println("\n*** ERROR ** You must start a game to fight ***");
            return true;
        }
        if(room.isPerson()){
        if(room.getCharacter() == null){
            System.out.println("\nYou charge foreward ready for the fight with your fists clenched."
                             + "\nYou can fill the adrenaline pumping through your vains as your " 
                             + "\nknucles turn white. Your head pounds, and you start to break a " 
                             + "sweat. Suddenly your body relaxes a bit as you realize you are the " 
                             + "one in the room. You feel your face turn a bright red.");
        }
        else {
            displayFight();
        }
        }
        else {
            System.out.println("\nYou charge foreward ready for the fight with your fists clenched."
                             + "\nYou can fill the adrenaline pumping through your vains as your " 
                             + "\nknucles turn white. Your head pounds, and you start to break a " 
                             + "sweat. Suddenly your body relaxes a bit as you realize you are the " 
                             + "one in the room. You feel your face turn a bright red.");
        }
        return true;
    }
    
}
