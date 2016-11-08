/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.control;

import java.util.Random;

/**
 *
 * @author Anthony
 */
public class Control {
     public static int randInt(int min, int max) {
            
	if (min > max) {
		throw new IllegalArgumentException("max must be greater than min");
	}
        
        Random r = new Random();

        int randomNum = r.nextInt((max - min) + 1) + min;

        return randomNum;
}
    
}
