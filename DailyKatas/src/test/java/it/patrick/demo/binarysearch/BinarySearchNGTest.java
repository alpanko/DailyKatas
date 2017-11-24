/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.patrick.demo.binarysearch;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author patrickn
 */
public class BinarySearchNGTest {
    
    public BinarySearchNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of search method, of class BinarySearch.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        int[] array = {9,8,7,6,5,4,3,2,1};
        int toSearch = 4;
        BinarySearch instance = new BinarySearch();
        int expResult = 3;
        int result = instance.search(array, toSearch);
        int result2 = instance.searchJavaUtils(array, toSearch);
        assertEquals(result, result2);
        assertEquals(result, expResult);
        
        
    }
    
}
