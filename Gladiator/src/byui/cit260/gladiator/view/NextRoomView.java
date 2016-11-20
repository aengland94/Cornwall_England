/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.view;

import gladiator.Gladiator;

/**
 *
 * @author Krissy
 */
public class NextRoomView extends NoInputView{ //extends View
    public NextRoomView(){
        super(Gladiator.getCurrentRoom().getDescription());
    }
    @Override
    protected boolean doAction(String string){
        return true;
    }
//description of the room.    
}
