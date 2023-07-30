package com.example.bookagram.service;

import com.example.bookagram.model.Book;
import com.example.bookagram.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public Book create(Book book){
        return bookRepository.save(book);
    }

    public Book update(Book book){
        return bookRepository.save(book);
    }

    public void deleteById(Long id){
        bookRepository.deleteById(id);
    }

    public Book getById(Long id){
        return bookRepository.getById(id);
    }
}
