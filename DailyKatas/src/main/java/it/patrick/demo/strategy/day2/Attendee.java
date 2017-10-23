/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zdpatternkatas.strategy.day2;

/**
 *
 * @author patrickn
 */
public abstract class Attendee {
    
    private String name;
    private IcompeBehaviour competeBehaviour;

    public abstract String render();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IcompeBehaviour getCompeteBehaviour() {
        return competeBehaviour;
    }

    public void setCompeteBehaviour(IcompeBehaviour competeBehaviour) {
        this.competeBehaviour = competeBehaviour;
    }

    public Attendee (String name , IcompeBehaviour competeBehaviour){
        this.name = name;
        this.competeBehaviour = competeBehaviour;
    }

    String compete() {
        return competeBehaviour.compete();
    }
    
}
