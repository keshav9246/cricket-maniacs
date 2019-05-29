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

  //  @Query("Select p from Players p WHERE p.teamName = ?1")
    public List<Player> findByTeamname(String teamname);

   @Modifying 
   @Transactional
   @Query(value = "Update Players p  set p.playerscore = p.playerscore + ?1 where p.playername = ?2", nativeQuery = true)
   public void savePlayerScore(int score, String playername);

}
