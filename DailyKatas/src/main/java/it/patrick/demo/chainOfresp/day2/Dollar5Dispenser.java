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
public class Dollar5Dispenser implements DispenseChain{

    private DispenseChain chain;
    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency cur) {
       if(cur.getAmount()>=5){
           int num = cur.getAmount()/5;
           int remainder = cur.getAmount()%5;
           System.out.println("Dispensinf "+num+" 5$ note");
           if(remainder !=0)
               this.chain.dispense(new Currency(remainder));
       }else{
           this.chain.dispense(cur);
       }
    }
    
}
