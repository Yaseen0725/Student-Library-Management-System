package com.demo.example.Student_Library_Management_System.RequestDTO;

import com.demo.example.Student_Library_Management_System.Models.Author;
import com.demo.example.Student_Library_Management_System.Models.Card;
import lombok.Data;

@Data

public class BookRequestDTO {
    private String title;
    private int pages;
    private String publisherName;
    private String genre;
    private boolean availability;
    private Author author;
    private Card card;
}
