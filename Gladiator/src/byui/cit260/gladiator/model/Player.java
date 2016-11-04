/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Anthony
 */
public class Player extends Character implements Serializable{
    private int _maxHealth;
    private double _bestTime;

    public Player() {
        _x = 1;
        _y = 1;
        _maxHealth = 5;
        _health = 5;
    }
    
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

    
    
}
