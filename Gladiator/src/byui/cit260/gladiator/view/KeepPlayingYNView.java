/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.view;

/**
 *
 * @author Anthony
 */
public class KeepPlayingYNView extends YesNoView{
    public KeepPlayingYNView() {
        super("Do you want to continue playing?");
    }
    
    @Override
    protected void yes(){
        KeepPlayingView play = new KeepPlayingView();
        play.display();
    }
    
    @Override
    protected void no(){
       SaveYNView save = new SaveYNView();
       save.display();
    }
    
}
