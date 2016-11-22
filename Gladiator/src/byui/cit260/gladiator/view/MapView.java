/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.view;

import byui.cit260.gladiator.model.Room;
import gladiator.Gladiator;

/**
 *
 * @author Anthony
 */
public class MapView extends View{
    public MapView() {
        super("\nWhat floor would you like to view?");
    }
    
    @Override
    protected boolean doAction(String string){
        int floor;
        switch(string){
            case "1":
            case "FIRST":
            case "ONE":
                floor = 1;
                break;
            case "2":
            case "SECOND":
            case "TWO":
                floor = 2;
                break;
            case "3":
            case "THIRD":
            case "THREE":
                floor = 3;
                break;
            case "4":
            case "FOURTH":
            case "FOUR":
                floor = 4;
                break;
            case "5":
            case "FITH":
            case "FIVE":
                floor = 5;
                break;
            case "6":
            case "SIXTH":
            case "SIX":
                floor = 6;
                break;
            case "7":
            case "SEVENTH":
            case "SEVEN":
                floor = 7;
                break;
            case "8":
            case "EIGHTH":
            case "EIGHT":
                floor = 8;
                break;
            case "9":
            case "NINTH":
            case "NINE":
                floor = 9;
                break;
            case "10":
            case "TENTH":
            case "TEN":
                floor = 10;
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                return false;
        }
        makeMap(floor);
        nextView();
        return true;
    }
    private void makeMap(int floor){
        Room[] map = Gladiator.getCurrentGame().getFandR()[floor - 1];
        String r0 = "?";
        String r1 = "?";
        String r2 = "?";
        String r3 = "?";
        String r4 = "?";
        String[] rooms = {r0,r2,r3,r4};
        
        for(int i = 0;i < map.length;i++){
            if(map[i] != null){
                rooms[i] = map[i].getType();
                if(floor == Gladiator.getCurrentFloor()){
                    if(Gladiator.getCurrentRoomNum() == map[i].getX()){
                        rooms[i] = "X";
                    }
                }
            }
        }
        
        System.out.println("\n*************************" 
                         + "\n*    map of floor "+floor+"     *" 
                         + "\n*************************" 
                         + "\n"
                         + "\n        [" + r0 + "]"
                         + "\n [" + r4 +  "]" 
                         + "\n             [" + r1 +  "]"
                         + "\n [" + r3 +  "]"
                         + "\n         [" + r2 +  "]"
                         + "\n"
                         + "\n*************************"
                         + "\n* X = You  ? = Unknown  *"
                         + "\n*************************");
    }
    
    private void nextView(){
        GTRoomView room = new GTRoomView();
        room.display();
    }
}
