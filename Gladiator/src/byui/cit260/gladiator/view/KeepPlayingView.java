/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.view;

import gladiator.Gladiator;

/**
 *
 * @author Anthony
 */
public class KeepPlayingView extends NoInputView{
    public KeepPlayingView(){
        super("\nYou wake up back at the first room of this floor");
    }
    
    @Override
    protected boolean doAction(String string){
        Gladiator.setCurrentRoomNum(0);
        Gladiator.setCurrentRoom(Gladiator.getCurrentGame().getFandR()[Gladiator.getCurrentFloor()][0]);
        return true;
    }
}
