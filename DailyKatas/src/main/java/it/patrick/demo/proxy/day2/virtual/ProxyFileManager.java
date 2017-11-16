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
public class ProxyFileManager implements FileInterface{
    private FileManager fileManager;
    private String fileName;
 
    public ProxyFileManager(String fileName) {
        System.out.println("ProxyFileManager() " );
        this.fileName = fileName;
    }
 
    @Override
    public void display() {
        System.out.print("ProxyFileManager.display() -> " );
        if (fileManager==null)
            fileManager = new FileManager( fileName );
        fileManager.display();
    }
}
