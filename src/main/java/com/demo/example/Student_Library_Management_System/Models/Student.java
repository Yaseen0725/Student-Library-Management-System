package com.demo.example.Student_Library_Management_System.Models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, unique = true)
    private String mob;

    @Column(nullable = true)
    private String dob;

    @Column(nullable = true)
    private String gender;

    @Column(nullable = false)
    private String dept;

    @JsonManagedReference
    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
    private Card card;


//    mappedBy = @JsonManagedReference
//    JoinColumn = @JsonBackReference
}
