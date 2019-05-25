package com.cricket.wc2019.Controllers;

import com.cricket.wc2019.Services.ManiacService;
import com.cricket.wc2019.Services.PlayerService;
import com.cricket.wc2019.Services.ScoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScoresController {

    @Autowired
    ScoresService service;

    @Autowired
    PlayerService pService;

    @Autowired
    ManiacService mService;


    @PostMapping("/scoreUpdate")
    public void updateScores(@RequestHeader int runs, @RequestHeader int balls,@RequestHeader boolean isNotOut,@RequestHeader int wickets,@RequestHeader float economy,@RequestHeader int catches,
                             @RequestHeader boolean isWK,@RequestHeader int directHits,@RequestHeader String playerName)
    {
        int totalMatchScore = 0;
            totalMatchScore= service.updateScores(runs, balls, isNotOut, wickets, economy, catches, isWK, directHits,playerName);
            pService.addPlayerScore(totalMatchScore, playerName);



    }

}
