package com.example.bookagram.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "Author")
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
    private Date deathDate;

    @Column
    @Setter
    private String nationality;

    //RELATIONSHIPS

    @ManyToMany
    @Setter
    private List <Book> books;
}
