/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.model;

import byui.cit260.gladiator.control.Control;
import byui.cit260.gladiator.control.PlayerControl;
import java.awt.Point;
import java.io.Serializable;

/**
 *
 * @author Anthony
 */
public class Player extends Character implements Serializable{

    public static Player[] values() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private int _maxHealth;
    private double _bestTime;
    private String[][] inventory = {{"WEAPON","[EMPTY]"},{"ARMOUR","[EMPTY]"},
                                    {"FLOOR-KEY","[EMPTY]"}};

    public Player() {
        _maxHealth = 5;
        
        addStrength();
        addConst();
        addHealth();
        addDecription();
    }
    
    public String[][] getInventory(){ return inventory; }
    public void setInventory(int num, String name){
        inventory[num][1] = name;
    }
    
    @Override
    protected void addDecription() {
        String p1 = "You are a " + _type + " named " + _name;
        String p2 = "";
        String p3 = "";
        String p4 = "";
        String p5 = "ÆMILIUS";
        
        if(_armour != null){
            p2 = " wearing " + _armour.getDescription();
        }
        if(_weapon != null){
            p3 = " holding " + _weapon.getDescription();
        }
        
        if(_strength < 6){
            p4 = "\nYou have almost no muscle ";
        }
        else if(_strength < 11){
            p4 = "\nYou have some muscle but it isn't very toned ";
        }
        else{
            p4 = "\nYou have very toned and chiseled muscles ";
        }
        
        if(_strength < 6){
            p5 = "and are a twig ";
        }
        else if(_strength < 11){
            p5 = "and are not anything special ";
        }
        else if(_strength < 16){
            p5 = "and are very well built ";
        }
        else{
            p5 = "and are jacked ";
        }
        
        _description = p1 + p2 + p3 + p4 + p5;
    }
    private void addHealth() {
        _health = PlayerControl.health(5,5);
    }
    
    private void addConst() {
        _num = Control.randInt(8, 16);
    }
    
    private void addStrength() {
        _num = Control.randInt(6, 12);
    }
    
    public void setWeapon(Weapon weapon) { _weapon = weapon; }
    public void setArmour(Armour armour) { _armour = armour; }
    public void setItem(Item item) { _item = item; }
    
    public int getMaxHealth() { return _maxHealth; }
    public void setMaxHealth(int maxHealth) { _maxHealth = maxHealth; }
    public double getBestTime() { return _bestTime; }
    public void setBestTime(double bestTime) { _bestTime = bestTime; }
    
    public void displayStats(){
        System.out.println("\nYou are " + _name
                         + "\nYour Health is " + _health 
                         + " and Max Health is " + _maxHealth
                         + "\nYou are in room " + _x + " of floor " + _y);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this._maxHealth;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this._bestTime) ^ (Double.doubleToLongBits(this._bestTime) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (this._maxHealth != other._maxHealth) {
            return false;
        }
        if (Double.doubleToLongBits(this._bestTime) != Double.doubleToLongBits(other._bestTime)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Player{" + "_name=" + _name +", _maxHealth=" + _maxHealth + ", _bestTime=" + _bestTime + '}';
    }

    public Point getCoordinates() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
