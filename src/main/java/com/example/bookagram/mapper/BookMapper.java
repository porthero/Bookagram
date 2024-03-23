package com.example.bookagram.mapper;

import com.example.bookagram.domain.Book;
import com.example.bookagram.model.BookModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface BookMapper {
    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    BookModel bookToBookModel(Book book);
    Book bookModelToBook(BookModel bookModel);
}
