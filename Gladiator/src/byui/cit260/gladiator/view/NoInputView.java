/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.view;
// not really sure what this view is suppose to do ~Krissy


public class NoInputView extends View {

    public NoInputView(String message) {
        _message = message;
    }
private String _message;
    @Override
    public void display() {
        boolean done;
        do{
            done = this.doAction(_message);
            
        } while (!done);
    }
    @Override
    protected boolean doAction(String string) {
        System.out.println(string);
        return false;
    }
    
}
