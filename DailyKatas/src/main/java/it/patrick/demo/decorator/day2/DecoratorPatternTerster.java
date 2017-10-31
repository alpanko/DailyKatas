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
public class DecoratorPatternTerster {
    public static void main(String[] args) {
        Car basicCar = new BasicCar();
        basicCar.assemble();
        
        Car sportCar = new SportCar(new BasicCar());
        sportCar.assemble();
        
        Car luxuryCar = new LuxuryCar(new SportCar(new BasicCar()));
        luxuryCar.assemble();
        
    }
    
}
