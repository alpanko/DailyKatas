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
public class EventRunner extends EventAttendee{

    public EventRunner(String name, IcompeteBehaviour comBehaviour) {
        super(name, comBehaviour);
    }
    
    @Override
    public String render() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
