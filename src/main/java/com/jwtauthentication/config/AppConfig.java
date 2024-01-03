package com.jwtauthentication.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class AppConfig {


    // it is the part of spring security
//    @Bean
//    public UserDetailsService  userDetailsService(){
//        UserDetails userDetails= User.builder()
//                .username("sakshama")
//                .password(passwordEncoder().encode("sakshama"))
//                .roles("ADMIN")
//                .build();
//        UserDetails userDetails1= User.builder()
//                .username("saksham1")
//                .password(passwordEncoder().encode("saksham1"))
//                .roles("ADMIN")
//                .build();
//        return new InMemoryUserDetailsManager(userDetails,userDetails1);
//    }
    // it is the part of spring security
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    // it is the part of spring jwt authentication
    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration builder) throws Exception{
        return builder.getAuthenticationManager();
    }


}
