package com.cricket.wc2019.Repositories;

import com.cricket.wc2019.Models.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<Users, String> {



}
