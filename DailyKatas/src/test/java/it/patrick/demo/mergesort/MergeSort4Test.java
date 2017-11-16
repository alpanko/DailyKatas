/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.patrick.demo.mergesort;

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
public class MergeSort4Test {
    
    public MergeSort4Test() {
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
     * Test of sort method, of class MergeSort4.
     */
    @Test
    public void testSort() {
        System.out.println("Merge sort");
        int[] actuals = {9,8,7,6,4,5,3,2,1};
        MergeSort4 instance = new MergeSort4();
        instance.sort(actuals);
        int[] expecteds = {1,2,3,4,5,6,7,8,9};
        assertArrayEquals(expecteds, actuals);
    }
    
}
