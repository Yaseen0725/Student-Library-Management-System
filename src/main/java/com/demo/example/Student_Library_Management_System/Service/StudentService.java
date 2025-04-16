package com.demo.example.Student_Library_Management_System.Service;

import com.demo.example.Student_Library_Management_System.Converters.StudentConverter;
import com.demo.example.Student_Library_Management_System.Models.Card;
import com.demo.example.Student_Library_Management_System.Models.Student;
import com.demo.example.Student_Library_Management_System.Repository.StudentRepository;
import com.demo.example.Student_Library_Management_System.RequestDTOs.StudentRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Student getStudentById(int id){
        Optional<Student> studentOptional =  studentRepository.findById(id);
        return studentOptional.get();
    }

    public List<Student> getAllStudents(){
        List<Student> studentList = studentRepository.findAll();
        return studentList;
    }

    public String countStudents(){
        long count = studentRepository.count();
        return "Total number of students present are : " + count;
    }
}
