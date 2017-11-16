/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.patrick.demo.proxy.day2.dynamic;

import java.lang.reflect.Proxy;

/**
 *
 * @author patrickn
 */
public class DynamicCLient {
    
    private Subject subject;
 
    public static void main(String[] args) throws Exception {
        new DynamicCLient().invoke();
    }
 
    public void invoke() {
        subject = (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(),
                new Class[]{Subject.class},
                new MyDynamicProxy());
        subject.stampa();
    }
    
}
