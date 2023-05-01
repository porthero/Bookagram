package com.example.bookagram.repository;

import com.example.bookagram.model.Author;
import com.example.bookagram.model.LentSubject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository <Author, Long> {
}
