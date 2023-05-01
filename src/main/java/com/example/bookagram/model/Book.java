package com.example.bookagram.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "Book")
@Getter
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //ATTRIBUTES
    @Column(name = "Title")
    @Setter
    private String title;

    @Column(name = "ISBN")
    @Setter
    private String ISBN;

    @Column(name = "Publisher")
    @Setter
    private String publisher;

    @Column(name = "Year")
    @Setter
    private Integer year;

    @Column(name = "Pages")
    @Setter
    private Integer pages;

    @Column(name = "IsRead")
    @Setter
    private boolean isRead;

    @Column(name = "IsLent")
    @Setter
    private boolean isLent;

    @Column(name = "IsFav")
    @Setter
    private boolean isFav;

    @Column(name = "IsReading")
    @Setter
    private boolean isReading;
}
