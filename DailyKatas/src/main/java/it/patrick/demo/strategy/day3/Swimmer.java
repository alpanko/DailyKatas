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
public class Swimmer extends  Attendee{

    public Swimmer(String name, ICompetitionBehaviour competitionBehaviour) {
        super(name, competitionBehaviour);
    }

    @Override
    public void render() {
        System.out.println("i'm "+getName()+" and i'm a swimmer");
    }
    
}
