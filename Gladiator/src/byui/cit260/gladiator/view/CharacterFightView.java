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
public class CharacterFightView extends NoInputView {
    public CharacterFightView() { 
        super("\nThey decide to fight");
    }
    
    @Override
    protected boolean doAction(String string) {
        System.out.println(string);

        return true;
    }
    
}
