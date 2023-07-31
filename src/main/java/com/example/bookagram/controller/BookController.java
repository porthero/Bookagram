package com.example.bookagram.controller;

import com.example.bookagram.model.Book;
import com.example.bookagram.repository.BookRepository;
import com.example.bookagram.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @Autowired
    private BookRepository bookRepository;

    @PostMapping("/create")
    public Book createBook (@RequestBody Book book) {
        return bookService.create(book);
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id) {
    return  bookService.getById(id);
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

}
