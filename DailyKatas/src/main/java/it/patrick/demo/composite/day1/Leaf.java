/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.patrick.demo.composite.day1;

/**
 *
 * @author patrickn
 */
public class Leaf extends Component {

    private final String info;

    public Leaf(String info) {
        this.info = info;
    }

    @Override
    public void add(Component c) throws Exception {
        throw new Exception("Impossibile aggiungere componenti ad una foglia");
    }

    @Override
    public void remove(Component c) throws Exception {
        throw new Exception("Impossibile rimuovere componenti da una foglia");
    }

    @Override
    public void stampaInfo() {
        System.out.println("Informazione :" + info);
    }
}
