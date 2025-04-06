package com.demo.example.Student_Library_Management_System.Models;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "card")
public class Card {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private Date createDate;
    @UpdateTimestamp
    @Column(nullable = false)
    private Date updateDate;
    @Column(nullable = false)
    private String cardStatus;

    @OneToOne
    @JoinColumn
    private Student student;

    @OneToMany(mappedBy = "card", cascade = CascadeType.ALL)
    private List<Book> bookIssuedToCards = new ArrayList<>();

    @OneToMany(mappedBy = "card", cascade = CascadeType.ALL)
    private List<Transaction> transactionIssuedToCard = new ArrayList<>();
}
