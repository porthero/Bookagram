package com.example.bookagram.repository;

import com.example.bookagram.model.Category;
import com.example.bookagram.model.LentSubject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository <Category, Integer> {
}
