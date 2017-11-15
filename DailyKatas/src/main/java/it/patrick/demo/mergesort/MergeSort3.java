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
public class MergeSort3 {
    public void sort(int [] array){
        mergeSort(array,0,array.length-1);
    }

    private void mergeSort(int[] array, int first, int last) {
        
        if(first<last){
            int middle = (first + last )/2;
            mergeSort(array, first, middle);
            mergeSort(array, middle+1, last);
            merge(array, first,middle, last);
        }
    }

    private void merge(int[] array, int first, int middle, int last) {
        
        int sizeLeft = middle -first+1;
        int sizeRight = last-middle;
        int[] leftArray = new int[sizeLeft];
        int [] rightArray = new int [sizeRight];
        
        for (int i = 0; i < sizeLeft; ++i) {
            leftArray[i] = array[first+i];
        }
        for (int j = 0; j < sizeRight; ++j) {
            rightArray[j] = array[j+middle+1];
        }
        /*
         for (int i = 0; i < sizeOfLeftArray; ++i) {
            leftArray[i] = array[positionFisrt+i];
        }
        
        for (int j = 0; j < sizeOfRigthArray; ++j) {
            rightArray[j] = array[middlePoint + 1+ j];
        }
*/
        
        int i =0;
        int  j = 0;
        int indexOnOriginalArray = first;
        
        while (i<sizeLeft && j < sizeRight) {
            
            if(leftArray[i]<=rightArray[j]){
                array[indexOnOriginalArray] = leftArray[i];
                i++;
            }else{
                array[indexOnOriginalArray] = rightArray[j];
                j++;
            }
                
            indexOnOriginalArray++;
        }
        
        while (i<sizeLeft) {
            array[indexOnOriginalArray] = leftArray[i];
            i++;
            indexOnOriginalArray ++;
            
        }
        
        while (j<sizeRight) {
            array[indexOnOriginalArray] = rightArray[j];
            j++;
            indexOnOriginalArray++;
        }
                
    }
}
