/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.patrick.demo.proxy.day2.virtual;

/**
 *
 * @author patrickn
 */
public class DocumentManager {
     public DocumentManager(String textFileName, String imageFileName) {
        loadText(textFileName);
        loadImage(imageFileName);
    }
 
    private void loadText(String textFileName) {
        System.out.println("--LOADING TEXT--");
        new FileManager(textFileName).display();
    }
 
    private void loadImage(String imageFileName) {
        System.out.println("--LOADING IMAGES--");
        new ProxyFileManager(imageFileName).display();
    }
}
