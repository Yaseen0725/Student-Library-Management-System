package com.demo.example.Student_Library_Management_System.Converter;

import com.demo.example.Student_Library_Management_System.Models.Student;
import com.demo.example.Student_Library_Management_System.RequestDTO.StudentRequestDTO;

public class StudentConverter {
    public static Student convertDtoToEntity(StudentRequestDTO studentRequestDTO){
        Student student = new Student();
        student.setName(studentRequestDTO.getName());
        student.setEmail(studentRequestDTO.getEmail());
        student.setMob(studentRequestDTO.getMob());
        student.setDob(studentRequestDTO.getDob());
        student.setGender(studentRequestDTO.getGender());
        student.setDept(studentRequestDTO.getDept());

        return student;
    }
}
