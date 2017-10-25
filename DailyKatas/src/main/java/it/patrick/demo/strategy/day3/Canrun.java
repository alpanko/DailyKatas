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
public class Canrun implements ICompetitionBehaviour{

    @Override
    public void compete() {
        System.out.println("I'm running");
    }
    
}
