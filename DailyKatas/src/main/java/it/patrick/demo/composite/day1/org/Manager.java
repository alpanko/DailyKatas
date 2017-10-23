/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zdpatternkatas.composite.day1.org;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author patrickn
 */
public class Manager implements Employee {

    private String name;
    private double salary;

    List<Employee> employees = new ArrayList<Employee>();

    public Manager(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void add(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void remove(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public Employee getChild(int i) {
        return employees.get(i);
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
    public void print() {
        System.out.println("-------------");
        System.out.println("Name =" + getName());
        System.out.println("Role = Manager");
        System.out.println("Salary =" + getSalary());
        System.out.println("-------------");

        Iterator<Employee> employeeIterator = employees.iterator();
        while (employeeIterator.hasNext()) {
            Employee employee = employeeIterator.next();
            employee.print();
        }
    }

}
