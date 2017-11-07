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
public class DecoratorDemo {
    public static void main(String[] args) {
        Car basicCar = new BasicCar();
        Car spotCar = new SportCar(basicCar);
        Car luxury = new LuxuryCar(spotCar);
        luxury.assemble();
    }
    
}
