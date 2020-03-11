package com.example.project_java_react.controllers;


import com.example.project_java_react.entities.Users;
import com.example.project_java_react.entities.Book;
import com.example.project_java_react.entities.Genre;
import com.example.project_java_react.entities.Users;
import com.example.project_java_react.entities.BaseEntity;
import com.example.project_java_react.entities.Order;

import com.example.project_java_react.repositories.BookRepositories;
import com.example.project_java_react.repositories.GenreRepositories;
import com.example.project_java_react.repositories.UserRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
public class MainController {
    @Autowired
    private GenreRepositories genreRepositories;
    @Autowired
    private BookRepositories bookRepositories;
    @Autowired
    private UserRepositories userRepositories;

    @GetMapping("/{id}")
    public Book read(@PathVariable Long id){
        return bookRepositories.findById(id).get();
    }

    @GetMapping(value = "/")
    public String index(ModelMap model, @RequestParam(name = "page", defaultValue = "1") int page){
        List <Genre> genres = genreRepositories.findAll();
        return "index";
    }


    @GetMapping(value = "/registration")
    public String registration(ModelMap model){
        return "registration";
    }

    @PostMapping(value ="/registration")
    Users registration(@RequestBody Users user){
        return userRepositories.save(user);
    }
    /*
    public Users getUserData(){

        Users userData = null;
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if(!(authentication instanceof AnonymousAuthenticationToken)){
            User secUser = (User)authentication.getPrincipal();
            userData = userRepository.findByEmail(secUser.getUsername());
        }
        return userData;
    }*/

}