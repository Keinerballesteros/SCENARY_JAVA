
package com.mycompany.main.sportsCenter;

import com.mycompany.main.sportsCenter.people.TypePerson;


public class Scenary {
    
    private String name;
    private Sport sport;
    private int size;
    private boolean available = true;

    public Scenary(String name, Sport sport, int size) {
        this.name = name;
        this.sport = sport;
        this.size = size;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
 
    }
    
    
    
}
