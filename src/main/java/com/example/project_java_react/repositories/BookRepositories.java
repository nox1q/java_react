package com.example.project_java_react.repositories;

import com.example.project_java_react.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface BookRepositories extends JpaRepository<Book, Long> {

    List<Book> findAllByDeletedAtNull(Pageable pageable);
    Optional<Book> findByIdAndDeletedAtNull(Long id);
    int countAllByDeletedAtNull();
    Optional<Book> find(Long id);
}
