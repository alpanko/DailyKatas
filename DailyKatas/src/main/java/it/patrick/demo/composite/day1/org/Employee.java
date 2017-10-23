/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zdpatternkatas.composite.day1.org;

/**
 *
 * @author patrickn
 */
public interface Employee {

   public void add(Employee employee);
   public void remove(Employee employee);
   public Employee getChild(int i);
   public String getName();
   public double getSalary();
   public void print();
}
