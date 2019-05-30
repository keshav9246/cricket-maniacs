package com.cricket.wc2019.Controllers;

import com.cricket.wc2019.Models.Scores;
import com.cricket.wc2019.Services.ManiacService;
import com.cricket.wc2019.Services.PlayerService;
import com.cricket.wc2019.Services.ScoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ScoresController {

    @Autowired
    ScoresService service;

    @Autowired
    PlayerService pService;

    @Autowired
    ManiacService mService;

    @Autowired
    Scores score;


    @PostMapping("/scoreUpdate")
    public ModelAndView updateScores(@RequestParam("runs") int runs, @RequestParam("balls") int balls, @RequestParam("isNotOut") boolean isNotOut, @RequestParam("wickets") int wickets, @RequestParam("economy") float economy, @RequestParam("catches") int catches,
                                     @RequestParam("playerrole") String role, @RequestParam("directhits") int directHits, @RequestParam("playername") String playername, @RequestParam("captain") boolean isCaptain)
    {
        int totalMatchScore = 0;


        System.out.println (playername);







                score= service.updateScores(runs, balls, isNotOut, wickets, economy, catches, role, directHits,playername, isCaptain);


                pService.addPlayerScore(score.getTotal_match_score(), playername);
//                score.getBalls();
//                score.getRuns();
//                score.getCatches();
//                score.getEconomy();
//                score.getDirect_hit();
//                score.isIs_notout();
//                score.getPlayer_name();
//                score.getTotal_match_score();
//                score.getBatting_points();
//                score.getBowling_points();
//                score.getFielding_points();
//                score.getStrike_rate();
//                score.getWickets();

        ModelAndView mv = new ModelAndView("admin", "score", score);
            return mv;




    }

}
