package com.example.springcrud.service;


import com.example.springcrud.model.Student;

import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface StudentService {
    public Student create(Student student);
//    Student create(Student student);
    //to list all students in database
    List<Student> getAllStudents();
}
