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
public class TrainingRoom extends Room implements Serializable{
    public TrainingRoom() {
        _x = Gladiator.getCurrentRoomNum();
        _y = Gladiator.getCurrentFloor();
        _type = "TRAINING ROOM";
        
        addPerson();
        addItem();
        addDescription();
        addCharacter();
    }
    
    @Override
    protected void addDescription() {
        _num = Control.randInt(1, 2);
        if(!_person && !_item){
            _description = "This room is rather large with an areana in the center.";
        }
    }
}
