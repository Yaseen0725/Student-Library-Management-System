package com.demo.example.Student_Library_Management_System.RequestDTOs;

import lombok.Data;

@Data

public class AuthorRequestDTO {
    private String name;
    private String  country;
    private String email;
    private Double rating;
}
