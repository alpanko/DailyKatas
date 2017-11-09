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
public class Referee extends EventAttendee{

    public Referee(String name, IcompetitionBehaviour icompetitionBehaviour) {
        super(name, icompetitionBehaviour);
    }

    @Override
    public void print() {
        System.out.println("it.patrick.demo.strategy.day5.Referee.print()");
    }
    
}
