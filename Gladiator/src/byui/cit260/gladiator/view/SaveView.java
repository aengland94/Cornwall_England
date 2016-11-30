/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.view;

import byui.cit260.gladiator.control.GameControl;
import byui.cit260.gladiator.model.Game;
import gladiator.Gladiator;

/**
 *
 * @author Anthony
 */
public class SaveView extends View{
    public SaveView() {
        super("\nWhich slot number do you want to save in?" + GameControl.gameSlots());
    }
    @Override
        protected boolean doAction(String string){
            Game[] games = Gladiator.getGames();
            int slot;
            switch(string){
                case "1":
                case "ONE":
                    slot = 0;
                    break;
                case "2":
                case "TWO":
                    slot = 1;
                    break;
                case "3":
                case "THREE":
                    slot = 2;
                    break;
                default:
                    System.out.println("\n*** Invalid selection *** Try again");
                    return false;
            }
            if(games[slot] == null){
                save(slot);
            }
            else{
                override(slot);
            }
            return true;
        }
        private void save(int slot) {
            Gladiator.setGames(slot); 
            System.out.println("\nYour new saved games are: " + GameControl.gameSlots());
            displayRoom();
        }
        private void displayRoom(){            
            GTRoomView room = new GTRoomView();
            room.display();
        }
        
        private void override(int slot){
            Game[] games = Gladiator.getGames();
            String warning = "You are about to save over " + games[slot].getName();
            StillYNView yes = new StillYNView();
            boolean save = yes.display(warning);
            if(save){
                save(slot);
            }
        }
}
