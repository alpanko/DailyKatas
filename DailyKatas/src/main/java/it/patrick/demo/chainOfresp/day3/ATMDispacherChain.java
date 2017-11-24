/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.patrick.demo.chainOfresp.day3;

import java.util.Random;
import org.apache.commons.lang.math.RandomUtils;

/**
 *
 * @author patrickn
 */
public class ATMDispacherChain {
    private DispenserChain c1;
    
    public ATMDispacherChain(){
        this.c1 = new Dollar100Dispenser();
        DispenserChain c3 = new Dollar50Dispenser();
         DispenserChain c5 = new Dollar10Dispenser();
        DispenserChain c6 = new Dollar5Dispenser();
        DispenserChain c7 = new Dollar1Dispenser();

        c1.setNextDispense(c3);
        c3.setNextDispense(c5);
        c5.setNextDispense(c6);
        c6.setNextDispense(c7);
        
    }
    
    public static void main(String[] args) {
        ATMDispacherChain atmDispenser = new ATMDispacherChain();
        
        for (int i = 0; i < 10; i++) {
            System.out.println("\n###\n");
             int random = RandomUtils.nextInt(5000);
            System.out.println("random : "+random);
           
            atmDispenser.c1.dispense(new Currency(random));
            System.out.println("\n###\n");
        }
        
        
        
    }
}
