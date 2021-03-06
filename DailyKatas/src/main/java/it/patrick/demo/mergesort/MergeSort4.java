/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.patrick.demo.mergesort;

/**
 *
 * @author patrickn
 */
public class MergeSort4 {
    
    public void sort(int [] array){
         mergeSort(array, 0, array.length-1);
    }

    private void mergeSort(int[] array, int first, int last) {
        
        if(first<last){
            int middle = (first + last)/2;
            
            mergeSort(array, first, middle);
            mergeSort(array, middle+1, last);
            
            mergeSort(array, first,middle,last);
            
        }
        
    }

    private void mergeSort(int[] array, int first, int middle, int last) {
        
        int sizeLeftArray = middle-first+1;
        int sizeRightArray = last -middle;
        
        int [] leftArray = new int[sizeLeftArray];
        int [] rigthArray = new int [sizeRightArray];
        
        for (int i = 0; i < sizeLeftArray; ++i) {
            leftArray[i] = array[first +i];
        }
        
        for (int j = 0; j < sizeRightArray; ++j) {
            rigthArray[j] = array[middle+j+1];
        }
        
        int i =0;
        int j = 0;
        int k = first;
        
        while (i<sizeLeftArray && j < sizeRightArray) {
           
            if(leftArray[i]<rigthArray[j]){
                array[k] = leftArray[i];
                i++;
            }else{
                array[k] = rigthArray[j];
                j++;
            }
            k++;
            
        }
        
        while (i<sizeLeftArray) {
            array[k] = leftArray[i];
            i++;
            k++;
            
        }
        
        while (j<sizeRightArray) {
            array[k] = rigthArray[j];
            j++;
            k++;
            
        }
    }
    
}
