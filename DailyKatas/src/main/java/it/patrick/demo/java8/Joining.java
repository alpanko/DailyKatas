/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.patrick.demo.java8;

import java.util.List;
import static java.util.stream.Collectors.joining;

/**
 *
 * @author patrickn
 */
public class Joining {
    public static String namesToString(List<Person> people){
        
        return people.stream() // Convert collection to Stream
                .map(Person::getName) // Map Person to name
                .collect(joining(", ", "Names: ", ".")); // Join names
    }
    
}
