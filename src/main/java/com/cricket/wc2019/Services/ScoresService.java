package com.cricket.wc2019.Services;

import com.cricket.wc2019.Models.Scores;
import com.cricket.wc2019.Repositories.ScoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScoresService {

    @Autowired
    Scores individualScore;

    @Autowired
    ScoresRepository repo;

    public int updateScores(int runs, int balls, boolean isNotOut, int wickets, float economy, int catches, boolean isWK, int directHits, String playerName)
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

        else {
            // +25 for not outs
            if (isNotOut == true) {
                batting_bonus += 25;
            }


            // +5 for 50 each and +25 for SR > 125
            if (runs >= 50) {
                batting_bonus += ((runs / 50) * 5);

                if (strikeRate >= 125) {
                    batting_bonus += 15;
                }

            }
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
            bowling_bonus -= 20;
        }
        else if(economy > 8.0)
        {
            bowling_bonus -= 15;
        }
        else if(economy > 7.0)
        {
            bowling_bonus -= 20;
        }

        if(wickets > 0)
        {
            wicketPoints += wickets * 25;
        }


        totalBowlingPoints = wicketPoints + bowling_bonus;
        individualScore.setBowling_points(totalBowlingPoints);
        individualScore.setCatches(catches);
        individualScore.setDirect_hit(directHits);

        if(isWK == true)
        {
            catchPoints = catches * 6;
        }
        else
        {
            catchPoints = catches * 10;
        }

        directHitPoints = directHits * 25;

        totalFieldingPoints = catchPoints + directHitPoints;
        individualScore.setFielding_points(totalFieldingPoints);
        individualScore.setTotal_match_score(totalBattingPoints + totalBowlingPoints + totalFieldingPoints);




        repo.save(individualScore);

        return individualScore.getTotal_match_score();






    }
}
