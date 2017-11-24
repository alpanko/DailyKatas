/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.patrick.demo.chainOfresp.day2;

/**
 *
 * @author patrickn
 */
public class ATMDispenserChain {
    
    private DispenseChain c1;
    
    public ATMDispenserChain(){
        this.c1 = new Dollar50Dispenser();
        DispenseChain c2 = new Dollar20Dispenser();
        DispenseChain c3 = new Dollar10Dispenser();
        DispenseChain c4 = new Dollar5Dispenser();
        c1.setNextChain(c2);
        c2.setNextChain(c3);
        c3.setNextChain(c4);
    }
    
    public static void main(String[] args) {
        ATMDispenserChain atmDispenser = new ATMDispenserChain();
        
        int val = 8555;
        atmDispenser.c1.dispense(new Currency(val));
        
    }
    
}
