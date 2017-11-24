/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.patrick.demo.countingsort;

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
public class CountingSortTest {
    
    public CountingSortTest() {
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
     * Test of sort method, of class CountingSort.
     */
    @Test
    public void testSort() {
        System.out.println("sort");
        int[] actuals = {5,4,3,2,1};
        CountingSort instance = new CountingSort();
        int sorted[] = instance.sort(actuals);
         int[] expecteds = {1,2,3,4,5};
         assertArrayEquals(expecteds, sorted);
    }
    
}
