/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.model;

import byui.cit260.gladiator.control.Control;
import byui.cit260.gladiator.control.GameControl;
import gladiator.Gladiator;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Anthony
 */
public class Room implements Serializable{

    protected String _description = null;
    protected int _x = 0;
    protected int _y = 0;
    protected boolean _person = false;
    protected boolean _item = false;
    protected Character _character = null;
    protected Armour _armour = null;
    protected Item _special = null;
    protected Weapon _weapon = null;
    protected String _type = null;
    protected int _num = 0;
    
    
    public Room() {
        _x = Gladiator.getCurrentRoomNum();
        _y = Gladiator.getCurrentFloor();
        _type = "PLAIN ROOM";
        addPerson();
        addItem();
        addDescription();
        addCharacter();
    }
    
    
    protected void addDescription() { 
        _num = Control.randInt(1, 2);
        if(!_person && !_item){
            _description = "This room is rather boring and has nothing of interest.";
        }
    }
    
    protected void addCharacter(){
        if(_person){
            _character = GameControl.createCharacter();
        }
    }
    
    protected void addPerson() {
        _num = Control.randInt(1,2);
        _person = _num != 1;
    }
    
    protected void addItem() {
        _num = Control.randInt(1,2);
        _item = _num != 1;
        
        if(_item){
            _num = Control.randInt(1,3);
            
            switch(_num){
                case 1:
                    _special = new Armour();
                    break;
                case 2:
                    _special = new Weapon();
                    break;
                default:
                    _special = new Item();
            }
        }
    }
    public String getType() { return _type; }
    public void setWeapon(Weapon weapon) { _weapon = weapon; }
    public void setArmour(Armour armour) { _armour = armour; }
    public void setItem(Item item) { _special = item; }
    protected void createWeapon() {  _weapon = new Weapon(); }
    protected void createArmour() { _armour = new Armour(); }
    protected void createItem() { _special = new Item(); }
    public Weapon getWeapon() { return _weapon; }
    public Armour getArmour() { return _armour; }
    public Item getItem() { return _special; }
    
    public Character getCharacter() {
        return _character;
    }
    public void setCharacter(Character character) {
        _character = character;
    }
    public String getDescription() { return _description; }
    public void setDescription(String description) { _description = description; }
    public int getX() { return _x; }
    public void setX(int x) { _x = x; }
    public int getY() { return _y; }
    public void setY(int y) { _y = y; }
    public boolean isPerson() { return _person; }
    public void setPerson(boolean person) { _person = person; }
    public boolean isItem() { return _item; }

    /**
     *
     * @param item
     */
    public void setItem(boolean item) { _item = item; }

    @Override
    public String toString() {
        return "Room{" + "_description=" + _description + ", _x=" + _x + ", _y=" + _y + ", _person=" + _person + ", _item=" + _item + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this._description);
        hash = 47 * hash + this._x;
        hash = 47 * hash + this._y;
        hash = 47 * hash + (this._person ? 1 : 0);
        hash = 47 * hash + (this._item ? 1 : 0);
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
        final Room other = (Room) obj;
        if (this._x != other._x) {
            return false;
        }
        if (this._y != other._y) {
            return false;
        }
        if (this._person != other._person) {
            return false;
        }
        if (this._item != other._item) {
            return false;
        }
        return Objects.equals(this._description, other._description);
    }
    
    
    
}
