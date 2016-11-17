/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.model;

import byui.cit260.gladiator.control.Control;
import gladiator.Gladiator;
import java.io.Serializable;
import java.util.Random;

/**
 *
 * @author Camdey
 */
public class Weapon extends Item implements Serializable{

    @Override
    protected void chooseName() {
        _num = Control.randInt(1, 30);
        
        switch(_num){
            case 1:
                _name = "CLUB";
                break;
            case 2:
                _name = "DAGGER";
                break;
            case 3:
                _name = "DART";
                break;
            case 4:
                _name = "SCIMITAR";
                break;
            case 5:
                _name = "SICKLE";
                break;
            case 6:
                _name = "SHORTSPEAR";
                break;
            case 7:
                _name = "SLING";
                break;
            case 8:
                _name = "SPEAR";
                break;
            case 9:
                _name = "QUARTERSTAFF";
                break;
            case 10:
                _name = "WARAXE";
            case 11:
                _name = "AXE";
                break;
            case 12:
                _name = "SHORTBOW";
                break;
            case 13:
                _name = "CROSSBOW";
                break;
            case 14:
                _name = "JAVALIN";
                break;
            case 15:
                _name = "LONGSWORD";
                break;
            case 16:
                _name = "WHIPS";
                break;
            case 17:
                _name = "HAMMER";
                break;
            case 18:
                _name = "SPIKED CHAIN";
                break;
            case 19:
                _name = "SPADE";
                break;
            default:
                _name = "SHORT SWORD";
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
    
    public Weapon() {
        chooseName();
        chooseModifier();
    }
    
    public Weapon(String name, int modifier){
        _name = name;
        _modifier = modifier;
    }
}