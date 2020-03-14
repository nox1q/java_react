package com.example.project_java_react.repositories;

import com.example.project_java_react.entities.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BookRepositories extends JpaRepository<Book, Long> {



    Optional<Book> findById(Long id);

    List<Book> findAll();
}
