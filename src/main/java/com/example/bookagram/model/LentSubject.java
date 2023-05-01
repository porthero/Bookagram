package com.example.bookagram.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "LentSubject")
@Getter
public class LentSubject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //ATTRIBUTES

    @Column(name = "Name")
    @Setter
    //@NotEmpty
    private String name;

    @Column(name = "Lent_Date")
    @Setter
    private Date lentDate;

    //RELATIONSHIPS

    @ManyToMany
    @Setter
    private List<Book> books;
}
