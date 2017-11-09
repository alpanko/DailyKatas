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
public class PizzaFactory {

    public static enum PizzaType {
        Peppe, mozza
    }

    public Pizza getPizza(PizzaType pizzatype) {
        switch (pizzatype) {
            case Peppe:
                return new Peperoni();
            case mozza:
                return new Mozza();
            default:
                return null;

        }
    }
}
