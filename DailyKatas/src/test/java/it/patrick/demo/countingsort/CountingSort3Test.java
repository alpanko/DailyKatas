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
public class CountingSort3Test {
    
    public CountingSort3Test() {
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
     * Test of sort method, of class CountingSort3.
     */
    @Test
    public void testSort() {
        System.out.println("sort");
        int[] array = {6,5,4,3,2,1};
        CountingSort3 instance = new CountingSort3();
        int[] expResult = {1,2,3,4,5,6};
        int[] result = instance.sort(array);
        assertArrayEquals(expResult, result);
       
    }
    
}
