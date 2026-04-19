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

            System.out.println("🔥 DATA LOADER RUNNING"); // CHECK THIS IN LOGS

            repo.deleteAll();

            repo.save(new Student("Arun Kumar","arun@gmail.com","pass123","CSE"));
            repo.save(new Student("Priya Sharma","priya@gmail.com","pass123","CSE"));
            repo.save(new Student("Rahul Singh","rahul@gmail.com","pass123","CSE"));
        };
    }
}