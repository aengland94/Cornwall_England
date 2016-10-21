/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Anthony
 */
public class PlayerControlTest {
    
    public PlayerControlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of fight method, of class PlayerControl.
     */
    @Test
    public void testFight() {
        System.out.println("fight");
        int attackerStats = 0;
        int weapon = 0;
        int defenderStats = 0;
        int armour = 0;
        PlayerControl instance = new PlayerControl();
        int expResult = 0;
        int result = instance.fight(attackerStats, weapon, defenderStats, armour);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
        System.out.println("\n\nfight");
        attackerStats = -5;
        weapon = -3;
        defenderStats = 2;
        armour = 7;
        PlayerControl instance2 = new PlayerControl();
        expResult = -1;
        result = instance2.fight(attackerStats, weapon, defenderStats, armour);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
        System.out.println("\n\nfight");
        attackerStats = 0;
        weapon = 0;
        defenderStats = 0;
        armour = 0;
        PlayerControl instance3 = new PlayerControl();
        expResult = 0;
        result = instance3.fight(attackerStats, weapon, defenderStats, armour);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
        System.out.println("\n\nfight");
        attackerStats = 0;
        weapon = 0;
        defenderStats = 0;
        armour = 0;
        PlayerControl instance4 = new PlayerControl();
        expResult = 0;
        result = instance4.fight(attackerStats, weapon, defenderStats, armour);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
        System.out.println("\n\nfight");
        attackerStats = 0;
        weapon = 0;
        defenderStats = 0;
        armour = 0;
        PlayerControl instance5 = new PlayerControl();
        expResult = 0;
        result = instance5.fight(attackerStats, weapon, defenderStats, armour);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
        System.out.println("\n\nfight");
        attackerStats = 0;
        weapon = 0;
        defenderStats = 0;
        armour = 0;
        PlayerControl instance6 = new PlayerControl();
        expResult = 0;
        result = instance6.fight(attackerStats, weapon, defenderStats, armour);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
