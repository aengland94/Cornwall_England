/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.control;

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
    
    public int fight(int attackerStats, int weapon, int defenderStats, int armour) { 
        if(attackerStats < 1){
            System.out.println("Error! Attacker Stats are too low");
            return 0;
        }
        if(weapon < 0){
            System.out.println("Error! Weapon cannot be negative");
            return 0;
        }
        if(defenderStats < 0){
            System.out.println("Error! Defender Stats cannot be negative");
            return 0;
        }
        if(armour < 0){
            System.out.println("Error! Armour cannot be negative");
            return 0;
        }
        int lostHealth = (defenderStats + armour) - (attackerStats + weapon);
        if(lostHealth < 0){
            lostHealth = -1;}
        else{
            lostHealth = 0;}
        return lostHealth; }
    
}
