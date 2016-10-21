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
        int lostHealth = defenderStats + armour - attackerStats + weapon;
        if(lostHealth < 0){
            lostHealth = -1;}
        else{
            lostHealth = 0;}
        return lostHealth; }
    
    public int heal(Player player, Item fountain){ 
        if (fountain.getModifier() <= 0) {
            System.out.println(fountain.getName() + " is empty and cannot heal you");
            return 0;}
        if(player.getHealth() >= player.getMaxHealth()) {
            System.out.println("Your health is full!");
            player.setHealth(player.getMaxHealth());
            return fountain.getModifier();}
        
        int neededHealth = player.getMaxHealth() - player.getHealth();
        int remain = 0;
        
        if(neededHealth % (player.getY() + 1) != 0) { 
            remain = 1;
        }
        
        int power = fountain.getModifier() - neededHealth / (player.getY() + 1) - remain; 
        
        if (power < 0) {
            power = 0;
            neededHealth = neededHealth -  fountain.getModifier() * (player.getY() + 1);
            player.setHealth(player.getMaxHealth() - neededHealth);
        }
        return power; }
}
