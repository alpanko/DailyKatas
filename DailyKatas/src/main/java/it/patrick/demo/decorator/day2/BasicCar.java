/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.patrick.demo.decorator.day2;

/**
 *
 * @author patrickn
 */
public class BasicCar implements Car{

    @Override
    public void assemble() {
        System.out.println("Basic Car assemble  no decoration");
    }
    
}
