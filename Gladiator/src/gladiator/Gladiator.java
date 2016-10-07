/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gladiator;

import byui.cit260.gladiator.model.Player;
import byui.cit260.gladiator.model.Character;
import byui.cit260.gladiator.model.Fight;
import byui.cit260.gladiator.model.Item;
import byui.cit260.gladiator.model.Armour;
import byui.cit260.gladiator.model.Weapon;
/**
 *
 * @author Anthony
 */
public class Gladiator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Player playerOne = new Player();
        
        playerOne.setName("Fred Flinstone");
        playerOne.setBestTime(7.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        
        Character characterOne = new Character();
        Fight fightEq = new Fight();
        Item itemOne = new Item();
        Armour armourOne = new Armour();
        Weapon weaponOne = new Weapon();
    }
    
}
