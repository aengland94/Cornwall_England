/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.model;

import java.io.Serializable;

/**
 *
 * @author Anthony
 */
public class Map implements Serializable {
    
    private int _floor;
    private int _room;

    public Map() { }
    
    public int getFloor() { return _floor; }
    public void setFloor(int floor) { _floor = floor; }
    public int getRoom() { return _room; }
    public void setRoom(int room) { _room = room; }

    @Override
    public String toString() {
        return "Map{" + "_floor=" + _floor + ", _room=" + _room + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this._floor;
        hash = 59 * hash + this._room;
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
        final Map other = (Map) obj;
        if (this._floor != other._floor) {
            return false;
        }
        if (this._room != other._room) {
            return false;
        }
        return true;
    }

    public int getNoOfColumns() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getNoOfRows() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    }
