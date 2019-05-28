package com.cricket.wc2019.Controllers;

import com.cricket.wc2019.Models.Maniac;
import com.cricket.wc2019.Models.Player;
import com.cricket.wc2019.Services.ManiacService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ManiacController {

    @Autowired
    ManiacService service;

    @Autowired
    Maniac maniac;
    
    @Autowired
    List<Maniac> friends;

    @PostMapping("/submitTeam")
    public void saveTeam(@RequestParam("maniacName") String maniacName, @RequestParam ("team") List<Player> team, @RequestHeader String orange, @RequestHeader String purple)
    {

        service.submitTeam(team,orange,purple,maniacName);

    }

    @RequestMapping("/maniacTeam")
    public Maniac getManiacTeam(@RequestHeader String maniacName)
    {
        return service.getManiacTeam(maniacName);
    }
    
    
    @RequestMapping("/maniacScore")
    public ModelAndView getManiacScore(@RequestParam String maniacName)
    {
        maniac =  service.getManiacScore(maniacName);
       
        friends = service.getAllManiacs();
        
        ModelAndView model = new ModelAndView("welcome", "maniac", maniac);
        model.addObject("friends", friends);
        return model;
    }
    
   
}
