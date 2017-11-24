/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.patrick.demo.binarysearch;

import it.patrick.demo.quickSort.QuickSort10;
import java.util.Arrays;

/**
 *
 * @author patrickn
 */
public class BinarySearch {
    
    
    public int searchJavaUtils(int [] array, int toSearch){
        new QuickSort10().sort(array);
        return Arrays.binarySearch(array,toSearch);
    }
    
    public int search(int [] array, int toSearch){
        new QuickSort10().sort(array);
        
        int min = 0;
        int max = array.length-1;
        return binarySearch(array,min,max,toSearch);
    }

    private int binarySearch(int[] array, int min, int max, int toSearch) {
        int ret = -1;
        
        
        while (max>=min) {
            
            int middle = (min +max)/2;
            if(array[middle] == toSearch)
                return middle;
            if(array[middle]>toSearch)
                return binarySearch(array, 1, middle-1, toSearch);
            return binarySearch(array, middle+1, max, toSearch);
        }
        
        return ret;
    }
    
}
