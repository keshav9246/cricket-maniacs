package com.cricket.wc2019.Controllers;

import com.cricket.wc2019.Services.ManiacService;
import com.cricket.wc2019.Services.PlayerService;
import com.cricket.wc2019.Services.ScoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ScoresController {

    @Autowired
    ScoresService service;

    @Autowired
    PlayerService pService;

    @Autowired
    ManiacService mService;


    @PostMapping("/scoreUpdate")
    public String updateScores(@RequestParam("runs") int runs, @RequestParam("balls") int balls,@RequestParam("isNotOut") boolean isNotOut,@RequestParam("wickets") int wickets,@RequestParam("economy") float economy,@RequestParam("catches") int catches,
                             @RequestParam("playerrole") String role,@RequestParam("directhits") int directHits,@RequestParam("playername") String playername, @RequestParam("captain") boolean isCaptain)
    {
        int totalMatchScore = 0;

        System.out.println (playername);
            totalMatchScore= service.updateScores(runs, balls, isNotOut, wickets, economy, catches, role, directHits,playername, isCaptain);


            pService.addPlayerScore(totalMatchScore, playername);
            
            
            return "admin";




    }

}
