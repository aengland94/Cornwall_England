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
import byui.cit260.gladiator.model.Character;
import byui.cit260.gladiator.model.Game;
import byui.cit260.gladiator.model.Player;
import byui.cit260.gladiator.model.Room;
import byui.cit260.gladiator.model.Servant;
import byui.cit260.gladiator.model.Soldier;
import byui.cit260.gladiator.model.Stairway;
import byui.cit260.gladiator.model.Warrior;
import gladiator.Gladiator;
import java.io.Serializable;

/**
 *
 * @author Anthony
 */
public class GameControl implements Serializable{

    
    public GameControl() {
        
    }
    
    private static void createFirstRoom() {
        Room room = new Room();
        
        room.setDescription("\n*** You walk into the room and notice that it is a large and open room."
                + "This walls are made of large sand color bricks with some moss growing in the cracks. ***");
        
        Gladiator.setCurrentRoom(room);
        Gladiator.getCurrentGame().setFandR(room);
    }
    
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
        int num =Control.randInt(1, 4);
        int done;
        
        do{
            String type = setType(num);
            done = checkRoom(type);
        }while(done < 0);
        
        chooseRoom(room, num);
        Gladiator.setCurrentRoom(room);
        Gladiator.getCurrentGame().setFandR(room);
        
        return room;
    }
    
    private static String setType(int num){
        String type = null;
        switch (num) {
            case 2:
                type = "BOSS ROOM";
                break;
            case 3:
                type = "FOUNTAIN";
                break;
            case 4:
                type = "STAIRWAY";
                break;
            default:
                type = "OTHER";
                break;
        }
        return type;
    }
    
    private static void chooseRoom(Room room, int num){
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
    }
    
    
    
    private static int checkRoom(String type) {
        boolean boss = false;
        boolean stair = false;
        boolean fount = false;
        int num = 0;
        
        Room[] rAndF = Gladiator.getCurrentGame().getFandR()[Gladiator.getCurrentFloor()];
        
        for(int i = 0; i < rAndF.length; i++){
            if(type == rAndF[i].getType()){
                return -1;
            }
            if("BOSS ROOM" == rAndF[i].getType()){
                boss = true;
            }
            if("STAIRWAY" == rAndF[i].getType()){
                stair = true;
            }
            if("FOUNTAIN" == rAndF[i].getType()){
                fount = true;
            }
        }
        if(type == "OTHER"){
            switch(rAndF.length){
                case 3:
                    if(boss == false && stair == false && fount == false){
                        num = Control.randInt(2, 4);
                    }
                    break;
                case 4:
                    if((boss == false && stair == false) || 
                            (boss == false && fount == false) || 
                            (fount == false && stair == false)){
                        num = Control.randInt(2, 4);
                    }
                    break;
                case 5:
                    if(boss == false || stair == false || fount == false){
                        if(!boss){
                            num = 2;
                        }
                        if(!stair){
                            num = 4;
                        }
                        if(!fount){
                            num = 3;
                        }
                    }
                    break;
                default:
                    return -1;
            }
        }
        return num;
    }
    
    public static Character createCharacter(){
        Character character;
        int num = Control.randInt(1, 3);
        
        switch(num){
            case 1:
                character = new Soldier();
                break;
            case 2:
                character = new Warrior();
                break;
            default:
                character = new Servant();
        }
        return character;
    }
    
    public static void createNewGame(Player player){
        Game newgame = new Game();
        newgame.setPlayer(player);
        newgame.setName(player.getName());
        
        Gladiator.setCurrentGame(newgame);
        
        createFirstRoom();
    }
    
    public static void saveGame(int slot) {
        System.out.println("\n*** saveGame stub function called ***");
    }
    
    public static int deaths() {
        Room[][] a = Gladiator.getCurrentGame().getFandR();
        int result = 0;
        for (Room[] row : a) {
        for (Room i : row)
            result += i.getDeaths();
        }
        return result;
    
    } 
    
}
