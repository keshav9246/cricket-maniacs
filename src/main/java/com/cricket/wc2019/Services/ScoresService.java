package com.cricket.wc2019.Services;

import com.cricket.wc2019.Models.Scores;
import com.cricket.wc2019.Repositories.ScoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScoresService {

    @Autowired
    private Scores individualScore;

    @Autowired
    private ScoresRepository repo;

    public Scores updateScores(int runs, int balls, boolean isNotOut, int wickets, float economy, int catches, String role, int directHits, String playerName, boolean isCaptain)
    {
        int batting_bonus = 0;
        int bowling_bonus = 0;
        int totalBattingPoints = 0;
        int wicketPoints = 0;
        int catchPoints = 0;
        int directHitPoints = 0;
        float strikeRate = (runs*100)/balls;
        int totalBowlingPoints = 0;
        int totalFieldingPoints = 0;
        int totalMatchScore = 0;

        individualScore.setPlayer_name(playerName);
        individualScore.setRuns(runs);
        individualScore.setBalls(balls);
        individualScore.setStrike_rate(strikeRate);
        individualScore.setIs_notout(isNotOut);

        // -15 if batsman get out on 0
        if(runs == 0 && isNotOut == false)
        {
            batting_bonus -= 15;
        }

       
            // +25 for not outs
            if (isNotOut == true) {
                batting_bonus += 25;
            }

            // +5 for 50 each and +25 for SR > 125
            if (runs >= 50 && runs <100) {
                batting_bonus += 5;
            }
            else if(runs >= 100 && runs <150) {
                batting_bonus += 10;
            }
            else if(runs >= 150 && runs <200) {
                batting_bonus += 20;
            }
            else if(runs >= 200 && runs <250) {
                batting_bonus += 30;
            }
            else if(runs > 250) {
                batting_bonus += 50;
            }
        
            if (strikeRate >= 125 && runs >= 45) {
                batting_bonus += 15;
            }

        totalBattingPoints = runs + batting_bonus;

        individualScore.setBatting_points(totalBattingPoints);

        //bowling
        individualScore.setWickets(wickets);
        individualScore.setEconomy(economy);

        if (economy == 0)
        {
            bowling_bonus += 0;
        }
        else if (economy <= 4.0)
        {
            bowling_bonus += 20;
        }
        else if(economy > 9.0)
        {
            bowling_bonus -= 25;
        }
        else if(economy > 8.0)
        {
            bowling_bonus -= 15;
        }
        else if(economy > 7.0)
        {
            bowling_bonus -= 10;
        }

        if(wickets > 0)
        {
            wicketPoints += wickets * 25;
        }


        totalBowlingPoints = wicketPoints + bowling_bonus;
        individualScore.setBowling_points(totalBowlingPoints);
        individualScore.setCatches(catches);
        individualScore.setDirect_hit(directHits);

        if(role.contentEquals("Wicketkeeper"))
        {
            catchPoints = catches * 7;
        }
        else
        {
            catchPoints = catches * 10;
        }

        directHitPoints = directHits * 25;

        totalFieldingPoints = catchPoints + directHitPoints;
        individualScore.setFielding_points(totalFieldingPoints);
        
        totalMatchScore = totalBattingPoints + totalBowlingPoints + totalFieldingPoints;
        
        if(isCaptain == true)
        {
            System.out.println("inside gvhgvhgv");
        	totalMatchScore *= 1.5;
        }
        
        individualScore.setTotal_match_score(totalMatchScore);


        repo.save(individualScore);

        System.out.print(individualScore.getTotal_match_score());
        return individualScore;

    }
    
    
}
