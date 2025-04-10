package com.demo.example.Student_Library_Management_System.Service;

import com.demo.example.Student_Library_Management_System.Converters.StudentConverter;
import com.demo.example.Student_Library_Management_System.Models.Card;
import com.demo.example.Student_Library_Management_System.Models.Student;
import com.demo.example.Student_Library_Management_System.Repository.StudentRepository;
import com.demo.example.Student_Library_Management_System.RequestDTOs.StudentRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public String addStudent(StudentRequestDTO studentRequestDTO){
        Student student = StudentConverter.convertStudentRequestDtoToStudent(studentRequestDTO);

        Card card = new Card();
        card.setCardStatus("ACTIVE");
        student.setCard(card);
        card.setStudent(student);

        studentRepository.save(student);
        return "Student added successfully";
    }
}
