package com.example.bookagram.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "author")
@Getter
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //ATTRIBUTES

    @Column
    @Setter
    private String name;

    @Column
    @Setter
    private Date birthDate;

    @Column
    @Setter
    private LocalDate deathDate;

    @Column
    @Setter
    private String nationality;
}
