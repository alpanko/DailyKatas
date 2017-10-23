/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.patrick.demo.quickSort;

/**
 *
 * @author patrickn
 */
public class QuickSort2 {
    public void sort(int [] array){
        quickSort(array,0,array.length-1);
    }

    private void quickSort(int[] array, int low, int high) {
        
        int i = low;
        int j = high;
        int pivot = array[low + (high-low)/2];
        while (i<=j) {
            while(array[i]<pivot){
                i++;
            }
            
            while(array[j]>pivot){
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
       // call quickSort() method recursively
        if (low < j)
            quickSort(array, low, j);
        if (i < high)
            quickSort(array, i, high);
        
    }
    
    public static void main(String a[]){
         
        QuickSort2 sorter = new QuickSort2();
        int[] input = {24,2,45,20,56,75,2,56,99,53,12};
        sorter.sort(input);
        for(int i:input){
            System.out.print(i);
            System.out.print(" ");
        }
    }
    
}
