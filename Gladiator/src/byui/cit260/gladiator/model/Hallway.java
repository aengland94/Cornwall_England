/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.model;

import byui.cit260.gladiator.control.Control;
import java.io.Serializable;

/**
 *
 * @author Anthony
 */
public class Hallway extends Room implements Serializable{
    public Hallway() {
        _type = "HALLWAY";
        
        addPerson();
        addItem();
        addDescription();
        addCharacter();
    }
    
    @Override
    protected void addDescription() {
        _num = Control.randInt(1, _x);
        if(!_person && !_item){
            _description = "This is a long narrow hallway.";
        }
    }
}
