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
public class PizzaFactoryDemo {
    public static void main(String[] args) {
        PizzaFactory daGirogioPizza = new PizzaFactory();
        Pizza mozzPizza = daGirogioPizza.getPizza(PizzaFactory.PizzaType.mozza);
        mozzPizza.order();
        
        Pizza pep = daGirogioPizza.getPizza(PizzaFactory.PizzaType.Peppe);
        pep.order();
    }
    
}
