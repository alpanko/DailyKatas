/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.patrick.demo.strategy.day5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author patrickn
 */
public class Event {
    
    public List<EventAttendee> attendees= new ArrayList<>();
    private final String name;

    public Event(String name) {
        this.name = name;
    }
    
    public void addAttendee(EventAttendee attendee){
        this.attendees.add(attendee);
    }
    
    public void compete(){
        System.out.println("Welcome to event :"+name);
        for (EventAttendee attendee : attendees) {
            attendee.compete();
        }
    }
    
}
