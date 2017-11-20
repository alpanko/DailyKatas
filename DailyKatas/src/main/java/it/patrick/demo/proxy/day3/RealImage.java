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
public class RealImage implements Image{
    
    private final String fileName;

    public RealImage(String fileName) {
        System.out.println("it.patrick.demo.proxy.day3.RealImage.<init>()");
        this.fileName = fileName;
        loadFIleFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("it.patrick.demo.proxy.day3.RealImage.display()");
    }

    private void loadFIleFromDisk(String fileName) {
        System.out.println("it.patrick.demo.proxy.day3.RealImage.loadFIleFromDisk()");
    }
    
}
