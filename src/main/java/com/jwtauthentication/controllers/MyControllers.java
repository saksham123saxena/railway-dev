package com.jwtauthentication.controllers;

import com.jwtauthentication.entities.User;
import com.jwtauthentication.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class MyControllers {

    @Autowired
    private UserServices userServices;

//    @GetMapping("/testing")
//    public List<User> testing(){
//       return this.userServices.getUser();
//    }

    @GetMapping("/users")
    public List<User> getUsers(){
        return userServices.getUsers();
    }

    @GetMapping("/get-name")
    public String getLoggedId(Principal principal){
        return principal.getName();
    }
}
