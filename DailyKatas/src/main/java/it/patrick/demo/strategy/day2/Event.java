/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zdpatternkatas.strategy.day2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author patrickn
 */
public class Event {

    public Event(String eventName) {
        this.eventName = eventName;
        this.attendees = new ArrayList<>();
    }
    
    private String eventName;

    public List<Attendee> getAttendees() {
        return attendees;
    }

    public void setAttendees(List<Attendee> attendees) {
        this.attendees = attendees;
    }
    private List<Attendee> attendees;
    
    
    public String renderAttendees(){
        StringBuilder sb = new StringBuilder();
        attendees.forEach((Attendee attendee) -> {
            sb.append(attendee.render());
        });
        return sb.toString();
    }
    
    
    public String runCompetition(){
        StringBuilder sb = new StringBuilder();
        attendees.forEach((Attendee attendee) -> {
            sb.append(attendee.compete());
        });
        return sb.toString();
    }
}
