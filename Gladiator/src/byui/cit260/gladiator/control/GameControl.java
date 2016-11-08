/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.control;

import byui.cit260.gladiator.model.BossRoom;
import byui.cit260.gladiator.model.DiningRoom;
import byui.cit260.gladiator.model.Fountain;
import byui.cit260.gladiator.model.Hallway;
import byui.cit260.gladiator.model.Kitchen;
import byui.cit260.gladiator.model.Player;
import byui.cit260.gladiator.model.Room;
import byui.cit260.gladiator.model.Stairway;
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
        Room room;
        
        int num =Control.randInt(1, 4);
        
        String type;
        
        if(num == 2){
            type = "BOSS ROOM";
        }
        else if (num == 3){
            type = "FOUNTAIN";
        }
        else if (num == 4){
            type = "STAIRWAY";
        }
        else{
            type = "OTHER";
        }
        
        switch(num){
            case 1:
                num = Control.randInt(1, 6);
                switch(num){
                    case 1:
                        room = new Kitchen();
                        break;
                    case 2:
                        room = new DiningRoom();
                        break;
                    case 3:
                        room = new Hallway();
                        break;
                    case 4:
                        room = new Room();
                        break;
                    case 5:
                        room = new Room();
                        break;
                    case 6:
                        room = new Room();
                        break;
                    default:
                        room = new Room();
                }
                break;
            case 2:
                room = new BossRoom();
                break;
            case 3:
                room = new Fountain();
                break;
            case 4:
                room = new Stairway();
                break;
            default:
                room = new Room();
        }
        Gladiator.setCurrentRoom(room);
        
        return room;
    }
    public static void createNewGame(Player player){
        System.out.println("\n*** createNewGame stub function called ***");
    }
}
