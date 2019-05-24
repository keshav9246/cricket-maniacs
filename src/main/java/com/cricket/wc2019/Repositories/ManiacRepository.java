package com.cricket.wc2019.Repositories;

import com.cricket.wc2019.Models.Maniac;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.naming.Name;


@Repository
public interface ManiacRepository extends CrudRepository<Maniac, String> {


}
