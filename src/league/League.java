/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package league;
import java.util.*;
import java.util.Date;


/**
 *
 * @author Estudiante
 */
public class League {
public Date start;
public Date end;
public ArrayList<Tournament> tournament;
public ArrayList<Player> players;

    public League(Date start, Date end) {
        this.start = start;
        this.end = end;
        this.tournament = new ArrayList<>();
        this.players = new ArrayList<>();
        
    }


}
