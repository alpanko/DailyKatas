/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zdpatternkatas.strategy_fail_day1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author patrickn
 */
public class Event {
    
    List<EventAttendee> attendees;
    private String eventName;
    
    public Event(String eventName) {
        this.eventName = eventName;
        attendees = new ArrayList<>();
    }
    
    public String renderAttendees(){
        StringBuilder sb = new StringBuilder();
        attendees.forEach((attendee) -> {
            sb.append(attendee.render()).append("\n");
        });
        return sb.toString();
    }
    
    public String runCompetition(){
        StringBuilder sb = new StringBuilder();
        attendees.forEach((attendee) -> {
            sb.append(attendee.render()).append("\n");
        });
        return sb.toString();
    }
    

    public List<EventAttendee> getAttendees() {
        return attendees;
    }

    public void setAttendees(List<EventAttendee> attendees) {
        this.attendees = attendees;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    
    
}
