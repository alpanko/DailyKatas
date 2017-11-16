/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.patrick.demo.proxy.day2.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 *
 * @author patrickn
 */
public class MyDynamicProxy implements InvocationHandler{
private final RealSubject realSubject = new RealSubject();
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
       System.out.println("MyDynamicProxy ");
        return method.invoke(realSubject, args);
    }
    
}
