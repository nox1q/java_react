package com.example.project_java_react.repositories;

import com.example.project_java_react.entities.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepositories extends JpaRepository<Genre, Long> {


}
