package com.cricket.wc2019.Services;

import com.cricket.wc2019.Models.Player;
import com.cricket.wc2019.Repositories.PlayersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerService{

    @Autowired
    private PlayersRepository repo;



    public List<Player> fetchTeam(String country){

        List<Player> team = new ArrayList<>();
        team = repo.findByTeamname(country);
        return team;
    }


    public void addPlayerScore(int score, String playername)
    {
    	System.out.println("Inside servie> about to update player" +playername);
        repo.savePlayerScore(score, playername);
    }


}

