/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.model;

/**
 *
 * @author Camdey
 */
public class Item {
    protected String _name;
    protected int _modifier;
    
    public String getName() { return _name; }
    public void setName(String name) { _name = name; }
    public int getModifier() { return _modifier; }
    public void setModifier(int modifier) { _modifier = modifier; }
}
