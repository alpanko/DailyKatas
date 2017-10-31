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
public class QuickSort7Test {
    
    public QuickSort7Test() {
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
     * Test of sort method, of class QuickSort7.
     */
    @Test
    public void testSort() {
        System.out.println("sort");
        int[] actuals = {2,4,3,1,5,7,6,8,9};
        QuickSort7 instance = new QuickSort7();
        instance.sort(actuals);
        int[] expecteds = {1,2,3,4,5,6,7,8,9};
        assertArrayEquals(expecteds, actuals);
    }
    
}
