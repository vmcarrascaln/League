/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package league;
import java.util.*;
/**
 *
 * @author Estudiante
 */
public class Player {
    public String name;
    public String email;
    //
    public ArrayList<League> leagues;
    

    public Player(String name, String email) {
        this.name = name;
        this.email = email;
        this.leagues = new ArrayList<>();
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<League> getLeagues() {
        return leagues;
    }

    public void setLeagues(ArrayList<League> leagues) {
        this.leagues = leagues;
    }
    
}
