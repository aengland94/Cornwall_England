/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gladiator;

import byui.cit260.gladiator.model.Player;
import byui.cit260.gladiator.model.Character;
import byui.cit260.gladiator.model.PlayerControl;
import byui.cit260.gladiator.model.Item;
import byui.cit260.gladiator.model.Armour;
import byui.cit260.gladiator.model.Weapon;
import byui.cit260.gladiator.model.Map;
import byui.cit260.gladiator.model.Room;
/**
 *
 * @author Anthony
 */
public class Gladiator {
    
    private Room[][] floorsAndRooms;
    private boolean newFloor = false;
    
    private Room createRoom() { 
        Room newRoom = new Room();
        return newRoom;}
    
    private void uiCommands() { }

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
        
        
        
        PlayerControl fightEq = new PlayerControl();
        
        
        Item itemOne = new Item();
        itemOne.setName("key");
        
        
        Armour armourOne = new Armour();
        
        
        Weapon weaponOne = new Weapon();
        
        
        
        Character characterOne = new Character();
        characterOne.setAlive(true);
        characterOne.setAttack(3);
        characterOne.setDefence(1);
        characterOne.setHealth(10);
        characterOne.setX(3);
        characterOne.setY(1);
        characterOne.setBag(itemOne);
        String characterInfo = characterOne.toString();
        System.out.println(characterInfo);
        
        
        Map mapOne = new Map();
        mapOne.setFloor(1);
        mapOne.setRoom(1);
        String mapInfo = mapOne.toString();
        System.out.println(mapInfo);
        
        Room roomOne = new Room();
        roomOne.setDescription("a room with a fountain in the center");
        roomOne.setItem(true);
        roomOne.setPerson(false);
        roomOne.setX(4);
        roomOne.setY(1);
        String roomInfo = roomOne.toString();
        System.out.println(roomInfo);
    }
    
}
