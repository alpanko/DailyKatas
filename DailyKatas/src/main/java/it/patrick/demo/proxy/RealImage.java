/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.patrick.demo.proxy;

/**
 *
 * @author patrickn
 */
public class RealImage implements Image{
    
    private final String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFronDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    public void loadFronDisk(String fileName) {
        System.out.println("Loading " + fileName);
    }
    
}
