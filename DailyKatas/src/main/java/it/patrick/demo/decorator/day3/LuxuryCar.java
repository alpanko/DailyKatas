/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.patrick.demo.decorator.day3;

/**
 *
 * @author patrickn
 */
public class LuxuryCar extends CarDecorator{
    
    public LuxuryCar(Car car) {
        super(car);
    }
    
    @Override
    public void assemble(){
        super.assemble();
        System.out.println("Adding Luxury Features ...");
    }
}
