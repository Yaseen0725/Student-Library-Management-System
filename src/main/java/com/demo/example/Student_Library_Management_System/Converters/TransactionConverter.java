package com.demo.example.Student_Library_Management_System.Converters;

import com.demo.example.Student_Library_Management_System.Models.Transaction;
import com.demo.example.Student_Library_Management_System.RequestDTOs.TransactionRequestDTO;

public class TransactionConverter {
    public static Transaction convertTransactionRequestDtoToTransaction(TransactionRequestDTO transactionRequestDTO){
        Transaction transaction = new Transaction();
        transaction.setTransactionStatus(transactionRequestDTO.getTransactionStatus());
        transaction.setIssuedOrReturn(transactionRequestDTO.getIssuedOrReturn());
        transaction.setFine(transactionRequestDTO.getFine());
        transaction.setDueDate(transactionRequestDTO.getDueDate());
        return transaction;
    }
}
