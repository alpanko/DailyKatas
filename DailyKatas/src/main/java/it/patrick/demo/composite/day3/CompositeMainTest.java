/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.patrick.demo.composite.day3;

/**
 *
 * @author patrickn
 */
public class CompositeMainTest {

    public static void main(String[] args) {
        Employee john = new Developer("john", 2000);
        Employee paul = new Developer("paul", 2500);
        Employee evan = new Developer("evan", 1500);
        Employee jane = new Developer("jane", 1950);

        Employee phil = new Manager("Phillipe", "General Manager", 10000);

        Employee ali = new Manager("Ali", "IT Manager", 5000);
        ali.addEmployee(john);
        ali.addEmployee(paul);
        ali.addEmployee(evan);
        Employee laura = new Manager("laura", "HR Manager", 10000);

        laura.addEmployee(jane);
        
        phil.addEmployee(ali);
        phil.addEmployee(laura);
        
        phil.print();;

    }

}
