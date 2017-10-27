/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.patrick.demo.quickSort;

import java.util.Random;

/**
 *
 * @author patrickn
 */
public class QuickSort6 {

    public void sort(int[] array) {

        quickSort(array, 0, array.length - 1);

    }

    private void quickSort(int[] array, int low, int high) {
        int i = low;
        int j = high;
        int pivot = array[low + (high - low) / 2];
        while (i <= j) {

            while (array[i] < pivot) {
                i++;
            }

            while (array[j] > pivot) {

                j--;

            }
            if(i<=j){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }

        }
        
        if(low<j)
            quickSort(array, low, j);
        
        if(i<high)
            quickSort(array, i, high);
        
       
    }

}
