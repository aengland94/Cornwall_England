/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.view;

/**
 *
 * @author Camdey
 */
public class SrchBodYNView extends YesNoView {
    public SrchBodYNView () {
       super ("\nThere's a body on the floor, do wish to rumage through it?");
    }
    @Override
    protected void yes(){
        SrchBodView mri = new SrchBodView();
        mri.display();
    }
    @Override
    protected void no(){
        ActionMenuView action = new ActionMenuView();
        action.display();
    }
}
