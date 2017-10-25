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
public class BubbleSort3Test {
    
    public BubbleSort3Test() {
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
     * Test of sort method, of class BubbleSort3.
     */
    @Test
    public void testSort() {
        System.out.println("sort");
        int[] actuals = {4,5,3,2,1};
        BubbleSort3 instance = new BubbleSort3();
        instance.sort(actuals);
        int [] expecteds = {1,2,3,4,5};
        assertArrayEquals(expecteds, actuals);
    }
    
}
