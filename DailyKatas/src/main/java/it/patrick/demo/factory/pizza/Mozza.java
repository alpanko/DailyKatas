/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.patrick.demo.factory.pizza;

/**
 *
 * @author patrickn
 */
public class Mozza extends Pizza{

    @Override
    public void prepare() {
        System.out.println("it.patrick.demo.factory.pizza.Mozza.prepare()");
    }

    @Override
    public void bake() {
        System.out.println("it.patrick.demo.factory.pizza.Mozza.bake()");
    }

    @Override
    public void cut() {
        System.out.println("it.patrick.demo.factory.pizza.Mozza.cut()");
    }

    @Override
    public void box() {
        System.out.println("it.patrick.demo.factory.pizza.Mozza.box()");
    }

   
    
}
