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
public class QuickSortThreadRunner {
    public static void main(String[] args) {
        Runnable t = new QuickSort5();
        t.run();
    }
    
}
