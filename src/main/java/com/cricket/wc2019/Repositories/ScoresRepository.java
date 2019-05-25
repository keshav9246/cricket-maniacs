package com.cricket.wc2019.Repositories;


import com.cricket.wc2019.Models.Scores;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoresRepository extends CrudRepository<Scores,String> {




}
