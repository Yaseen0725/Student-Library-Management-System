package com.demo.example.Student_Library_Management_System.Converters;

import com.demo.example.Student_Library_Management_System.Models.Book;
import com.demo.example.Student_Library_Management_System.RequestDTOs.BookRequestDTO;

public class BookConverter {
    public static Book convertBookRequestDtoToBook(BookRequestDTO bookRequestDTO){
        Book  book = new Book();
        book.setTitle(bookRequestDTO.getTitle());
        book.setPages(bookRequestDTO.getPages());
        book.setPublisherName(bookRequestDTO.getPublisherName());
        book.setGenre(bookRequestDTO.getGenre());
        book.setAvailability(bookRequestDTO.isAvailability());
        return book;
    }
}
