/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.patrick.demo.proxy.day2;

/**
 *
 * @author patrickn
 */
public class ProxyImage implements Image{

    private String name;
    private Image realImage;

    public ProxyImage(String name) {
        this.name = name;
    }

    
    @Override
    public void display() {
        System.out.println("it.patrick.demo.proxy.day2.ProxyImage.display()");
        if(realImage == null)
            realImage = new RealImage(this.name);
        
        realImage.display();
    }
    
}
