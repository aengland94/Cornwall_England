/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.model;

import java.io.Serializable;

/**
 *
 * @author Camdey
 */
public class Item implements Serializable{
    protected String _name = null;
    protected int _modifier = 0;
    protected String _description = null;
    protected int _num = 0;
    
    public Item() {
        chooseName();

    }
    
    public String getDescription() { return _description; }
    public void setDescriptioin(String description) { _description = description; }
    public String getName() { return _name; }
    public void setName(String name) { _name = name; }
    public int getModifier() { return _modifier; }
    public void setModifier(int modifier) { _modifier = modifier; }
    
    protected void chooseName() {
        _name = "KEY";
    }
    protected void addDescription() {
        _description = " + _modifier" + " " + _name;
    }
}
