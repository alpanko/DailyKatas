/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.patrick.demo.bubbleSort;

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
public class BubbleSortTest {
    
    public BubbleSortTest() {
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
     * Test of sort method, of class BubbleSort.
     */
    @Test
    public void testSort() {
        System.out.println("sort");
        int[] actuals = {6,4,3,2,1,5,9,7,8};
        BubbleSort instance = new BubbleSort();
        instance.sort(actuals);
        int[] expecteds = {1,2,3,4,5,6,7,8,9};
        // TODO review the generated test code and remove the default call to fail.
        assertArrayEquals(expecteds, actuals);
    }
    
}
