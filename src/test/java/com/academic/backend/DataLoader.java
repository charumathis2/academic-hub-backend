package com.academic.backend;

import com.academic.backend.model.Student;
import com.academic.backend.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.boot.CommandLineRunner;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private StudentRepository repo;

    @Override
    public void run(String... args) {

        System.out.println("🔥 DATA LOADER RUNNING");

        repo.deleteAll();

        repo.save(new Student("Arun Kumar","arun@gmail.com","pass123","CSE"));
        repo.save(new Student("Priya Sharma","priya@gmail.com","pass123","CSE"));
        repo.save(new Student("Rahul Singh","rahul@gmail.com","pass123","CSE"));
    }
}