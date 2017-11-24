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
public class Dollar20Dispenser implements DispenserChain{
    
    private DispenserChain chain;

    @Override
    public void setNextDispense(DispenserChain chain) {
        this.chain = chain;
    }

    @Override
    public void dispense(Currency currency) {
       int val = currency.getAmount();
       if(val>=20){
            int num = val/20;
            int rest = val%20;
            
            System.out.println("Dispensing "+num+" number of 20 ");
            if(rest>0){
                System.out.println("Asking to next dispatcher to dispatch :"+rest);
                this.chain.dispense(new Currency(rest));
            }
           
       }else{
            System.out.println("Amount < of 20 send to next dispatcher ");
            this.chain.dispense(currency);
       }
       
    }
    
}
