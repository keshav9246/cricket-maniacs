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

@Controller
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
        
        ModelAndView model = null;
      

        if(user.getPassword().equals(password))
        {
            if(user.isAdmin() == true)
            {
            	  model = new ModelAndView("admin", "user", user);
                 
 	            model.addObject("maniac", maniac);
 	            model.addObject("friends", friends);
 	           
            }
            else
            {
             model = new ModelAndView("welcome", "user", user);
           
	            model.addObject("maniac", maniac);
	            model.addObject("friends", friends);
	           
            }
        }
//        }
//        else
//        {
//        	  ModelAndView model = new ModelAndView("test", "user", user);
//              return model;
//            
//        }
		return model;
        
        
    }

//    @RequestMapping("/users")
//    public String getAllUsers(Model model)
//    {
//        List<Users> users = service.getUsers();
//        model.addAttribute("users", users);
//        return "test";
//    }


    @RequestMapping("/addManiac")
    public String addUser(@RequestParam("userid") String userID,@RequestParam("name") String name,@RequestParam("password") String pwd,@RequestParam("isAdmin") boolean isAdmin)
    {
        service.addManiac(userID, name, pwd, isAdmin);
        return("admin");
        
        
    }

    @GetMapping("/welome")
    public String welcome()
    {
        return "index";
    }




}
