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

    @PostMapping("/quick-add")
    public String quickAdd() {

        repo.save(new Student("Charumathi S","charumathis2006@gmail.com","pass123","AIDS"));
        repo.save(new Student("Arun Kumar","arun@gmail.com","pass123","CSE"));
        repo.save(new Student("Priya Sharma","priya@gmail.com","pass123","CSE"));

        return "Inserted";
    }
}