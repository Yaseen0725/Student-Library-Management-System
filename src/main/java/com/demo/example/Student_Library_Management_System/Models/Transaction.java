package com.demo.example.Student_Library_Management_System.Models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column(nullable = false)
    private String transactionStatus;

    @Column(nullable = false)
    private LocalDate transactionDate;

    @Column(nullable = false)
    private LocalDate dueDate;

    @Column
    private double fine;

    @Column(nullable = false)
    private String issuedOrReturn;

    @JsonBackReference
    @ManyToOne
    @JoinColumn
    private Card card;

    @JsonBackReference
    @ManyToOne
    @JoinColumn
    private Book book;
}
