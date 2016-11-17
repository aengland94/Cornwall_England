/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.model;

/**
 *
 * @author Anthony
 */
public enum Boss{
    ANTON(1,"food",new Weapon("SWORD", 2), new Armour()),
    BOB(2,"water",new Weapon("SWORD", 2), new Armour());
    
    private final int health;
    private final String descrpition;
    private final Weapon weapon;
    private final Armour armour;
    
    // overoaded constructor where you pass in the helth and descriptions. The 
    // constructor then assigns the value passed in to the healt and description in this class
    Boss(int health, String description, Weapon weapon, Armour armour){
        this.health = health;
        this.descrpition = description;
        this.weapon = weapon;
        this.armour = armour;
    }
    // create getter function for each instance variable
    

}
