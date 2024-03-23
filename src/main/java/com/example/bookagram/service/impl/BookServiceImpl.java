package com.example.bookagram.service.impl;

import com.example.bookagram.domain.Book;
import com.example.bookagram.mapper.BookMapper;
import com.example.bookagram.model.BookModel;
import com.example.bookagram.repository.BookRepository;
import com.example.bookagram.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository, BookMapper bookMapper) {
        this.bookRepository = bookRepository;
        this.bookMapper = bookMapper;
    }

    @Override
    public BookModel create(BookModel bookModel) {
        Book book = bookMapper.bookModelToBook(bookModel);
        book = bookRepository.save(book);
        return bookMapper.bookToBookModel(book);
    }

    @Override
    public BookModel update(BookModel bookModel) {
        Book book = bookMapper.bookModelToBook(bookModel);
        book = bookRepository.save(book);
        return bookMapper.bookToBookModel(book);
    }

    @Override
    public void deleteById(Long id) {
        bookRepository.deleteById(id);
    }

    @Override
    public BookModel getById(Long id) {
        Book book = bookRepository.findById(id).orElseThrow(() -> new RuntimeException("Book not found"));
        return bookMapper.bookToBookModel(book);
    }

    @Override
    public List<BookModel> getAllBooks() {
        return bookRepository.findAll().stream()
                .map(bookMapper::bookToBookModel)
                .collect(Collectors.toList());
    }
}
