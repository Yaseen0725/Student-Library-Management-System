package com.demo.example.Student_Library_Management_System.Service;

import com.demo.example.Student_Library_Management_System.Converters.StudentConverter;
import com.demo.example.Student_Library_Management_System.Models.Card;
import com.demo.example.Student_Library_Management_System.Models.Student;
import com.demo.example.Student_Library_Management_System.Repository.StudentRepository;
import com.demo.example.Student_Library_Management_System.RequestDTOs.StudentRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
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

    public String deleteStudentById(int id){
        studentRepository.deleteById(id);
        return "Student with id " + id + " got deleted";
    }

    public String updateStudent(int id, StudentRequestDTO studentRequestDTO){
        Student student = getStudentById(id);
        if(student != null) {
            student.setName(studentRequestDTO.getName());
            student.setGender(studentRequestDTO.getGender());
            student.setEmail(studentRequestDTO.getEmail());
            student.setDob(studentRequestDTO.getDob());
            student.setDept(studentRequestDTO.getDept());
            student.setMob(studentRequestDTO.getMob());
            studentRepository.save(student);
            return "Student updated successfully";
        }else{
            return "Student cannot be updated";
        }
    }

    public List<Student> getStudentsBasedOnPage(int pageNo, int pageSize){
        Page<Student> studentPage = studentRepository.findAll(PageRequest.of(pageNo, pageSize, Sort.by("name").ascending()));
        List<Student> studentList = studentPage.getContent();
        return studentList;
    }

    public Student getStudentByEmail(String email){
        Student student = studentRepository.findByEmail(email);
        return student;
    }
}
