/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.model;

import byui.cit260.gladiator.control.Control;
import gladiator.Gladiator;
import java.io.Serializable;

/**
 *
 * @author Anthony
 */
public class DiningRoom extends Room implements Serializable{
    public DiningRoom() {
        _x = Gladiator.getCurrentRoomNum();
        _y = Gladiator.getCurrentFloor();
        _type = "DINING ROOM";
        
        addPerson();
        addItem();
        addDescription();
        addCharacter();
    }
    
    @Override
    protected void addDescription() {
        _num = Control.randInt(1, 2);
        if(!_person && !_item){
            _description = "This room has a wooden table that is covered in moldy food.";
        }
        else if (_item){
            _description = "There is some food in the room that you could use to regenerate your health.";
        }
    }
}
