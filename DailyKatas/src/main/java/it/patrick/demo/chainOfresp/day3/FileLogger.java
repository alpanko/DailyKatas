/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.patrick.demo.chainOfresp.day3;

/**
 *
 * @author patrickn
 */
public class FileLogger extends AbstractLogger {

   public FileLogger(int level){
      this.level = level;
   }

   @Override
   protected void write(String message) {		
       System.out.println("it.patrick.demo.chainOfresp.day3.FileLogger.write() : "+message);
   }
}