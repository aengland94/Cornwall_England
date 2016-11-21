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
public class MapView extends NoInputView{
    public MapView() {
    super("\n        [?]"
        + "\n [?]" 
        + "\n       [0]   [?]"
        + "\n [?]"
        + "\n         [X]"
        + "\n"
        + "\n*************************"
        + "\n* X = You  ? = Unknown  *"
        + "\n*************************");
    }
    
    @Override
    protected void nextView() {
        
    }
}
