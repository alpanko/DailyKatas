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
public abstract class Attendee {
    private String name;
    private ICompetitionBehaviour competitionBehaviour;
    
    public abstract void render();
    public void compete(){
        competitionBehaviour.compete();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ICompetitionBehaviour getCompetitionBehaviour() {
        return competitionBehaviour;
    }

    public void setCompetitionBehaviour(ICompetitionBehaviour competitionBehaviour) {
        this.competitionBehaviour = competitionBehaviour;
    }

    public Attendee(String name, ICompetitionBehaviour competitionBehaviour) {
        this.name = name;
        this.competitionBehaviour = competitionBehaviour;
    }
            
    
}
