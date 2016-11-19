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
    ACHILLES(1,"Tall, well built man with large armour",new Weapon("SWORD", 2), new Armour()),
    BRUTUS(2,"Large man, doesn't seem very bright, but is determined to not let you pass!",new Weapon("SWORD", 2), new Armour()),
    CURTIS(3,"Tall black man, standing in front of the door with his arms crossed with a menacing look on his face.",new Weapon("SWORD", 2), new Armour()),
    DIDIUS(4,"He looks slightly egyptian, always squinting his eyes, can't see very well.",new Weapon("SWORD", 2), new Armour()),
    EQUITIUS(5,"He has a long face with a blank look. Doesn't look like there is anyone home but he can wield a sword very well.",new Weapon("SWORD", 2), new Armour()),
    FURIUS(6,"He is an angry and short man, but he is determined not to let his height ",new Weapon("SWORD", 2), new Armour()),
    GAIUS(7,"Very large man with armour that is too small for him, with a giant sword and shield",new Weapon("SWORD", 2), new Armour()),
    HABITUS(8,"Average man that doesn't seem to be all there in the head but looks like he could slice through you like a warm knife through soft butter.",new Weapon("SWORD", 2), new Armour()),
    ICARUS(9,"Large man with lightning fast reflexes, looks to be the most challenging compared to all the other bosses. Good luck!",new Weapon("SWORD", 2), new Armour()),
    JULIUS_CAESAR(10,"Tall white man with short blonde hair with an irritated scowl on his face.",new Weapon("SWORD", 2), new Armour()); 
    
    
    private final int health;
    private final String description;
    private final Weapon weapon;
    private final Armour armour;
    
    // overoaded constructor where you pass in the helth and descriptions. The 
    // constructor then assigns the value passed in to the healt and description in this class
    Boss(int health, String description, Weapon weapon, Armour armour){
        this.health = health;
        this.description = description;
        this.weapon = weapon;
        this.armour = armour;
    }
    // create getter function for each instance variable
    

}
