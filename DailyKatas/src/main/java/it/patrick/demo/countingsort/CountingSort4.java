/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.patrick.demo.countingsort;

/**
 *
 * @author patrickn
 */
public class CountingSort4 {

    public int[] sort(int[] array) {
        return countingSort(array);
    }

    static int[] countingSort1(int arr[]) {
        int n = arr.length;

        // The result will store sorted array
        int result[] = new int[n];

        // Initialize count array with 9 as array contains elements from range 1 to 8.
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }

        }

        int[] count = new int[max - min + 1];

        for (int i = 0; i < count.length; ++i) {
            count[i] = 0;
        }

        // store count of each element in count array
        for (int i = 0; i < n; ++i) {
            ++count[arr[i] - min];
        }

        // Change count[i] so that count[i] now contains actual
        // position of this element in output array
        for (int i = 1; i <= count.length - 1; ++i) {
            count[i] += count[i - 1];
        }

        for (int i = 0; i < n; ++i) {
            result[count[arr[i] - min] - 1] = arr[i];
            --count[arr[i]];
        }

        return result;
    }

    static int[] countingSort(int arr[]) {
        int n = arr.length;

        // The result will store sorted array
        int result[] = new int[n];
        
        
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }

        }

        int range =max - min + 1;
        // Initialize count array with 9 as array contains elements from range 1 to 8.
        int count[] = new int[range+1];
        for (int i = 0; i < count.length; ++i) {
            count[i] = 0;
        }

        // store count of each element in count array
        for (int i = 0; i < n; ++i) {
            ++count[arr[i]];
        }

        // Change count[i] so that count[i] now contains actual
        // position of this element in output array
        for (int i = 1; i <= range; ++i) {
            count[i] += count[i - 1];
        }

        for (int i = 0; i < n; ++i) {
            result[count[arr[i]] - 1] = arr[i];
            --count[arr[i]];
        }

        return result;
    }
    
    /*
    
    var countingSort = function(array, sorted, max) {
  var i, j, count = [];

  // initialize counting array
  for (i = 0; i <= max; i++) {
    count[i] = 0;
  }

  // count unique occurences
  for (i = 0; i < array.length; i++) {
    count[array[i]] ++;
  }

  // sort
  for (i = 0, j = 0; i <= max; i++) {
    while (count[i] > 0) {
      sorted[j++] = i;
      count[i] --;
    }
  }
};
    
    */

}
