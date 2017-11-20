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
public class MergeSort6 {
    
    public void sort(int [] array){
        mergeSort(array,0,array.length-1);
    }

    private void mergeSort(int[] array, int first, int last) {
        
        if(first<last){
            int middle = (first+last)/2;
            
            
            mergeSort(array, first, middle);
            mergeSort(array, middle+1, last);
            
            merge(array,first,middle,last);
        }
        
    }

    private void merge(int[] array, int first, int middle, int last) {
       int leftSize = middle-first+1;
       int rigthSize = last-middle;
       
       int [] leftArray = new int[leftSize];
       int [] rightArray = new int[rigthSize];
       
        for (int i = 0; i < leftSize; ++i) {
            leftArray[i] = array[first+i];
        }
        
        for (int i = 0; i < rigthSize; ++i) {
            rightArray[i] = array[middle+1+i];
        }
        
        int i =0;
        int j =0;
        int k = first;
        
        while (i<leftSize && j<rigthSize) {
           if(leftArray[i]<=rightArray[j]){
               
               array[k] =  leftArray[i];
               i++;
           }else{
               array[k] = rightArray[j];
               j++;
           }
           k++;
            
        }
        
        while (i<leftSize) {
            array[k] = leftArray[i];
            i++;
            k++;
        }
        
        while (j<rigthSize) {
            array[k] = rightArray[j];
            j++;
            k++;
            
        }
    }
}
