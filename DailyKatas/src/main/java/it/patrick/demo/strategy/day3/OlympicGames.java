/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.patrick.demo.strategy.day3;

/**
 *
 * @author patrickn
 */
public class OlympicGames {
    public static void main(String[] args) {
        Event losAngeles = new Event("Los angeles Olympic games");
        losAngeles.addAttendee(new Referee("Colina", new CantCompete()));
        losAngeles.addAttendee(new Runner("Usain Bolt", new Canrun()));
        losAngeles.addAttendee(new Swimmer("Ian THorpe", new CanSwim()));
        losAngeles.render();
        losAngeles.startCompetition();
    }
    
}
