package com.demo.example.Student_Library_Management_System.Controller;

import com.demo.example.Student_Library_Management_System.Models.Student;
import com.demo.example.Student_Library_Management_System.RequestDTOs.StudentRequestDTO;
import com.demo.example.Student_Library_Management_System.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/find/{id}")
    public Student findStudentById(@PathVariable int id){
        Student student = studentService.getStudentById(id);
        return student;
    }

    @GetMapping("/findAll")
    public List<Student> findAllStudent(){
       List<Student> studentList =  studentService.getAllStudents();
       return studentList;
    }
}
