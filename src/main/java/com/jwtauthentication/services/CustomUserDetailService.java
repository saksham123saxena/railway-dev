package com.jwtauthentication.services;

import com.jwtauthentication.entities.User;
import com.jwtauthentication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        // load user from database
       User user =this.userRepository.findByEmail(username)
                .orElseThrow(()-> new RuntimeException("User Not Found!!"));
        System.out.println(user.toString());

        return (UserDetails) user;
    }
}
