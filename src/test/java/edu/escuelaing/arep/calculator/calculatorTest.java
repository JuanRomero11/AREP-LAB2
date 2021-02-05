/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arep.calculator;

import edu.escuelaing.arep.Likend.LikendList;

import java.util.List;
import static junit.framework.Assert.assertEquals;
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
public class calculatorTest {
    
    public calculatorTest() {
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
     * Test of calcularMedia method, of class calculator.
     */
    @org.junit.Test
    public void testCalcularMedia() {
        System.out.println("calcularMedia");
        LikendList<Double> lista1 = new LikendList<Double>();
        lista1.add(160.0);
        lista1.add(591.0);
        lista1.add(114.0);
        lista1.add(229.0);
        lista1.add(230.0);
        lista1.add(270.0);
        lista1.add(128.0);
        lista1.add(1657.0);
        lista1.add(624.0);
        lista1.add(1503.0);
      // lista1.imprimir();
        double expResult = 550.6;
        double result = Math.round(calculator.calcularMedia(lista1)*100.0)/100.0;
        System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Second test of calcularMedia method, of class calculator.
     */
    @org.junit.Test
    public void testCalcularMedia2(){
        System.out.println("calcularMedia2");
        LikendList<Double> lista1 = new LikendList<Double>();
        lista1.add(15.0);
        lista1.add(69.9);
        lista1.add(6.5);
        lista1.add(22.4);
        lista1.add(28.4);
        lista1.add(65.9);
        lista1.add(19.4);
        lista1.add(198.7);
        lista1.add(38.8);
        lista1.add(138.2);
        lista1.print();
        double expResult = 60.32;
        double result = Math.round(calculator.calcularMedia(lista1)*100.0)/100.0;
        System.out.println("entree"+result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    

     /** Test of calcularDesviacion method, of class calculator.
     */
    @org.junit.Test
    public void testCalcularDesviacion() {
        System.out.println("calcularDesviacion");
        LikendList<Double> lista1 = new LikendList<Double>();
        lista1.add(160.0);
        lista1.add(591.0);
        lista1.add(114.0);
        lista1.add(229.0);
        lista1.add(230.0);
        lista1.add(270.0);
        lista1.add(128.0);
        lista1.add(1657.0);
        lista1.add(624.0);
        lista1.add(1503.0);
        double expResult = 572.03;
        double result = Math.round(calculator.calcularDesviacion(lista1)*100.0)/100.0;
        System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    /** Second test of calcularDesviacion method, of class calculator.
     */
    @org.junit.Test
    public void testCalcularDesviacion2() {
        System.out.println("calcularDesviacion2");
        LikendList<Double> lista1 = new LikendList<Double>();
        lista1.add(15.0);
        lista1.add(69.9);
        lista1.add(6.5);
        lista1.add(22.4);
        lista1.add(28.4);
        lista1.add(65.9);
        lista1.add(19.4);
        lista1.add(198.7);
        lista1.add(38.8);
        lista1.add(138.2);
        double expResult = 62.26;
        double result = Math.round(calculator.calcularDesviacion(lista1)*100.0)/100.0;
        System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
    
}
