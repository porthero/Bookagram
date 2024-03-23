package com.example.bookagram.service;

import com.example.bookagram.model.BookModel;
import java.util.List;

public interface BookService {
    BookModel create(BookModel bookModel);
    BookModel update(BookModel bookModel);
    void deleteById(Long id);
    BookModel getById(Long id);
    List<BookModel> getAllBooks();
}
