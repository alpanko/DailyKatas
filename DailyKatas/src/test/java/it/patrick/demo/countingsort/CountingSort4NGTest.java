/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.patrick.demo.countingsort;

import static org.testng.Assert.*;

/**
 *
 * @author patrickn
 */
public class CountingSort4NGTest {
    
    public CountingSort4NGTest() {
    }

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of sort method, of class CountingSort4.
     */
    @org.testng.annotations.Test
    public void testSort() {
        System.out.println("sort");
//        int[] array = {1,4,7,3,4,5,6,3,4,8,6,4,4};
//        CountingSort4 instance = new CountingSort4();
//        int[] expResult = {1,3,3,4,4,4,4,4,5,6,6,7,8};
//        int[] result = instance.sort(array);
//        assertEquals(result, expResult);
        
        
        int[] array = {9,8,7,6,5,4,3,2,1};
        CountingSort4 instance = new CountingSort4();
        int[] expResult = {1,2,3,4,5,6,7,8,9};
        int[] result = instance.sort(array);
        assertEquals(result, expResult);
        
    }
    
}
