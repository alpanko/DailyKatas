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
public class MyProxy implements Subject{
    
    private RealSubject realSubject = new RealSubject();
 
    @Override
    public void stampa() {
        System.out.println("MyProxy");
        realSubject.stampa();
    }
    
}
