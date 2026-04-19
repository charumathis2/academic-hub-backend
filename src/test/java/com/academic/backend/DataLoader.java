package com.academic.backend;

import com.academic.backend.model.Student;
import com.academic.backend.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {

    @Bean
CommandLineRunner loadData(StudentRepository repo) {
    return args -> {

        repo.deleteAll(); // 🔥 force reset

        repo.save(new Student("Arun Kumar","arun@gmail.com","pass123","CSE"));
        repo.save(new Student("Priya Sharma","priya@gmail.com","pass123","CSE"));
        repo.save(new Student("Rahul Singh","rahul@gmail.com","pass123","CSE"));
        repo.save(new Student("Sneha Patel","sneha@gmail.com","pass123","CSE"));
        repo.save(new Student("Karthik Raja","karthik@gmail.com","pass123","CSE"));
        repo.save(new Student("Divya Menon","divya@gmail.com","pass123","CSE"));
        repo.save(new Student("Vikram Nair","vikram@gmail.com","pass123","CSE"));
        repo.save(new Student("Ananya Reddy","ananya@gmail.com","pass123","CSE"));
        repo.save(new Student("Suresh Babu","suresh@gmail.com","pass123","CSE"));
        repo.save(new Student("Kavya Krishnan","kavya@gmail.com","pass123","CSE"));
    };
}
}