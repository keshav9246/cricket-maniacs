package com.cricket.wc2019.Models;

import org.hibernate.annotations.Formula;
import org.springframework.stereotype.Component;

import javax.persistence.*;

import java.util.Comparator;
import java.util.List;

@Entity
@Component
@Table(name = "maniacs")
public class Maniac {

    @Id
    private String maniac_name;



    private int total_score;
    
    @ManyToMany
    private List<Player> team;
    private String orange_cap;
    private String purple_cap;


    //can be deleted


    public List<Player> getTeam() {
        return team;
    }

    public void setTeam(List<Player> team) {
        this.team = team;
    }

    public String getManiac_name() {
        return maniac_name;
    }

    public void setManiac_name(String maniac_name) {
        this.maniac_name = maniac_name;
    }

    public int getTotal_score() {
        return total_score;
    }

    public void setTotal_score(int total_score) {
        this.total_score = total_score;
    }

    public String getOrange_cap() {
        return orange_cap;
    }

    public void setOrange_cap(String orange_cap) {
        this.orange_cap = orange_cap;
    }

    public String getPurple_cap() {
        return purple_cap;
    }

    public void setPurple_cap(String purple_cap) {
        this.purple_cap = purple_cap;
    }



    @PostLoad
    public void calculateTotalScore()
    {


        for (Player p: this.team) {

            this.total_score += p.getPlayerscore();

        System.out.println ("Calculated");


        }


    }
    
}
