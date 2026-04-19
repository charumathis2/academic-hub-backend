package com.academic.backend.controller;

import com.academic.backend.model.Student;
import com.academic.backend.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@CrossOrigin("*")
public class StudentController {

    @Autowired
    private StudentRepository repo;

    @GetMapping
    public List<Student> getAllStudents() {
        return repo.findAll();
    }
}