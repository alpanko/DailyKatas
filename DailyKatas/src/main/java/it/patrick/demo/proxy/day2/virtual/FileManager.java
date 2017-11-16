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
public class FileManager implements FileInterface{
    
    private byte[] byteImage;
 
    public FileManager(String fileName) {
        System.out.print("FileManager() -> " );
        byteImage = load( fileName );
    }
 
    private byte[] load( String fileName) {
        System.out.println("FileManager.load(): loading file " + fileName);
        return new FileLoader().load(fileName);
    }
 
    @Override
    public void display() {
        System.out.print("FileManager.display(): display file ");
        for(int i=0;  i<byteImage.length && i<10;i++) {
           System.out.print( Integer.toHexString( byteImage[i] ) + " ");
        }
        System.out.println("...");
    }
    
}
