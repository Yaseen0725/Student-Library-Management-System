package com.demo.example.Student_Library_Management_System.Converters;

import com.demo.example.Student_Library_Management_System.Models.Author;
import com.demo.example.Student_Library_Management_System.RequestDTOs.AuthorRequestDTO;

public class AuthorConverter {
    public static Author convertAuthorRequestDtoToAuthor(AuthorRequestDTO authorRequestDTO){
        Author  author = new Author();
        author.setName(authorRequestDTO.getName());
        author.setCountry(authorRequestDTO.getCountry());
        author.setEmail(authorRequestDTO.getEmail());
        author.setRating(authorRequestDTO.getRating());
        return author;
    }
}
