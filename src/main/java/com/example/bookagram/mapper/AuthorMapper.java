package com.example.bookagram.mapper;

import com.example.bookagram.domain.Author;
import com.example.bookagram.model.AuthorModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AuthorMapper {
    AuthorMapper INSTANCE = Mappers.getMapper(AuthorMapper.class);

    AuthorModel authorToAuthorModel(Author author);
    Author authorModelToAuthor(AuthorModel authorModel);
}
