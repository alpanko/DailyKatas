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
public class DecoratorTester {
    public static void main(String[] args) {

        Car luxuryCar = new LuxuryCar(new BasicCar());
        luxuryCar.assemble();
        Car SportCar = new SportCar(new LuxuryCar(new BasicCar()));
        SportCar.assemble();
    }
    
}
