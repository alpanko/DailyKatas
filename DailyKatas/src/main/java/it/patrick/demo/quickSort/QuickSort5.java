/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.patrick.demo.quickSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.time.StopWatch;

/**
 *
 * @author patrickn
 */
public class QuickSort5 implements Runnable{

    public static void main(String[] args) {
        QuickSort5 qc5 = new QuickSort5();
        int[] numbers = {10000000};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Starting confront for " + numbers[i] + " Elements");
            makeSort(numbers[i], qc5);
            System.out.println("End of confront for " + numbers[i] + " Elements\n-------------------------------\n");

        }

    }

    private static void makeSort(int arrayLenght, QuickSort5 qc5) {
        int[] randomArrays = qc5.getRandomArray(arrayLenght);
//        System.out.println("Sorting : "+Arrays.toString(randomArrays));
//        Runtime rt = Runtime.getRuntime();
//        long total = rt.totalMemory();
//        long free = rt.freeMemory();
//
//        System.out.println(
//                String.format("Total: %s, Free: %s",
//                        total,
//                        free));

        StopWatch watch = new StopWatch();
        watch.start();
        qc5.sort(randomArrays);
        watch.stop();
        System.out.println("time with fixed middle pivot:" + watch.getTime());
        watch.reset();
        watch.start();
        qc5.sortWithRandomPivot(randomArrays);
        watch.stop();
        System.out.println("time with random pivot : " + watch.getTime());

    }

    public void sort(int[] array) {

        quickSort(array, 0, array.length - 1);

    }

    public void sortWithRandomPivot(int[] array) {

        quickSortWithRandomPIvot(array, 0, array.length - 1);
//        Runtime rt = Runtime.getRuntime();
//        long total = rt.totalMemory();
//        long free = rt.freeMemory();
//
//        System.out.println(
//                String.format("Total: %s, Free: %s",
//                        total,
//                        free));

    }

    private void quickSortWithRandomPIvot(int[] array, int low, int high) {
//        Runtime rt = Runtime.getRuntime();
//        long total = rt.totalMemory();
//        long free = rt.freeMemory();
//
//        System.out.println(
//                String.format("Total: %s, Free: %s",
//                        total,
//                        free));

        int i = low;
        int j = high;
        Random rn = new Random();
        int pivotIndex = low + rn.nextInt(high - low + 1);
        int pivot = array[pivotIndex];

        while (i <= j) {

            while (array[i] < pivot) {

                i++;
            }

            while (array[j] > pivot) {
                j--;

            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;

            }

        }

        if (low < j) {
            quickSortWithRandomPIvot(array, low, j);
        }

        if (i < high) {
            quickSortWithRandomPIvot(array, i, high);
        }

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
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;

            }

        }
        if (low < j) {
            quickSort(array, low, j);
        }

        if (i < high) {
            quickSort(array, i, high);
        }

    }

    private int[] getRandomArray(int length) {

        List<Integer> intList = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            intList.add(i);

        }
        Collections.shuffle(intList);
        int[] intArray = ArrayUtils.toPrimitive(intList.toArray(new Integer[0]));
        return intArray;

    }

    @Override
    public void run() {
        QuickSort5 qc5 = new QuickSort5();
        int[] numbers = {10000000};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Starting confront for " + numbers[i] + " Elements");
            makeSort(numbers[i], qc5);
            System.out.println("End of confront for " + numbers[i] + " Elements\n-------------------------------\n");

        }
    }
}
