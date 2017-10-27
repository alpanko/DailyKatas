/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.patrick.demo.quickSort;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author patrickn
 */
public class QuickSort6Test {
    
    public QuickSort6Test() {
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

    @Test
    public void testSomeMethod() {
        QuickSort6 sorter = new QuickSort6();
       int [] actuals = {4,5,3,2,1,7,6,8,9};
       sorter.sort(actuals);
       int [] expected = {1,2,3,4,5,6,7,8,9};
        assertArrayEquals(expected, actuals);
        
    }
    
}
