/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arep.Linked;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.escuelaing.arep.Likend.LikendList;

import static org.junit.Assert.*;

/**
 *
 * @author Juan Romero
 */
public class LikendListTest {
    
    

    /**
     * Test of size method, of class LikendList.
     */
    @Test
    public void testSize() {
        System.out.println("size");
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
        int expResult = 10;
        int result = lista1.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       //  fail("The test case is a prototype.");
    }

    /**
     * Test of iterator method, of class LikendList.
     */
    @Test
    public void testIterator() {
        System.out.println("iterator");
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
         Double suma =0.0;
         try{
               for(Double x:lista1){
                    suma += x;
                }
         }catch(Exception e){
             System.out.println("no funciona el iterador");
         }
      
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

 
   
    /**
     * Test of add method, of class LikendList.
     */
    @Test
    public void testAdd_GenericType() {
        System.out.println("add");
        Double e = null;
        LikendList<Double> instance = new LikendList<Double>();
        int expResult = 1;
        instance.add(e);
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of print method, of class LikendList.
     */
    @Test
    public void testPrint() {
        System.out.println("print");
        LikendList instance = new LikendList();
        instance.print();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
    
}
