package com.example.project_java_react.repositories;

import com.example.project_java_react.entities.Roles;
import com.example.project_java_react.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepositories extends JpaRepository<Roles, Long> {

    Optional<Roles> findById(Long Id);

}
