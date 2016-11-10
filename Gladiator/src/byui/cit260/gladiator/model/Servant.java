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
public class Servant extends Character implements Serializable{
    public Servant() {
        _type = "servant";
        addArmour();
        addWeapon();
        addStrength();
        addConst();
        addHealth();
        addDecription();
    }
    
    @Override
    protected void addArmour() {
        _num = Control.randInt(1, 20);
        if(_num == 20){
            _armour = new Armour();
        }
    }
    
    @Override
    protected void addWeapon() {
        _num = Control.randInt(1, 30);
        
        if(_num == 20){
            _weapon = new Weapon();
        }
    }
    
    private void addHealth() {
        _health = CharacterControl.health(1, 2);
    }
    
    private void addConst() {
        _num = Control.randInt(1, 5);
    }
    
    private void addStrength() {
        _num = Control.randInt(1, 5);
    }
}
