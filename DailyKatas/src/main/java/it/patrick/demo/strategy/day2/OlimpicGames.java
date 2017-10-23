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
public class OlimpicGames {
    public static void main(String[] args) {
        Event athensGame= new Event("Athens 2004");
        athensGame.getAttendees().add(new Referee("Colina"));
        athensGame.getAttendees().add(new Runner("Usain Bolt"));
        athensGame.getAttendees().add(new Swimmer("Ian thrope"));
        
        System.out.println(athensGame.renderAttendees());
        System.out.println(athensGame.runCompetition());
    }
    
}
