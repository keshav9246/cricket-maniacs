package com.cricket.wc2019.Repositories;

import com.cricket.wc2019.Models.Player;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayersRepository extends CrudRepository<Player, String> {

    @Query("Select p from Player p WHERE p.teamname = ?1")
    public List<Player> fetchTeam(String teamName);
}
