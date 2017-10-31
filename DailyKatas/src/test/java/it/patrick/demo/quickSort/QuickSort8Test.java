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
public class QuickSort8Test {
    
    public QuickSort8Test() {
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
     * Test of sort method, of class QuickSort8.
     */
    @Test
    public void testSort() {
        System.out.println("sort");
        int[] actuals = {4,5,6,3,2,1,8,9,7};
        QuickSort8 instance = new QuickSort8();
        instance.sort(actuals);
        int[] expecteds = {1,2,3,4,5,6,7,8,9};
        assertArrayEquals(expecteds, actuals);
    }
    
}
