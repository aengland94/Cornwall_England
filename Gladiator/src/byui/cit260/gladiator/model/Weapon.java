/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.model;

import java.io.Serializable;
import java.util.Random;

/**
 *
 * @author Camdey
 */
public class Weapon extends Item implements Serializable{
    
        int weapon1 = 2;
        int w1 = 0;
        int ww1 = 6;
        int rando = randInt(w1,ww1);
        int damage = rando + weapon1;
    
    
        public static int randInt(int min, int max) {
            
	if (min > max) {
		throw new IllegalArgumentException("max must be greater than min");
	}
        
        Random r = new Random();

        int randomNum = r.nextInt((max - min) + 1) + min;

        return randomNum;
}

    
}