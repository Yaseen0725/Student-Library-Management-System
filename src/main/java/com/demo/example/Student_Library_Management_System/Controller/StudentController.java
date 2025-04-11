package com.demo.example.Student_Library_Management_System.Controller;

import com.demo.example.Student_Library_Management_System.RequestDTOs.StudentRequestDTO;
import com.demo.example.Student_Library_Management_System.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    private String addStudent(@RequestBody StudentRequestDTO studentRequestDTO){
        String response =  studentService.addStudent(studentRequestDTO);
        return response;
    }
}
