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
public class MergeSort {
    public void sort(int [] array){
        mergeSort(array, 0, array.length-1);
    }
    
    private void merge(int[] arrayToSort, int posFirst, int middlePoint, int posLast)
    {
        // Find sizes of two subarrays to be merged
        int sizeOfLeftArray = middlePoint - posFirst + 1;
        int sizedOfRightArray = posLast - middlePoint;
 
        /* Create temp arrays */
        int leftArray[] = new int [sizeOfLeftArray];
        int rigthArray[] = new int [sizedOfRightArray];
 
        /*Copy data to temp arrays*/
        for (int i=0; i<sizeOfLeftArray; ++i)
            leftArray[i] = arrayToSort[posFirst + i];
        for (int j=0; j<sizedOfRightArray; ++j)
            rigthArray[j] = arrayToSort[middlePoint + 1+ j];
 
 
        /* Merge the temp arrays */
 
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarry array
        int k = posFirst;
        while (i < sizeOfLeftArray && j < sizedOfRightArray)
        {
            if (leftArray[i] <= rigthArray[j])
            {
                arrayToSort[k] = leftArray[i];
                i++;
            }
            else
            {
                arrayToSort[k] = rigthArray[j];
                j++;
            }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < sizeOfLeftArray)
        {
            arrayToSort[k] = leftArray[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < sizedOfRightArray)
        {
            arrayToSort[k] = rigthArray[j];
            j++;
            k++;
        }
    }
 
    // Main function that sorts arr[l..r] using
    // merge()
    private void mergeSort(int arr[], int posFirst, int postLast)
    {
        if (posFirst < postLast)
        {
            // Find the middle point
            int middlePoint = (posFirst+postLast)/2;
 
            // Sort first and second halves
            mergeSort(arr, posFirst, middlePoint);
            mergeSort(arr , middlePoint+1, postLast);
 
            // Merge the sorted halves
            merge(arr, posFirst, middlePoint, postLast);
        }
    }
 
    
}
