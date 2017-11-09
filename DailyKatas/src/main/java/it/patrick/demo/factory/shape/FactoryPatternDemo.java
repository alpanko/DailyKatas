/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.patrick.demo.factory.shape;

/**
 *
 * @author patrickn
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape circle = factory.getShape("CIRCLE");
        circle.draw();
        
        Shape rect = factory.getShape("RECTANGLE");
        rect.draw();
        
        Shape square = factory.getShape("SQUARE");
        square.draw();
    }
    
}
