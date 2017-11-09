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
public abstract class Pizza {
    public void order() {
        prepare();
        bake();
        cut();
        box();
    }
    abstract void prepare();
    abstract void bake();
    abstract void cut();
    abstract void box();
}
