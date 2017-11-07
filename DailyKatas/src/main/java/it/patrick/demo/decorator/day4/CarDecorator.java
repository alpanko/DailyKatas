/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.patrick.demo.decorator.day4;

/**
 *
 * @author patrickn
 */
public class CarDecorator implements Car{

    public CarDecorator(Car car) {
        this.car = car;
    }
    
    private final Car car;

    @Override
    public void assemble() {
        this.car.assemble();
    }
    
}
