/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.model;


import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Anthony
 */
public class Character implements Serializable {
    private String _name;
    private int _health;
    private Item[] bag;
    private int _defence;
    private int _attack;
    private int _x;
    private int _y;
    private boolean _alive;
    
    public Character(){ bag = new Item[3]; }
    
    public String getName() {return _name; }
    public int getHealth() { return _health; }
    public void setHealth(int health) { _health = health; }
    public Item[] getBag() { return bag; }
    
    public void setBag(Item newItem) {
        int i = bag.length;
        if (i < 4){
            bag[i - 1] = newItem;}
            //System.out.println(bag.length);}
            //System.out.println(bag[0].getName());}
        else{
            System.out.println("Sorry, your bag is full.\n"
                    + " Try dropping something first!");}}
    
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

    @Override
    public String toString() {
        String item1 = "EMPTY";
        String item2 = "EMPTY";
        String item3 = "EMPTY";
        
        for(int i=0; i>bag.length; i++){ 
            if(i < 1){
                //System.out.println('A');
                item1 = bag[i].getName();}
            else if(i == 1){
                //System.out.println('B');
                item2 = bag[i].getName();}
            else{
                //System.out.println('C');
                item3 = bag[i].getName();}}
            
        
        return "Character{" + "_name=" + _name + ", _health=" + _health 
                + ", bag=(" + item1 + ", " + item2 + ", " + item3 + ")" 
                + ", _defence=" + _defence + ", _attack=" + _attack + ", _x=" + _x + ", _y=" + _y + ", _alive=" + _alive + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this._name);
        hash = 47 * hash + this._health;
        hash = 47 * hash + Arrays.deepHashCode(this.bag);
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
        if (!Objects.equals(this._name, other._name)) {
            return false;
        }
        return Arrays.deepEquals(this.bag, other.bag);
    }
    
    
    
}
