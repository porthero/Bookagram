package com.example.bookagram.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "lent_subject")
@Getter
public class LentSubject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //ATTRIBUTES

    @Column(name = "name")
    @Setter
    //@NotEmpty
    private String name;

    @Column(name = "lent_date")
    @Setter
    private LocalDate lentDate;
}
