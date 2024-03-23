package com.example.bookagram.model;

import lombok.Data;

import java.util.List;

@Data
public class BookModel {
    private Long id;
    private String title;
    private String isbn;
    private String publisher;
    private Integer year;
    private Integer pages;
    private boolean isRead;
    private boolean isLent;
    private boolean isFav;
    private boolean isReading;
    private List<Long> authorIds;
    private List<Long> categoryIds;

    // Getters and Setters
}
