package com.cricket.wc2019.Controllers;

import com.cricket.wc2019.Models.Maniac;
import com.cricket.wc2019.Models.Player;
import com.cricket.wc2019.Services.ManiacService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ManiacController {

    @Autowired
    ManiacService service;

    @Autowired
    Maniac maniac;

    @PostMapping("/submitTeam")
    public void saveTeam(@RequestHeader String maniacName, @RequestBody List<Player> team, @RequestHeader String orange, @RequestHeader String purple)
    {

        service.submitTeam(team,orange,purple,maniacName);

    }

    @RequestMapping("/maniacTeam")
    public Maniac getManiacTeam(@RequestHeader String maniacName)
    {
        return service.getManiacTeam(maniacName);
    }
}
