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
public class Referee extends Attendee {

    public Referee(String name) {
        super(name, new NotCompetitor());
    }

    

    @Override
    public String render() {
        return "my name is "+super.getName()+"\n";
    }
    
}
