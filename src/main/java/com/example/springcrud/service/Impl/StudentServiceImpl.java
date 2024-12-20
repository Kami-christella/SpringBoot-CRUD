package com.example.springcrud.service.Impl;

import com.example.springcrud.model.Student;
import com.example.springcrud.repository.StudentRepository;
import com.example.springcrud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student create(Student student) {
        return studentRepository.save(student);
    }
    //all students display
    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
