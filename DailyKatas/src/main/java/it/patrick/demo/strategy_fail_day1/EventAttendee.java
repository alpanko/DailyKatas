/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zdpatternkatas.strategy_fail_day1;

/**
 *
 * @author patrickn
 */
public abstract class EventAttendee {
    
    private IcompeteBehaviour competeBehaviour;
    private String name;
    
    public EventAttendee(String name, IcompeteBehaviour comBehaviour){
        this.name = name;
        this.competeBehaviour = comBehaviour;
    }
            
    
    public abstract String render();
    
}
