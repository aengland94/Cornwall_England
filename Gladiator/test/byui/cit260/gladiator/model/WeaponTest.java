/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Camdey
 */
public class WeaponTest {
    
    public WeaponTest() {
    }

    /**
     * Test of randInt method, of class Weapon.
     */
    @Test
    public void testRandInt() {
        System.out.println("randInt0");
        int min = 1;
        int max = 1;
        int expResult = 1;
        int result = Weapon.randInt(min, max);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("success!");
    }
        @Test
    public void testRandInt1() {
        System.out.println("randInt1");
        int min = 0;
        int max = 6;
        int expResult = 0;
        int result = Weapon.randInt(min, max);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("Randomly Generated Zero");
    }
            @Test
    public void testRandInt2() {
        System.out.println("randInt2");
        int min = 5;
        int max = 1;
        int expResult = 0;
        int result = Weapon.randInt(min, max);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("failed2");
    }
    
}
