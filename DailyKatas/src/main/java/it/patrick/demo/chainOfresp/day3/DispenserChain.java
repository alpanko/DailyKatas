/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.patrick.demo.chainOfresp.day3;

/**
 *
 * @author patrickn
 */
public interface DispenserChain {
    
    void setNextDispense(DispenserChain chain);
    void dispense(Currency currency);
    
}
