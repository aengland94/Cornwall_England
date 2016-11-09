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
public class Fountain extends Room implements Serializable{
    public Fountain() {
        _type = "FOUNTAIN";
        
        addDescription();
    }
    
    @Override
    protected void addDescription() {
        _num = Control.randInt(1, _x);
        
            _description = "This room is dark with a glowing fountain in the center.";
        
    }
}
