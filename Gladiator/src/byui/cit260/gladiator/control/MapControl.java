/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.control;

import byui.cit260.gladiator.exceptions.MapControlExceptions;
import byui.cit260.gladiator.model.Map;
import byui.cit260.gladiator.model.Player;
import gladiator.Gladiator;
import java.awt.Point;

/**
 *
 * @author Krissy
 */
public class MapControl {
    
    public static int movePlayerToLocation(Player player, Point coordinates) 
            throws MapControlExceptions{
        
        Map map = Gladiator.getCurrentGame().getMap();
        int newRow = coordinates.x-1;
        int newColumn = coordinates.y-1;
        
        if (newRow < 0 || newRow >= map.getNoOfRows() ||
            newColumn < 0 || newColumn >= map.getNoOfColumns()){
            throw new MapControlExceptions("Can not move player to location "
                                            + coordinates.x + ", " + coordinates.y
                                            + "because that location is outside the "
                                            + "bounds of the map.");
                                            
        }
        return 0;
}
    
    /**
     *
     * @param map
     * @return
     * @throws byui.cit260.gladiator.exceptions.MapControlExceptions
     */
    public static int movePlayerToStartingLocation(Map map) throws MapControlExceptions{
        //for every player
        Player[] players = Player.values();
        
        for (Player player : players) {
            Point coordinates = player.getCoordinates();
            int returnValue = MapControl.movePlayerToLocation(player, coordinates);
            
        }
        return 0;
    }
    
    public int doAction(String choice) throws MapControlExceptions {
        Player player = null;
        Point coordinates = null;
        MapControl.movePlayerToLocation(player, coordinates);
        return 0;
    }
    
    
}
