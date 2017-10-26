/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.patrick.demo.composite.day3;

import java.util.Iterator;

/**
 *
 * @author patrickn
 */
public class Developer implements Employee{
    
    private String name;
    private double salary;

    public Developer(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void addEmployee(Employee e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeEMployee(Employee e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getName() {
       return this.name;
    }

    @Override
    public String getRole() {
        return "developer";
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    @Override
    public Employee getChild(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void print() {
       System.out.println("-------------");
        System.out.println("Name =" + getName());
        System.out.println("Role = "+getRole());
        System.out.println("Salary =" + getSalary());
        System.out.println("-------------");
    }
    
}
