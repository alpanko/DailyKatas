/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.patrick.demo.composite.day3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author patrickn
 */
public class Manager implements Employee{
    
    private final String name ;
    private final String role;
    private final double salary;
    
    private final List<Employee> employees = new ArrayList<>();

    public Manager(String name, String role, double salary) {
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    @Override
    public void addEmployee(Employee e) {
       employees.add(e);
    }

    @Override
    public void removeEMployee(Employee e) {
        employees.remove(e);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getRole() {
        return this.role;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    @Override
    public Employee getChild(int i) {
        return employees.get(i);
    }

    @Override
    public void print() {
        System.out.println("-------------");
        System.out.println("Name =" + getName());
        System.out.println("Role = "+getRole());
        System.out.println("Salary =" + getSalary());
        System.out.println("-------------");

        Iterator<Employee> employeeIterator = employees.iterator();
        while (employeeIterator.hasNext()) {
            Employee employee = employeeIterator.next();
            employee.print();
        }
    }
    
}
