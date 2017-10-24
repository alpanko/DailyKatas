/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.patrick.demo.composite.day2;

/**
 *
 * @author patrickn
 */
public interface Employee {
    
    public void add(Employee employee);
    public void remove(Employee employee);
    public String getName();
    public double getSalary();
    public Employee getChild(int i);
    public void print();
    
}
