/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.gladiator.model;

import byui.cit260.gladiator.control.PlayerControl;
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
        System.out.println("fight1");
        int attackerStats = 5;
        int weapon = 3;
        int defenderStats = 1;
        int armour = 7;
        PlayerControl instance = new PlayerControl();
        int expResult = 0;
        int result = instance.fight(attackerStats, weapon, defenderStats, armour);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
        
        System.out.println("\nfight2");
        attackerStats = 0;
        weapon = 0;
        defenderStats = 0;
        armour = 0;
        PlayerControl instance2 = new PlayerControl();
        expResult = 0;
        result = instance2.fight(attackerStats, weapon, defenderStats, armour);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
        
        System.out.println("\nfight3");
        attackerStats = 5;
        weapon = -3;
        defenderStats = 2;
        armour = 4;
        PlayerControl instance3 = new PlayerControl();
        expResult = 0;
        result = instance3.fight(attackerStats, weapon, defenderStats, armour);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
        
        System.out.println("\nfight4");
        attackerStats = 3;
        weapon = 4;
        defenderStats = -6;
        armour = 0;
        PlayerControl instance4 = new PlayerControl();
        expResult = 0;
        result = instance4.fight(attackerStats, weapon, defenderStats, armour);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
        
        System.out.println("\nfight5");
        attackerStats = 4;
        weapon = 0;
        defenderStats = 7;
        armour = -8;
        PlayerControl instance5 = new PlayerControl();
        expResult = 0;
        result = instance5.fight(attackerStats, weapon, defenderStats, armour);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
        
        System.out.println("\nfight6");
        attackerStats = 8;
        weapon = 7;
        defenderStats = 0;
        armour = 0;
        PlayerControl instance6 = new PlayerControl();
        expResult = -1;
        result = instance6.fight(attackerStats, weapon, defenderStats, armour);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
        System.out.println("\nfight7");
        attackerStats = 1;
        weapon = 0;
        defenderStats = 0;
        armour = 0;
        PlayerControl instance7 = new PlayerControl();
        expResult = -1;
        result = instance7.fight(attackerStats, weapon, defenderStats, armour);
        assertEquals(expResult, result);
        
        System.out.println("\nfight8");
        attackerStats = 0;
        weapon = 0;
        defenderStats = 0;
        armour = 0;
        PlayerControl instance8 = new PlayerControl();
        expResult = 0;
        result = instance8.fight(attackerStats, weapon, defenderStats, armour);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testHeal() {
        System.out.println("\n\nheal1");
        Player player = new Player();
        Item fountain = new Item();
        player.setMaxHealth(10);
        player.setHealth(2);
        player.setY(1);
        player.setName("ANTON");
        fountain.setModifier(6);
        fountain.setName("The Fountain");
        PlayerControl instance = new PlayerControl();
        int expResult = 0;
        int result = instance.heal(player, fountain);
        assertEquals(expResult, result);
        
        System.out.println("\nheal2");
        player.setMaxHealth(5);
        player.setHealth(5);
        player.setY(0);
        fountain.setModifier(6);
        fountain.setName("The Fountain");
        expResult = 6;
        result = instance.heal(player, fountain);
        assertEquals(expResult, result);
        
        System.out.println("\nheal3");
        player.setMaxHealth(10);
        player.setHealth(20);
        player.setY(0);
        fountain.setModifier(1);
        fountain.setName("The Fountain");
        expResult = 1;
        result = instance.heal(player, fountain);
        assertEquals(expResult, result);
        
        System.out.println("\nheal4");
        player.setMaxHealth(10);
        player.setHealth(0);
        player.setY(1);
        fountain.setModifier(1);
        fountain.setName("The Fountain");
        expResult = 1;
        result = instance.heal(player, fountain);
        assertEquals(expResult, result);
        
        System.out.println("\nheal5");
        player.setMaxHealth(10);
        player.setHealth(6);
        player.setY(-1);
        fountain.setModifier(1);
        fountain.setName("The Fountain");
        expResult = 1;
        result = instance.heal(player, fountain);
        assertEquals(expResult, result);
        
        System.out.println("\nheal6");
        player.setMaxHealth(10);
        player.setHealth(6);
        player.setY(1);
        fountain.setModifier(-1);
        fountain.setName("The Fountain");
        expResult = 0;
        result = instance.heal(player, fountain);
        assertEquals(expResult, result);
        
        System.out.println("\nheal7");
        player.setMaxHealth(10);
        player.setHealth(-10);
        player.setY(1);
        fountain.setModifier(1);
        fountain.setName("The Fountain");
        expResult = 1;
        result = instance.heal(player, fountain);
        assertEquals(expResult, result);
        
        System.out.println("\nheal8");
        player.setMaxHealth(5);
        player.setHealth(1);
        player.setY(0);
        fountain.setModifier(6);
        fountain.setName("The Fountain");
        expResult = 2;
        result = instance.heal(player, fountain);
        assertEquals(expResult, result);
    }
}
