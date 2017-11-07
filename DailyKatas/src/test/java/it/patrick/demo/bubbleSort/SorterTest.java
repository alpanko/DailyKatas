/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.patrick.demo.bubbleSort;

import it.patrick.demo.quickSort.QuickSort12;
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
public class SorterTest {
    
    public SorterTest() {
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
     * Test of sort method, of class BubbleSort5.
     */
    @Test
    public void testBubbleSortSort() {
        System.out.println("sort");
        int[] actuals = {9,8,7,6,5,4,3,2,1};
        BubbleSort5 instance = new BubbleSort5();
        instance.sort(actuals);
        int[] expecteds = {1,2,3,4,5,6,7,8,9};
        assertArrayEquals(expecteds, actuals);
    }
    
    @Test
    public void testQuickSort() {
        System.out.println("sort");
        int[] actuals = {9,8,7,6,5,4,3,2,1};
        QuickSort12 instance = new QuickSort12();
        instance.sort(actuals);
        int[] expecteds = {1,2,3,4,5,6,7,8,9};
        assertArrayEquals(expecteds, actuals);
    }
    
}
