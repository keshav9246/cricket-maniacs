package com.cricket.wc2019.Repositories;

import com.cricket.wc2019.Models.Maniac;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.naming.Name;
import javax.transaction.Transactional;


@Repository
public interface ManiacRepository extends CrudRepository<Maniac, String> {



}
