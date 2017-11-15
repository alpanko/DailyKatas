/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.patrick.demo.java8;

import java.util.List;
import static java.util.stream.Collectors.toList;

/**
 *
 * @author patrickn
 */
public class ToUpperCase {
    
    public static List<String> transform(List<String> collection) {
        return collection.stream() // Convert collection to Stream
                .map(t ->t.toUpperCase()) // Convert each element to upper case
                .collect(toList()); // Collect results to a new list
    }
    
}
