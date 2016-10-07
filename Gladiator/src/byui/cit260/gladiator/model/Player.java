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
public class Player implements Serializable{
    private String _name;
    private double _bestTime;

    public Player() {
    }
    
    public String getName() { return _name;}
    public void setName(String name) {_name = name; }
    public double getBestTime() { return _bestTime; }
    public void setBestTime(double bestTime) { _bestTime = bestTime; }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this._name);
        hash = 41 * hash + (int) (Double.doubleToLongBits(this._bestTime) ^ (Double.doubleToLongBits(this._bestTime) >>> 32));
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
        if (Double.doubleToLongBits(this._bestTime) != Double.doubleToLongBits(other._bestTime)) {
            return false;
        }
        return Objects.equals(this._name, other._name);
    }

    @Override
    public String toString() {
        return "Player{" + "_name=" + _name + ", _bestTime=" + _bestTime + '}';
    }
    
}
