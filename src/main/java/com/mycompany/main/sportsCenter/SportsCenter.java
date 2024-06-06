
package com.mycompany.main.sportsCenter;

import com.mycompany.main.sportsCenter.people.TypePerson;
import java.util.ArrayList;


public class SportsCenter {
    
    private String name;
    private String location;
    private String schedule;
    private ArrayList<Scenary> scenaries = new ArrayList<>(); //Lista de escenarios

    public SportsCenter(String name, String location, String schedule) {
        this.name = name;
        this.location = location;
        this.schedule = schedule;
    }
    
    public void addSceneray(Scenary scenary) {
        this.scenaries.add(scenary);
    }
    
    
    public void reservScenary(TypePerson type, Scenary scenary) throws Exception {
        if(type == TypePerson.COACH || type == TypePerson.SPORTMAN){
            int index = this.scenaries.indexOf(scenary);
            if(index != -1){
                Scenary sc = this.scenaries.get(index);
                System.out.println("Escenario reservado");
                if(sc.isAvailable()){
                    sc.setAvailable(false);
                }
                else{
                    throw new Exception(("Ya está reservado"));
                }
            }
            else{
                throw new Exception("error");
            }
        }
    }

}
