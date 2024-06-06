

package com.mycompany.main;

import com.mycompany.main.sportsCenter.Scenary;
import com.mycompany.main.sportsCenter.Sport;
import com.mycompany.main.sportsCenter.SportsCenter;
import com.mycompany.main.sportsCenter.people.Coach;
import com.mycompany.main.sportsCenter.people.sportsman.SportsMan;


public class Main {

    public static void main(String[] args) {
        
        SportsCenter sportsCenter = new SportsCenter("Megaparque", "Ocaña",  "24/7");
        Scenary scenary = new Scenary("Polideportivo", Sport.TENNIS, 150);
        Scenary scenary1 = new Scenary("cancha", Sport.FOOTBALL, 250);
        
        sportsCenter.addSceneray(scenary);
        sportsCenter.addSceneray(scenary1);
        
       Coach coach = new Coach("Pepa", "Pig", 9, "asd", Sport.FOOTBALL);
       SportsMan sportsMan = new SportsMan("Cristiano", "Ronaldo", 38, "1323", Sport.FOOTBALL);
        
       try{
           sportsCenter.reservScenary(coach.getType(), scenary);
       }catch(Exception ex){
           System.out.println(ex.getMessage());
       }
       sportsMan.doTest();
       sportsMan.diet();
    }
}
