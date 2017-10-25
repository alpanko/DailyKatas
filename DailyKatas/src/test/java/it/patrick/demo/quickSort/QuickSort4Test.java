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
public class QuickSort4Test {
    
    public QuickSort4Test() {
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
     * Test of sort method, of class QuickSort4.
     */
    @Test
    public void testSort() {
        System.out.println("sort");
        int[] actuals = {3,4,6,1,5,2};
        QuickSort4 instance = new QuickSort4();
        instance.sort(actuals);
        int [] expecteds = {1,2,3,4,5,6};
        assertArrayEquals(expecteds, actuals);
    }
    
}
