/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.control;

import byui.cit260.gladiator.model.Boss;
import byui.cit260.gladiator.model.BossRoom;
import byui.cit260.gladiator.model.DiningRoom;
import byui.cit260.gladiator.model.Fountain;
import byui.cit260.gladiator.model.Hallway;
import byui.cit260.gladiator.model.Kitchen;
import byui.cit260.gladiator.model.Character;
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
    public GameControl() { }
    
    private static Room[][] rAndF = new Room[9][5];
    private static boolean boss = false;
    private static boolean stair = false;
    private static boolean fount = false;
    private static String type = null;
    private static int num = 0;
    
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
        num =Control.randInt(1, 4);
        boolean done = false;
        
        do{
            setType();
            done = checkRoom();
        }while(!done);
        
        chooseRoom(room);
        resetVar();
        Gladiator.setCurrentRoom(room);
        
        return room;
    }
    
    private static void setType(){
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
    }
    
    private static void chooseRoom(Room room){
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
    
    private static void resetVar() {
        boss = false;
        stair = false;
        fount = false;
        type = null;
    }
    
    private static boolean checkRoom() {
        for(int i = 0; i < rAndF.length; i++){
            if(type == rAndF[Gladiator.getCurrentFloor()][i].getType()){
                return false;
            }
            if("BOSS ROOM" == rAndF[Gladiator.getCurrentFloor()][i].getType()){
                boss = true;
            }
            if("STAIRWAY" == rAndF[Gladiator.getCurrentFloor()][i].getType()){
                stair = true;
            }
            if("FOUNTAIN" == rAndF[Gladiator.getCurrentFloor()][i].getType()){
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
            }
        }
        return true;
    }
    
    public static Character createCharacter(){
        Character character;
        num = Control.randInt(1, 3);
        
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
        System.out.println("\n*** createNewGame stub function called ***");
    }
}
