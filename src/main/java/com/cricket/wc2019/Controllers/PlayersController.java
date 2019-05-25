package com.cricket.wc2019.Controllers;

import com.cricket.wc2019.Models.Player;
import com.cricket.wc2019.Services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlayersController {



    @Autowired
    private PlayerService service;

    @RequestMapping(value = "/team", method = RequestMethod.POST)
    public List<Player> getTeam(@RequestHeader String teamName)
    {
        List<Player> team = service.fetchTeam(teamName);
        return team;

    }


}
