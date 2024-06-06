
package com.mycompany.main.sportsCenter.people.sportsman;

import com.mycompany.main.sportsCenter.Sport;
import com.mycompany.main.sportsCenter.people.Person;
import com.mycompany.main.sportsCenter.people.TypePerson;


public class SportsMan extends Person implements Doping, Feeding{
    
    private Sport sport;
    
    public SportsMan(String name, String lastname, int age, String id, Sport sport) {
        super(name, lastname, age, id, TypePerson.SPORTMAN);
        
        this.sport = sport;
    }

    @Override
    public void doTest() {
        System.out.println("Hacer prueba de sangre");
    }

    @Override
    public void diet() {
        if(this.sport == Sport.FOOTBALL){
            System.out.println("Haciendo dieta futbolera");
        }
        else if(this.sport == Sport.BASKETBALL){
            System.out.println("Haciendo dieta de baloncesto");
        }
        else if(this.sport == Sport.TENNIS){
            System.out.println("Haciendo dieta futbolera");
        }
    }
    
    
    
}
