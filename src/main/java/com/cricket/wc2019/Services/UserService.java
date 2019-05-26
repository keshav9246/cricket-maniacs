package com.cricket.wc2019.Services;

import com.cricket.wc2019.Models.Users;
import com.cricket.wc2019.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;


@Service
public class UserService {

    @Autowired
    private UserRepository userInstance;

    @Autowired
    Users user;

    public Users getUser(String username)
    {
        return userInstance.findById(username).orElse(null);
    }

    public List<Users> getUsers()
    {
        List<Users> users = new ArrayList<>();
        userInstance.findAll().forEach(users::add);
        return users;
    }



    public  Iterable<Users> getData()
    {
        return userInstance.findAll();
    }

    public void addManiac(String userID, String name, String pwd, boolean isAdmin)
    {
        user.setUserid(userID);
        user.setName(name);
        user.setPassword(pwd);
        user.setAdmin(isAdmin);
        userInstance.save(user);
    }

}


