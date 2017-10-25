/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.patrick.demo.strategy.day3;

/**
 *
 * @author patrickn
 */
public class Runner extends Attendee{

    public Runner(String name, ICompetitionBehaviour competitionBehaviour) {
        super(name, competitionBehaviour);
    }

    @Override
    public void render() {
        System.out.println("I'm"+getName()+" and im a runner");
    }
    
}
