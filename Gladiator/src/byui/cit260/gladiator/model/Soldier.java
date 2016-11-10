/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.model;

import byui.cit260.gladiator.control.CharacterControl;
import byui.cit260.gladiator.control.Control;
import java.io.Serializable;

/**
 *
 * @author Anthony
 */
public class Soldier extends Character implements Serializable{
    public Soldier() {
        _type = "soldier";
        addArmour();
        addWeapon();
        addStrength();
        addConst();
        addHealth();
        addDecription();
    }
    
    private void addHealth() {
        _health = CharacterControl.health(4, 8);
    }
    
    private void addConst() {
        _num = Control.randInt(1, 5);
    }
    
    private void addStrength() {
        _num = Control.randInt(1, 5);
    }
}
