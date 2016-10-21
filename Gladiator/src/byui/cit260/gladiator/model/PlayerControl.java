/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.model;

/**
 *
 * @author Camdey
 */
public class PlayerControl {
    private int x;
    public int go(int move, Player player, Map map) { 
        if(move == 1){
            if(player.getX() == 4){
                player.setX(0);}
            else {
                player.setX(player.getX() + 1);}}
        else if(move == -1){
            if(player.getX() == 0){
                player.setX(4);}
            else {
                player.setX(player.getX() - 1);}}
        else{
        System.out.println("Invalid Move");}
        return x; }
    
    public int fight(int attackerStats, int weapon, int defenderStats, int armour) { 
        if(attackerStats < 1){
            System.out.println("Error! Attacker Stats are too low");
            return 0;
        }
        if(weapon < 0){
            System.out.println("Error! Weapon cannot be negative");
            return 0;
        }
        if(defenderStats < 0){
            System.out.println("Error! Defender Stats cannot be negative");
            return 0;
        }
        if(armour < 0){
            System.out.println("Error! Armour cannot be negative");
            return 0;
        }
        int lostHealth = (defenderStats + armour) - (attackerStats + weapon);
        if(lostHealth < 0){
            lostHealth = -1;}
        else{
            lostHealth = 0;}
        return lostHealth; }
    
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
        return power; }
}
