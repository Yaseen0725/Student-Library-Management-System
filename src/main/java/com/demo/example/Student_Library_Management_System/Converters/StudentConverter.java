package com.demo.example.Student_Library_Management_System.Converters;

import com.demo.example.Student_Library_Management_System.Models.Student;
import com.demo.example.Student_Library_Management_System.RequestDTOs.StudentRequestDTO;

public class StudentConverter {
    public static Student convertStudentRequestDtoToStudent(StudentRequestDTO studentRequestDTO){
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
