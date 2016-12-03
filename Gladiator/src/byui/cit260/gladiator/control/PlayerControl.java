/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.control;

import byui.cit260.gladiator.model.Item;
import byui.cit260.gladiator.model.Map;
import byui.cit260.gladiator.model.Player;
import java.io.Serializable;

/**
 *
 * @author Camdey
 */
public class PlayerControl extends CharacterControl implements Serializable{

    
    
    
    public int heal(Player player, Item fountain){ 
        if (fountain.getModifier() <= 0) {
            System.out.println(fountain.getName() + " is empty and cannot heal you");
            fountain.setModifier(0);
            return 0;}
        if (fountain.getModifier() > 6){
            fountain.setModifier(6);
        }
        if(player.getHealth() >= player.getMaxHealth()) {
            System.out.println("Your health was already full!");
            player.setHealth(player.getMaxHealth());
            return fountain.getModifier();}
        if (player.getHealth() <= 0) {
            System.out.println(player.getName() + " is dead");
            return fountain.getModifier();
        }
        if (player.getMaxHealth() <= 0) {
            System.out.println("Max Health is too low");
            return fountain.getModifier();
        }
        if (player.getY() < 0) {
            System.out.println("Y cannot be negative");
            return fountain.getModifier();
        }
        
        int neededHealth = player.getMaxHealth() - player.getHealth();
        
        int power = fountain.getModifier() + (player.getY() * 4) - neededHealth; 
        
        if (power < 0) {            
            neededHealth = neededHealth -  fountain.getModifier() + (player.getY() * 4);
            player.setHealth(player.getMaxHealth() - neededHealth);
        }
        else{
            player.setHealth(player.getMaxHealth());
        }
        
        power -= player.getY() * 4;
        
        if (power < 0){
            power = 0;
        }
        return power; 
    }
    
}
    
    
