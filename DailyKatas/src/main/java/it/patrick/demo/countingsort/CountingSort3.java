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
public class CountingSort3 {

    public int[] sort(int[] array) {
        return countingSort(array);
    }

    static int[] countingSort2(int arr[]) {
        int n = arr.length;

        // The result will store sorted array
        int result[] = new int[n];

        // Initialize count array with 9 as array contains elements from range 1 to 8.
        int count[] = new int[9];
        for (int i = 0; i < 9; ++i) {
            count[i] = 0;
        }

        // store count of each element in count array
        for (int i = 0; i < n; ++i) {
            ++count[arr[i]];
        }

        // Change count[i] so that count[i] now contains actual
        // position of this element in output array
        for (int i = 1; i <= 8; ++i) {
            count[i] += count[i - 1];
        }

        for (int i = 0; i < n; ++i) {
            result[count[arr[i]] - 1] = arr[i];
            --count[arr[i]];
        }

        return result;
    }

    private int[] countingSort(int[] array) {

        // cree l'array de retour dans le quel seront copiés les valeurs
        int aux[] = new int[array.length];

        //calcule le min et le max
        int min = array[0];

        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            } else if (array[i] > max) {
                max = array[i];
            }

        }

        // je cree un array contenant le nombre d'element a ordoner
        // si je dois ordoner une liste de 1 a 10 par exemple je dois avoir un array de
        // 10-1+1 = 10 elements meme si j'ai des nombres dupliqués ça ne change rien
        //dans cet array on sauve la valeur obtenue en comptant le nombre de fois qu'un element apprait 
        //dans la liste
        int[] counts = new int[max - min + 1];

        //je cycle la liste originale et je mets dans count le nombre de fois qu'un element apparait
        // le le mets a la position correspondant a sa valeur
        // eg : si je trouve array[i] = 1 je le mets a count[array[1]]
        for (int i = 0; i < array.length; ++i) {
            counts[array[i]]++;
        }

        //incremento i valori din count i en prenant que l'element [i] = [i-1]+[i]
        // de 1 a lentg-1
        for (int i = 1; i < counts.length - 1; ++i) {
            counts[i] += counts[i - 1];
        }

        // je copie les elements de counts dans le nouvel array prenant la posiiotion
        for (int i = 0; i < aux.length; i++) {
            aux[counts[array[i]] - 1] = array[i];
            --counts[array[i]];
        }

        return aux;
    }

}
