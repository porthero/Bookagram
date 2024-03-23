package com.example.bookagram.repository;

import com.example.bookagram.domain.LentSubject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LentSubjectRepository extends JpaRepository <LentSubject, Integer> {
}
