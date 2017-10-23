/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.patrick.demo.composite.day1;

import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author patrickn
 */
public class Composite extends Component{
    
    
	private  Vector foglie;

	public Composite() {
		foglie = new Vector();
	}

    

	public void add(Component c) {
		foglie.add(c);
	}

	public void remove(Component c) {
		foglie.remove(c);
	}

	public void stampaInfo() {
		Enumeration enumeration = foglie.elements();
		Component c;
		for (; enumeration.hasMoreElements();) {
			c = (Component) enumeration.nextElement();
			c.stampaInfo();
		}
	}
    
}
