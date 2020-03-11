package com.example.project_java_react.repositories;

import com.example.project_java_react.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositories extends JpaRepository<Users, Long> {

    Users findByEmail(String name);

}
