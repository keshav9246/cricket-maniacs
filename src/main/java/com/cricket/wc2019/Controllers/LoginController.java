package com.cricket.wc2019.Controllers;

import com.cricket.wc2019.Models.Maniac;
import com.cricket.wc2019.Models.Users;
import com.cricket.wc2019.Services.ManiacService;
import com.cricket.wc2019.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class LoginController {

    @Autowired
   private Users user;

    @Autowired
   private UserService service;
    
    @Autowired
    private ManiacService mService;
    
    @Autowired
    private Maniac maniac;
    
    @Autowired
    List<Maniac> friends;
    
    

    @PostMapping(value = "/authenticate")
    public ModelAndView authenticateUser( @RequestParam("userid") String userid, @RequestParam("password") String password)
    {
    	
        user = service.getUser(userid);
        
        maniac = mService.getManiacScore(user.getName());
        
        friends = mService.getAllManiacs();
        
      

        if(user.getPassword().equals(password))
        {
            if(user.isAdmin() == true)
            {
            	 ModelAndView model = new ModelAndView("admin", "user", user);
                 
 	            model.addObject("maniac", maniac);
 	            model.addObject("friends", friends);
 	            return model;
            }
            else
            {
            ModelAndView model = new ModelAndView("welcome", "user", user);
           
	            model.addObject("maniac", maniac);
	            model.addObject("friends", friends);
	            return model;
            }
        }
        else
        {
        	  ModelAndView model = new ModelAndView("test", "user", user);
              return model;
            
        }
        
        
    }

    @RequestMapping("/users")
    public String getAllUsers(Model model)
    {
        List<Users> users = service.getUsers();
        model.addAttribute("users", users);
        return "test";
    }


    @RequestMapping("/addManiac")
    public void addUser(@RequestParam String userID,@RequestParam String name,@RequestParam String pwd,@RequestParam boolean isAdmin)
    {
        service.addManiac(userID, name, pwd, isAdmin);
    }

    @GetMapping("/welome")
    public String welcome()
    {
        return "index";
    }




}
