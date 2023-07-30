package com.example.bookagram.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
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
    @NotEmpty
    @Setter
    private String title;

    @Column(name = "ISBN")
    @Setter
    /*@Pattern(regexp = "^(?:ISBN(?:-10)?:?●)?(?=[0-9X]{10}$|(?=(?:[0-9]+[-●]){3})[-●0-9X]{13}$)↵\n" +
            "[0-9]{1,5}[-●]?[0-9]+[-●]?[0-9]+[-●]?[0-9X]$")*/
    private String isbn;

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

    @ManyToMany
    @Setter
    private List<Author> authors;

    @ManyToMany
    @Setter
    private List<LentSubject> lentSubjects;

    @ManyToMany
    @Setter
    private List<Category> categories;
}
