package com.example.bookagram.mapper;

import com.example.bookagram.domain.LentSubject;
import com.example.bookagram.model.LentSubjectModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface LentSubjectMapper {
    LentSubjectMapper INSTANCE = Mappers.getMapper(LentSubjectMapper.class);

    LentSubjectModel lentSubjectToLentSubjectModel(LentSubject lentSubject);
    LentSubject lentSubjectModelToLentSubject(LentSubjectModel lentSubjectModel);
}
