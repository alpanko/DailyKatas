/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.patrick.demo.composite.day4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author patrickn
 */
public class Manager implements Employee{
    
    private String name;
    private double salary;
    private List<Employee> children = new ArrayList<>();

    public Manager(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void addEmployee(Employee e) {
        this.children.add(e);
    }

    @Override
    public void removeEmployee(Employee e) {
        this.children.remove(e);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    @Override
    public Employee getChild(int i) {
        return children.get(i);
    }

    @Override
    public void print() {
        System.out.println("-------------");
        System.out.println("Name =" + getName());
        System.out.println("Salary =" + getSalary());
        System.out.println("-------------");

        Iterator<Employee> employeeIterator = children.iterator();
        while (employeeIterator.hasNext()) {
            Employee employee = employeeIterator.next();
            employee.print();
        }
    }
    
}
