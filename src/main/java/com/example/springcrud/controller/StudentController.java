package com.example.springcrud.controller;

import com.example.springcrud.model.Student;
import com.example.springcrud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/student")
    public String index(){
        return "Hello World";
    }
   @PostMapping("/store")
    public Student savestudent(@RequestBody Student student){
       return studentService.create(student);
    }
//    to display students in database
@GetMapping("/all")
public List<Student> getAllStudents() {
    List<Student> students = studentService.getAllStudents();
    for (Student student : students) {
        System.out.println("Student ID: " + student.getId());
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Email: " + student.getEmail());
        System.out.println("Student Roll No: " + student.getRollno());
        System.out.println("---------------------");
    }
    return students;
}
}
