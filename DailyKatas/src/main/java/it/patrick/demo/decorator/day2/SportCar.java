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
public class SportCar extends CarDecorator{
    
    public SportCar(Car car) {
        super(car);
    }
    
    @Override
    public void assemble(){
        super.assemble();
        System.out.println("Adding Sport Feature ... This is the sport decoration");
        
    }
    
}
