package com.example.bookagram.service;

import com.example.bookagram.domain.Category;
import com.example.bookagram.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    public Category create(Category category){
        return categoryRepository.save(category);
    }

    public Category update(Category category){
        return categoryRepository.save(category);
    }

    public void deleteById(Integer id){
        categoryRepository.deleteById(id);
    }

    public Category getById(Integer id){
        return categoryRepository.getById(id);
    }
}
