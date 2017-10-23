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
public class Swimmer extends Attendee{

    public Swimmer(String name) {
        super(name, new CanSwim());
    }

    
    
    @Override
    public String render() {
        return "my name is "+super.getName()+"\n";
    }
    
}
