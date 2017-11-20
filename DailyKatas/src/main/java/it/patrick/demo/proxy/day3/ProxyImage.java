/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.patrick.demo.proxy.day3;

/**
 *
 * @author patrickn
 */
public class ProxyImage implements Image{
    
    private final String fileName;
    private  RealImage realImage;

    public ProxyImage(String fileName) {
        System.out.println("it.patrick.demo.proxy.day3.ProxyImage.<init>()");
        this.fileName = fileName;
    }

    @Override
    public void display() {
        System.out.println("it.patrick.demo.proxy.day3.ProxyImage.display()");
        if(realImage == null)
                realImage = new RealImage(fileName);
        realImage.display();
    }
    
}
