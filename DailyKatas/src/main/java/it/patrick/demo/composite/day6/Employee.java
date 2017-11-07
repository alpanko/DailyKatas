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
public interface Employee {
    
    public void addChild(Employee e);
    public void removeChild(Employee e);
    public Employee getChild(int index);
    public String getName();
    public String getRole();
    public double getSalary();
    public void print();
    
}
