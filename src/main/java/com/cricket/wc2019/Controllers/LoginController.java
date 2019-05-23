package com.cricket.wc2019.Controllers;

import com.cricket.wc2019.Models.Users;
import com.cricket.wc2019.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
public class LoginController {

    @Autowired
   private Users user;

    @Autowired
   private UserService service;

    @RequestMapping(value = "/authenticate", method = RequestMethod.POST)
    public boolean authenticateUser(@RequestHeader String userid, @RequestHeader String password)
    {
        user = service.getUser(userid);

        if(user.getPassword().equals(password))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    @RequestMapping("/users")
    public List<Users> getAllUsers()
    {
        List<Users> users = service.getUsers();
        return users;
    }




}
