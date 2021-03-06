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
public class countingSort2 {
    
    public int[] sort(int []array){
        return coutingSort(array);
    }

    private int[] coutingSort(int []array) {
        int aux[] = new int[array.length];
        
        //min et max
        
        int min = array[0];
        int max =array[0];
        
        for (int i = 1; i < array.length; i++) {
            if(array[i]<min){
                min = array[i];
            }else if (array[i]>max){
                max = array[i];
            }
        }
        
        int[] counts = new int[max-min+1];
        
        for(int i =0;i<array.length;i++){
            counts[array[i]-min]++;
        }
        
        counts[0]--;
        
        for(int i =1;i<counts.length;i++){
           counts[i] = counts[i]+counts[i-1];
        }
        
        
        for (int i = array.length-1;i>=0;i--) {
            aux[counts[array[i] - min]--] = array[i];
        }
        
        return aux;
    }
    
}
