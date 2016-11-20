/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.control;

import java.util.Random;

/**
 *
 * @author Camdey
 */
public class Control {
     public static int randInt(int min, int max) {
        Random r = new Random();
        int randomNum;
        
	if (min > max) {
            int newMin = max;
            int newMax = min;
            
            randomNum = r.nextInt((newMax - newMin) + 1) + newMin;
	}
        else{
          randomNum = r.nextInt((max - min) + 1) + min;  
        }             

        return randomNum;
}
    
}
