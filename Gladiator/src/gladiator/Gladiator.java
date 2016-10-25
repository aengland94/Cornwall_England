/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gladiator;

import byui.cit260.gladiator.model.Player;
import byui.cit260.gladiator.model.Character;
import byui.cit260.gladiator.control.PlayerControl;
import byui.cit260.gladiator.model.Item;
import byui.cit260.gladiator.model.Armour;
import byui.cit260.gladiator.model.Game;
import byui.cit260.gladiator.model.Weapon;
import byui.cit260.gladiator.model.Map;
import byui.cit260.gladiator.model.Room;
import byui.cit260.gladiator.view.StartProgramView;
/**
 *
 * @author Anthony
 */
public class Gladiator {
    private static Game _currentGame = null;
    private static Player _player = null;
    private Room[][] floorsAndRooms = null;
    private boolean _newFloor = false;
    
    public static Game getCurrentGame() { return _currentGame; }
    public static Player getPlayer() { return _player; }
    public static void setCurrentGame(Game currentGame) { _currentGame = currentGame; }
    public static void setPlayer (Player player) { _player = player; }
    
    private Room createRoom() { 
        Room newRoom = new Room();
        return newRoom;}
    
    private void uiCommands() { }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       StartProgramView startProgramView = new StartProgramView();
       startProgramView.displayStartProgramView();
    }
    
}
