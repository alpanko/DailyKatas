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
public class MergeSort5 {
    
    public void sort(int []array){
        mergeSort(array, 0, array.length-1);
    }

    private void mergeSort(int[] array, int first, int last) {
        
        if(first<last){
            
            int middle = (first + last)/2;
            
            mergeSort(array, first, middle);
            mergeSort(array, middle+1, last);
            
            merge(array,first,middle,last);
        }
        
    }

    private void merge(int[] array, int first, int middle, int last) {
        
        int leftArraySize = middle-first+1;
        int rigthArraysize = last-middle;
        
        int [] leftArray = new int[leftArraySize];
        int [] rigthArray = new int[rigthArraysize];
        
        for (int i = 0; i < leftArraySize; i++) {
            leftArray[i] = array[first+i];
        }
        
        for (int j = 0; j < rigthArraysize; j++) {
                 rigthArray[j] = array[middle+j+1];   
        }
        
        int i =0;
        int j =0;
        int k = first;
        
        while (i<leftArraySize && j <rigthArraysize) {
            if(leftArray[i]<rigthArray[j]){
                array[k] = leftArray[i];
                i++;
            }else{
                array[k] = rigthArray[j];
                j++;
            }
              k++;  
            
        }
        
        while(i<leftArraySize){
            array[k] = leftArray[i];
            i++;
            k++;
        }
        
        while (j<rigthArraysize) {
            array[k] = rigthArray[j];
            j++;
            k++;
            
        }
    }
    
}
