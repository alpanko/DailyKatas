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
public class Esempio {
    public static void main(String args[]) {
		Component a = new Leaf("uno");
		Component b = new Leaf("due");
		Component c = new Leaf("tre");
		Component d = new Leaf("quattro");
		Component e = new Composite();
		Component f = new Composite();
		Component g = new Composite();
		try {
			g.add(a);
			g.add(b);
			f.add(g);
			f.add(c);
			e.add(d);
			e.add(f);
			e.stampaInfo();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
    
}
