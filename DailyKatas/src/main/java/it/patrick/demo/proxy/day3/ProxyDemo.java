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
public class ProxyDemo {
    
    public static void main(String[] args) {
        Image proxyImage = new ProxyImage("File name");
        proxyImage.display();
    }
    
}
