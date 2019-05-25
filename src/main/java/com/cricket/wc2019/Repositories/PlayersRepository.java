package com.cricket.wc2019.Repositories;

import com.cricket.wc2019.Models.Player;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface PlayersRepository extends CrudRepository<Player, String> {

    @Query("Select p from Player p WHERE p.teamname = ?1")
    public List<Player> fetchTeam(String teamName);

    @Modifying @Transactional
   @Query(value = "Update Player p  set p.playerScore = p.playerScore + ?1 where p.playerName = ?2", nativeQuery = true)
   public void savePlayerScore(int score, String playerName);

}
