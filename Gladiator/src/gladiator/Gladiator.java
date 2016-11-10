/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gladiator;

import byui.cit260.gladiator.model.Player;
import byui.cit260.gladiator.model.Game;
import byui.cit260.gladiator.model.Room;
import byui.cit260.gladiator.view.StartProgramView;
/**
 *
 * @author Anthony
 */
public class Gladiator {
    private static Game _currentGame = null;
    private static Player _player = null;
    private static Room _currentRoom = null;
    private static int _currentFloor = 0;
    
    public static int getCurrentFloor() { return _currentFloor; }
    public static void setCurrentFloor(int currentFloor) { _currentFloor = currentFloor; }
    public static Game getCurrentGame() { return _currentGame; }
    public static Player getPlayer() { return _player; }
    public static Room getCurrentRoom() { return _currentRoom; }
    public static void setCurrentGame(Game currentGame) { _currentGame = currentGame; }
    public static void setPlayer (Player player) { _player = player; }
    public static void setCurrentRoom(Room currentRoom) { _currentRoom = currentRoom; }

 
    
    
    
    private void uiCommands() { }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       StartProgramView startProgramView = new StartProgramView();
       startProgramView.display();
    }
    
}
