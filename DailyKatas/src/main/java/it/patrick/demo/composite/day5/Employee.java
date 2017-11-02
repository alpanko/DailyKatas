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
public interface Employee {
    
    public void addChildren(Employee e );
    public void removeChildren(Employee e);
    public Employee getChild(int i);
    public void print();
    public double getSalary();
    public String getName();
    
}
