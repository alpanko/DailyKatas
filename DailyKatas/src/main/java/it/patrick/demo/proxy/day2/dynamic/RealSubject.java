/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.patrick.demo.proxy.day2.dynamic;

/**
 *
 * @author patrickn
 */
public class RealSubject implements Subject{
    @Override
    public void stampa() {
        System.out.println("RealSubject");
    }
}
