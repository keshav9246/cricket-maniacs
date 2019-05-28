package com.cricket.wc2019.Controllers;

import com.cricket.wc2019.Models.Player;
import com.cricket.wc2019.Services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class PlayersController {



    @Autowired
    private PlayerService pService;

    @RequestMapping(value = "/team")
    public ModelAndView getTeam(@RequestParam("teamname") String teamname)
    {
        List<Player> team = pService.fetchTeam(teamname);
        System.out.println(team.get(0).getPlayername());
        ModelAndView model = new ModelAndView("selectSquad", "team", team);
        model.addObject("team", team);
        return model;

    }


}
