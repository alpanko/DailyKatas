/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.patrick.demo.strategy.day5;

/**
 *
 * @author patrickn
 */
public class Olympics {
    public static void main(String[] args) {
        Event athens = new Event("Olympics of athens");
        
        EventAttendee ref = new Referee("Colina", new DonotRun());
        EventAttendee runner = new Runner("Blt", new Run());
        athens.addAttendee(runner);
        athens.addAttendee(ref);
        athens.compete();
    }
    
}
