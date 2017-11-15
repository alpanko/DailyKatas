/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.patrick.demo.java8;

/**
 *
 * @author patrickn
 */
public class Person {
    private String name;
    private int age;
    private String nationality;

    public Person(final String nameValue, final int ageValue) {
        name = nameValue;
        age = ageValue;
    }

    public Person(final String nameValue, final int ageValue, final String nationalityValue) {
        name = nameValue;
        age = ageValue;
        nationality = nationalityValue;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getNationality() {
        return nationality;
    }
    
}
