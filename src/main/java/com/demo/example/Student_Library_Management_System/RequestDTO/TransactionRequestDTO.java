package com.demo.example.Student_Library_Management_System.RequestDTO;

import com.demo.example.Student_Library_Management_System.Models.Book;
import com.demo.example.Student_Library_Management_System.Models.Card;
import lombok.Data;

import java.time.LocalDate;

@Data
public class TransactionRequestDTO {
    private String transactionStatus;
    private LocalDate transactionDate;
    private LocalDate dueDate;
    private double fine;
    private String issuedOrReturn;
    private Card card;
    private Book book;
}
