/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.patrick.demo.strategy.day3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author patrickn
 */
public class Event {
    
    private String name;
    private List<Attendee> attendees = new ArrayList<>();

    public Event(String name) {
        this.name = name;
    }
    
    public void addAttendee(Attendee attendee){
        this.attendees.add(attendee);
    }
    
    public void  render(){
        attendees.forEach((attendee) -> {
            attendee.render();
        });
    }
    public void startCompetition(){
         attendees.forEach((attendee) -> {
            attendee.compete();
        });
    }
}
