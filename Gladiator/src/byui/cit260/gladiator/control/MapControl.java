/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.control;

import byui.cit260.gladiator.model.Map;
import byui.cit260.gladiator.model.Player;

/**
 *
 * @author Anthony
 */
public class MapControl {
    public int go(int move, Player player, Map map) { 
        int x = 0;
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
    
}
