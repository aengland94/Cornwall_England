/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.model;

import byui.cit260.gladiator.control.Control;
import gladiator.Gladiator;
import java.io.Serializable;

/**
 *
 * @author Camdey
 */
public class Armour extends Item implements Serializable{
    public Armour() {
        chooseName();
        chooseModifier();
    }
    public Armour(String name, int modifier){
        _name = name;
        _modifier = modifier;
    }
    
    @Override
    protected void chooseName() {
        _num = Control.randInt(1, 10);
        
        switch(_num){
            case 1:
                _name = "PADS";
                break;
            case 2:
                _name = "LEATHER";
                break;
            case 3:
                _name = "HIDE";
                break;
            case 4:
                _name = "WOODEN SHIELD";
                break;
            case 5:
                _name = "STEAL SHIELD";
                break;
            case 6:
                _name = "HALF-PLATE";
                break;
            case 7:
                _name = "TOWER SHIELD";
                break;
            case 8:
                _name = "HELMET";
                break;
            case 9:
                _name = "FULL PLATE";
                break;
            default:
                _name = "STUDDED LEATHER";
        }
    }
    
    private void chooseModifier() {
        switch(Gladiator.getCurrentFloor()){
            case 1:
                _modifier = Control.randInt(5, 15);
                break;
            case 2:
                _modifier = Control.randInt(10, 20);
                break;
            case 3:
                _modifier = Control.randInt(15, 25);
                break;
            case 4:
                _modifier = Control.randInt(20, 30);
                break;
            case 5:
                _modifier = Control.randInt(25, 35);
                break;
            case 6:
                _modifier = Control.randInt(30, 40);
                break;
            case 7:
                _modifier = Control.randInt(35, 45);
                break;
            case 8:
                _modifier = Control.randInt(40, 50);
                break;
            default:
                _modifier = Control.randInt(1, 10);
        }
    }
}
