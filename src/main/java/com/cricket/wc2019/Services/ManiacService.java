package com.cricket.wc2019.Services;

import com.cricket.wc2019.Models.Maniac;
import com.cricket.wc2019.Models.Player;
import com.cricket.wc2019.Repositories.ManiacRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.List;

@Service
public class ManiacService {

    @Autowired
    ManiacRepository repoInstance;

    @Autowired
    Maniac team;

    @Autowired
    List<Maniac> friends;
    
    public void submitTeam(List<Player> players, String orange, String purple, String maniac)
    {



        team.setManiac_name(maniac);
        team.setOrange_cap(orange);
        team.setPurple_cap(purple);
        team.setTeam(players);


        repoInstance.save(team);


    }
    
    public List<Maniac> getAllManiacs()
    {
    	
       friends = (List<Maniac>) repoInstance.findAll();
       
      
       return friends;
    }
    
    

    public Maniac getManiacTeam( String ManiacName)
    {
        return repoInstance.findById(ManiacName).orElse(null);
    }
    
    
    public Maniac getManiacScore( String ManiacName)
    {
        team = repoInstance.findById(ManiacName).orElse(null);
        return team;
    }


    //update total score for maniac


}
