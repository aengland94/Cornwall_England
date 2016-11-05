/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.control;

import byui.cit260.gladiator.model.Player;
import byui.cit260.gladiator.model.Room;
import gladiator.Gladiator;
import java.io.Serializable;

/**
 *
 * @author Anthony
 */
public class GameControl implements Serializable{
    public GameControl() { }
    public static Player createPlayer(String name) {
        if(name == null){
            return null;
        }
        
        Player player = new Player();
        player.setName(name);
        
        Gladiator.setPlayer(player);
        
        return player;
    }
    public static Room createRoom(){
        Room room = new Room();
        Gladiator.setCurrentRoom(room);
        
        return room;
    }
    public static void createNewGame(Player player){
        System.out.println("\n*** createNewGame stub function called ***");
    }
}
