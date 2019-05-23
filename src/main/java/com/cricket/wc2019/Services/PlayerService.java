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
    private PlayersRepository repoInstance;



    public List<Player> fetchTeam(String teamName){

        List<Player> team = new ArrayList<>();
        team = repoInstance.fetchTeam(teamName);
        return team;
    }


}

