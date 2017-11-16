/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.patrick.demo.proxy.day2.virtual;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author patrickn
 */
public class FileLoader {
    
    public byte[] load( String fileName ) {
        byte [] myFile = null;
        try {
            InputStream is = new FileInputStream( fileName );
            myFile = new byte[is.available()];
            is.read(myFile);
        } catch (IOException ex) {}
        return myFile;
    }
    
}
