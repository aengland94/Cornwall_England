/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.model;

import gladiator.Gladiator;
import java.io.Serializable;

/**
 *
 * @author Anthony
 */
public class Game implements Serializable{
    public Game() {
        
    }
    private String _name = null;
    private Player _player = null;
    private Room[][] _fandR = new Room[9][5];
    
    public String getName() { return _name; }
    public void setName(String name) { _name = name; }
    public Player getPlayer() { return _player; }
    public void setPlayer(Player player) { _player = player; }
    public Room[][] getFandR() { return _fandR; }
    public void setFandR(Room[][] fandR) {
        for(int i = 0;i < fandR.length;i++){
            System.arraycopy(fandR[i], 0, _fandR[i], 0, fandR[i].length);
        }
    }
    
    public void setFandR(Room[][] fandR, int floor) {
        System.arraycopy(fandR[floor], 0, _fandR[floor], 0, fandR[floor].length);
    }
    
    public void setFandR(Room fandR){
        _fandR[Gladiator.getCurrentFloor()][Gladiator.getCurrentRoomNum()] = fandR;
    }

    public Map getMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
