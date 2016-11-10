/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package league;
import java.util.Calendar;
import java.util.Date;
import java.util.*;

/**
 *
 * @author Estudiante
 */
public class Tournament {
    public Date Start;
    public Date end;
    public ArrayList<Player> players;

    public Tournament(Date Start, Date end) {
        this.Start = Start;
        this.end = end;
        this.players = new ArrayList<>();
        
    }
    
}
