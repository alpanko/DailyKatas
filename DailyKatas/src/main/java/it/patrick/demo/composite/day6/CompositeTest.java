/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.patrick.demo.composite.day6;

/**
 *
 * @author patrickn
 */
public class CompositeTest {

    public static void main(String[] args) {
        Employee bob = new Intern("Bob", 1000);
        Employee paul = new Intern("Paul", 1200);
        Employee ann = new Intern("Anne", 900);
        Employee john = new Manager("John","Hr" ,1500);
        Employee al = new Manager("Ali","Manager" ,1700);
        Employee ethan = new Manager("Ethan","Manager" ,1800);
        Employee mary = new Manager("Mary","General Manager" ,2500);
        
        john.addChild(bob);
        al.addChild(paul);
        ethan.addChild(ann);
        mary.addChild(john);
        mary.addChild(al);
        mary.addChild(ethan);
        mary.print();
        

    }

}
