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
public class NotCompetitor implements IcompeBehaviour{

    @Override
    public String compete() {
       return "i'm the referee i do not compete";
    }
    
}
