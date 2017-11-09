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
public abstract class EventAttendee {
    private final String name;
    private final IcompetitionBehaviour icompetitionBehaviour;

    public EventAttendee(String name, IcompetitionBehaviour icompetitionBehaviour) {
        this.name = name;
        this.icompetitionBehaviour = icompetitionBehaviour;
    }
    
    public abstract void print();
    public void compete(){
        print();
        icompetitionBehaviour.compete();
    }
    
}
