/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.model;

import java.io.Serializable;

/**
 *
 * @author Anthony
 */
public class Game implements Serializable{
    public Game() {
        currentRoom = createRoom();
    }
    private Room createRoom() { 
        Room newRoom = new Room();
        return newRoom;}
    public Room getCurrentRoom() {
        return currentRoom;
    }
    public void setCurrentRoom(Room room){
        currentRoom = room;
    }
    private Room[][] floorsAndRooms = null;
    private boolean _newFloor = false;
    private Room currentRoom;
}
