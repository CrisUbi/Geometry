/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.geometry.solids.circunferences;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class SphereTest {
    
    public SphereTest() {
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
     * Test of area method, of class Sphere.
     */
    @Test
    public void testArea() {
        System.out.println("area");
        Sphere instance = new Sphere(5f);
        Float expResult = (float)(Math.PI*4*Math.pow(5,2));
        Float result = instance.area();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of perimetre method, of class Sphere.
     */
    @Test
    public void testPerimetre() {
        System.out.println("perimetre");
        Sphere instance = new Sphere(5f);
        Float expResult = null;
        Float result = instance.perimetre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of volumen method, of class Sphere.
     */
    @Test
    public void testVolumen() {
        System.out.println("volumen");
        Sphere instance =new Sphere(5f);
        Float expResult = (float)(Math.PI*Math.pow(5, 3))/4;
        Float result = instance.volumen();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
