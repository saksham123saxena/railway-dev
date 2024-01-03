package com.jwtauthentication.services;

import com.jwtauthentication.entities.User;
import com.jwtauthentication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserServices {


    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    private List<User> store=new ArrayList<>();

      public List<User> getUsers(){
          return this.userRepository.findAll();
      }

    // creating user
      public User createUser(User user){
          user.setUserId(UUID.randomUUID().toString());
          user.setPassword(passwordEncoder.encode(user.getPassword()));
          return this.userRepository.save(user);
      }
}
