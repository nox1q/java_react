package com.example.project_java_react.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "t_items")
public class Order extends BaseEntity{

    @Column(name = "book_id")
    private Book book_id;

    @Column(name = "user_id")
    private Users user_id;

    @Column(name = "status_id")
    private int status_id;

}