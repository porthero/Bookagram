package com.example.bookagram.controller;

import com.example.bookagram.model.BookModel;
import com.example.bookagram.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/create")
    public BookModel createBook(@RequestBody BookModel bookModel) {
        return bookService.create(bookModel);
    }

    @PostMapping("/update")
    public BookModel updateBook(@RequestBody BookModel bookModel) {
        return bookService.update(bookModel);
    }

    @GetMapping("/{id}")
    public BookModel getBookById(@PathVariable Long id) {
        return bookService.getById(id);
    }

    @GetMapping("/getAll")
    public List<BookModel> getAllBooks() {
        return bookService.getAllBooks();
    }
}
