/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arep.sparkweb;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Juan Romero
 */
public class SparkWebAppTest {
    
    public SparkWebAppTest() {
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
     * Test of main method, of class SparkWebApp.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
    }

    /**
     * Test of getPort method, of class SparkWebApp.
     *
     **/
    @Test
    public void testGetPort() {
        System.out.println("getPort");
        int expResult = 4567;
        int result = SparkWebApp.getPort();
        assertEquals(expResult, result);
     
    }
    
 
    
}
