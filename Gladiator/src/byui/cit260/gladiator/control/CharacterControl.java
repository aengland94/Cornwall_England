/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.control;

import byui.cit260.gladiator.exceptions.PlayerControlExceptions;
import gladiator.Gladiator;

/**
 *
 * @author Anthony
 */
public class CharacterControl {
    public CharacterControl() { }
    
    public static int health(int start, int stop) {
        int health;
        health = Control.randInt(start, stop) + (Gladiator.getCurrentFloor() * Gladiator.getCurrentFloor());
        return health;
    }
    
    public static int fight(int attackerStats, int weapon, int defenderStats, int armour) throws PlayerControlExceptions { 
        if(attackerStats < 1){
            throw new PlayerControlExceptions("Error! Attacker Stats are too low");
        }
        if(weapon < 0){
            throw new PlayerControlExceptions("Error! Weapon cannot be negative");
        }
        if(defenderStats < 0){
            throw new PlayerControlExceptions("Error! Defender Stats cannot be negative");
        }
        if(armour < 0){
            throw new PlayerControlExceptions("Error! Armour cannot be negative");
        }
        int lostHealth = (defenderStats + armour) - (attackerStats + weapon);
        if(lostHealth < 0){
            lostHealth = -1;}
        else{
            lostHealth = 0;}
        return lostHealth; }
    
}
