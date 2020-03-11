package com.example.project_java_react.services;

import com.example.project_java_react.entities.Users;
import com.example.project_java_react.repositories.UserRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    UserRepositories userRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        Users user = userRepository.findByEmail(s);
        User secUser = new User(user.getEmail(), user.getPassword(), user.getRoles());

        return secUser;

    }
}