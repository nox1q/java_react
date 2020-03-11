package com.example.project_java_react.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "t_books")
public class Book extends BaseEntity{
    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private int price;

    @Column(name = "author")
    private String author;

    @Column(name = "date")
    private Date date;

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Genre> genre;
}