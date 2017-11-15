/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.patrick.demo.mergesort;

import java.util.Arrays;

/**
 *
 * @author patrickn
 */
public class MergeSort2 {
    
    public  int count =0;
    public  int countMerge =0;
    
    public void sort(int [] array){
        Arrays.stream(array).forEach(System.out::print);
         System.out.println("\n");
         count =0;
        mergeSort(array, 0, array.length-1);
        System.out.println("Total count : "+count);
    }

    private void mergeSort(int[] array, int positionFisrt, int positionLast) {
        ++count;
        System.out.println("Count : "+count+" \npositionFisrt : "+positionFisrt+" positionLast : "+positionLast+"\n");
        if(positionFisrt<positionLast){
            int middlePoint = (positionFisrt+positionLast)/2;
            mergeSort(array, positionFisrt, middlePoint);
            mergeSort(array, middlePoint+1, positionLast);
            
           merge(array, positionFisrt, middlePoint, positionLast);
        }
       
    }

    private void merge(int[] array, int positionFisrt, int middlePoint, int positionLast) {
        ++countMerge;
        System.out.println("CountMerge : "+countMerge+" positionFisrt : "+positionFisrt+" middlePoint : "+middlePoint+" positionLast : "+positionLast+"\n");
        int sizeOfLeftArray = middlePoint-positionFisrt+1;
        int sizeOfRigthArray = positionLast-middlePoint;
        
        int [] leftArray = new int [sizeOfLeftArray];
        int [] rightArray = new int[sizeOfRigthArray];
        
        for (int i = 0; i < sizeOfLeftArray; ++i) {
            leftArray[i] = array[positionFisrt+i];
        }
        
        for (int j = 0; j < sizeOfRigthArray; ++j) {
            rightArray[j] = array[middlePoint + 1+ j];
        }
        
        int i = 0, j = 0;
 
        // Initial index of merged subarry array
        int k = positionFisrt;
        
        while(i<sizeOfLeftArray && j <sizeOfRigthArray){
            
            if (leftArray[i] <= rightArray[j]){
            
                array[k]=leftArray[i];
             i++;
            }else{
                    
                array[k] = rightArray[j];
                    j++;
            }
            
           
            k++;
        }
        while(i<sizeOfLeftArray){
            array[k] = leftArray[i];
            i++;
            k++;
        }
        while(j<sizeOfRigthArray){
            array[k] = rightArray[j];
            j++;
            k++;
        }
        
         Arrays.stream(array).forEach(System.out::print);
         System.out.println("\n");
    }
    
}
