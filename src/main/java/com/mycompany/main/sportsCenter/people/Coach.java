
package com.mycompany.main.sportsCenter.people;

import com.mycompany.main.sportsCenter.Sport;


public class Coach extends Person{
    
    private Sport sport;
    private boolean available = true;
    
    
    
    public Coach(String name, String lastname, int age, String id, Sport sport) {
        super(name, lastname, age, id, TypePerson.COACH);

        this.sport = sport;
    }

    
    
    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    

}
