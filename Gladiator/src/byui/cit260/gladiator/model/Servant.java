/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.model;

import java.io.Serializable;

/**
 *
 * @author Anthony
 */
public class Servant extends Character implements Serializable{
    public Servant() {
        _type = "servant";
    }
}