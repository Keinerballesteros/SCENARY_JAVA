
package com.mycompany.main.sportsCenter.people;

import com.mycompany.main.sportsCenter.Sport;


public class Person {
  
    private String name;
    private String lastname;
    private int age;
    private String id;
    private TypePerson type;

    public Person(String name, String lastname, int age, String id, TypePerson type) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.id = id;
        this.type = type;
    }

    public TypePerson getType() {
        return type;
    }
    
    
}
