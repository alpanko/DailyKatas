/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.patrick.demo.composite.day4;

/**
 *
 * @author patrickn
 */
public class CompositeMainTest {
    public static void main(String[] args) {
        Employee paul = new Intern("paul", 1000);
        Employee mary = new Intern("Mary", 1100);
        Employee john = new Intern("John", 900);
        
        Employee graig = new Manager("Graig", 2000);
        
        Employee ryan = new Manager("Ryan", 3000);
        
        graig.addEmployee(paul);
        graig.addEmployee(mary);
        ryan.addEmployee(john);
        ryan.addEmployee(graig);
        ryan.print();
        
    }
}
