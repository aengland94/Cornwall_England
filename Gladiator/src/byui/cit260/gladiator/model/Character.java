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
public class Character implements Serializable {
    protected String _name;
    protected String _type;
    protected int _health;
    protected int _constitution;
    protected int _defence;
    protected Armour _armour;
    protected int _strength;
    protected int _attack;
    protected Weapon _weapon;
    protected Item _item;
    protected int _x;
    protected int _y;
    protected boolean _alive;
    protected String _discription;
    
    public Character(){
        _name = "JOE";
        _type = "servant";
    }
    
    public String getDiscription() { return _discription; }
    public String getName() {return _name; }
    public String getType() {return _type; }
    public void setName(String name) { _name = name; }
    public int getHealth() { return _health; }
    public void setHealth(int health) { _health = health; }
    public int getDefence() { return _defence; }
    public void setDefence(int defence) { _defence = defence; }
    public int getAttack() { return _attack; }
    public void setAttack(int attack) { _attack = attack; }
    public int getX() { return _x; }
    public void setX(int x) { _x = x; }
    public int getY() { return _y; }
    public void setY(int y) { _y = y; }

    /**
     *
     * @return
     */
    public boolean isAlive() { return _alive; }
    public void setAlive(boolean alive) { _alive = alive;}
    
    protected void createWeapon() {  _weapon = new Weapon(); }
    protected void createArmour() { _armour = new Armour(); }
    protected void createItem() { _item = new Item(); }
    public Weapon getWeapon() { return _weapon; }
    public Armour getArmour() { return _armour; }
    public Item getItem() { return _item; }

    @Override
    public String toString() {             
            return "Character{" + "_name=" + _name + ", _health=" + _health 
                + ", _defence=" + _defence + ", _attack=" + _attack + ", _x=" + _x + ", _y=" + _y + ", _alive=" + _alive + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this._name);
        hash = 47 * hash + this._health;
        hash = 47 * hash + this._defence;
        hash = 47 * hash + this._attack;
        hash = 47 * hash + this._x;
        hash = 47 * hash + this._y;
        hash = 47 * hash + (this._alive ? 1 : 0);
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
        final Character other = (Character) obj;
        if (this._health != other._health) {
            return false;
        }
        if (this._defence != other._defence) {
            return false;
        }
        if (this._attack != other._attack) {
            return false;
        }
        if (this._x != other._x) {
            return false;
        }
        if (this._y != other._y) {
            return false;
        }
        if (this._alive != other._alive) {
            return false;
        }
        return Objects.equals(this._name, other._name);
    }
    
    
    
}
