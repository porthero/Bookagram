package com.example.bookagram.mapper;

import com.example.bookagram.domain.Category;
import com.example.bookagram.model.CategoryModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryMapper {
    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    CategoryModel categoryToCategoryModel(Category category);
    Category categoryModelToCategory(CategoryModel categoryModel);
}
