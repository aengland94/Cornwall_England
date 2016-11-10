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
    protected String _name = null;
    protected String _type = null;
    protected int _health = 1;
    protected int _constitution = 1;
    protected int _defence = 0;
    protected Armour _armour = null;
    protected int _strength = 1;
    protected int _attack = 0;
    protected Weapon _weapon = null;
    protected Item _item = null;
    protected int _x = 0;
    protected int _y = 0;
    protected boolean _alive = true;
    protected String _description = null;
    protected int _num = 0;
    
    public Character(){
        _name = "JOE";
        _type = "servant";
    }
    
    protected void addDecription() {
        String p1 = "a " + _type + " named " + _name;
        String p2 = "";
        String p3 = "";
        String p4 = "";
        String p5 = "";
        
        if(_armour != null){
            p2 = " wearing " + _armour.getDescription();
        }
        if(_weapon != null){
            p3 = " holding " + _weapon.getDescription();
        }
        
        if(_strength < 6){
            p4 = "\nThey have almost no muscle ";
        }
        else if(_strength < 11){
            p4 = "\nThey have some muscle but it isn't very toned ";
        }
        else{
            p4 = "\nThey have very toned muscle ";
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
    
    protected void addArmour() {
        
        _armour = new Armour();
    }
    
    protected void addWeapon() {
        _weapon = new Weapon();
    }

    
    
    public String getDescription() { return _description; }
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
