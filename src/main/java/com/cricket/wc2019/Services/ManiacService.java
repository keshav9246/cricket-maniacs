package com.cricket.wc2019.Services;

import com.cricket.wc2019.Models.Maniac;
import com.cricket.wc2019.Repositories.ManiacRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManiacService {

    @Autowired
    ManiacRepository repoInstance;

    @Autowired
    Maniac team;


    public void submitTeam(List<String> playerName, String orange, String purple, String maniac)
    {

        team.setOpener1(playerName.get(0));
        team.setOpener2(playerName.get(1));
        team.setOpener3(playerName.get(2));
        team.setOpener4(playerName.get(3));
        team.setMiddle_order1(playerName.get(4));
        team.setMiddle_order2(playerName.get(5));
        team.setMiddle_order3(playerName.get(6));
        team.setMiddle_order4(playerName.get(7));
        team.setMiddle_order5(playerName.get(8));
        team.setMiddle_order6(playerName.get(9));
        team.setAllrounder1(playerName.get(10));
        team.setAllrounder2(playerName.get(11));
        team.setFast_bower1(playerName.get(12));
        team.setFast_bower2(playerName.get(13));
        team.setFast_bower3(playerName.get(14));
        team.setFast_bower4(playerName.get(15));
        team.setFast_bower5(playerName.get(16));
        team.setSpinner1(playerName.get(17));
        team.setSpinner2(playerName.get(18));
        team.setSpinner3(playerName.get(19));
        team.setWicketkeeper1(playerName.get(20));
        team.setWicketkeeper2(playerName.get(21));
        team.setManiac_name(maniac);
        team.setOrange_cap(orange);
        team.setPurple_cap(purple);
        team.setTotal_score(0);

        repoInstance.save(team);


    }
}
