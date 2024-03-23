package com.example.bookagram.repository;

import com.example.bookagram.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository <Author, Long> {
}
