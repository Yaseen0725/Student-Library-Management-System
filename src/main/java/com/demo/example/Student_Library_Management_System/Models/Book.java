package com.demo.example.Student_Library_Management_System.Models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private int pages;

    @Column
    private String publisherName;

    @Column(nullable = false)
    private String genre;

    @Column(nullable = false)
    private boolean availability;

    @JsonBackReference
    @ManyToOne
    @JoinColumn
    private Author author;

    @JsonBackReference
    @ManyToOne
    @JoinColumn
    private Card card;

    @JsonManagedReference
    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
    private List<Transaction> transactions = new ArrayList<>();
}
