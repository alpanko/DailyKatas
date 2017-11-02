/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.patrick.demo.composite.day5;

/**
 *
 * @author patrickn
 */
public class CompositeMain {

    public static void main(String[] args) {
        Employee diane = new Intern("Diane", 1000);
        Employee anna = new Intern("Annan", 1250);
        Employee paul = new Intern("Paul", 900);
        Employee eric = new Intern("Eric", 1100);

        Employee ali = new Manager("Ali", 1700);
        Employee john = new Manager("John", 2500);
        ali.addChildren(diane);
        ali.addChildren(anna);
        john.addChildren(paul);
        john.addChildren(eric);
        john.addChildren(ali);
        john.print();
    }

}
