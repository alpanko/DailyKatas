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
public class countingSort2Test {
    
    public countingSort2Test() {
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
     * Test of sort method, of class countingSort2.
     */
    @Test
    public void testSort() {
        System.out.println("sort");
        int[] array = {5,4,3,2,1};
        countingSort2 instance = new countingSort2();
        int[] expResult = instance.sort(array);
        int[] result = {1,2,3,4,5};
        assertArrayEquals(expResult, result);
        
    }
    
}
