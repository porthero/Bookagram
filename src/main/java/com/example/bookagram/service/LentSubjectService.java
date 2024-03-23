package com.example.bookagram.service;

import com.example.bookagram.domain.LentSubject;
import com.example.bookagram.repository.LentSubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LentSubjectService {

    @Autowired
    LentSubjectRepository lentSubjectRepository;

    public LentSubject create(LentSubject lentSubject) {
        return lentSubjectRepository.save(lentSubject);
    }

    public LentSubject update(LentSubject lentSubject) {
        return lentSubjectRepository.save(lentSubject);
    }

    public void delete(LentSubject lentSubject) {
        lentSubjectRepository.delete(lentSubject);
    }

    public LentSubject getById(Integer id) {
        return lentSubjectRepository.getById(id);
    }
}
