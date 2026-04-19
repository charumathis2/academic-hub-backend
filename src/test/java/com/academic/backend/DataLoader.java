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

            repo.save(new Student("Arun Kumar","arun@gmail.com","pass123","CSE"));
            repo.save(new Student("Priya Sharma","priya@gmail.com","pass123","IT"));
            repo.save(new Student("Rahul Singh","rahul@gmail.com","pass123","ECE"));
            repo.save(new Student("Sneha Patel","sneha@gmail.com","pass123","CSE"));
            repo.save(new Student("Karthik Raja","karthik@gmail.com","pass123","MECH"));
            repo.save(new Student("Divya Menon","divya@gmail.com","pass123","IT"));
            repo.save(new Student("Vikram Nair","vikram@gmail.com","pass123","CSE"));
            repo.save(new Student("Ananya Reddy","ananya@gmail.com","pass123","ECE"));
            repo.save(new Student("Suresh Babu","suresh@gmail.com","pass123","CSE"));
            repo.save(new Student("Kavya Krishnan","kavya@gmail.com","pass123","IT"));
            repo.save(new Student("Arjun Das","arjun2@gmail.com","pass123","CSE"));
            repo.save(new Student("Meena Iyer","meena@gmail.com","pass123","ECE"));
            repo.save(new Student("Rajesh Verma","rajesh@gmail.com","pass123","CIVIL"));
            repo.save(new Student("Pooja Gupta","pooja@gmail.com","pass123","CSE"));
            repo.save(new Student("Sanjay Kumar","sanjay@gmail.com","pass123","MECH"));
            repo.save(new Student("Lakshmi Devi","lakshmi@gmail.com","pass123","IT"));
            repo.save(new Student("Manoj Pillai","manoj@gmail.com","pass123","CSE"));
            repo.save(new Student("Deepa Nair","deepa@gmail.com","pass123","ECE"));
            repo.save(new Student("Ravi Shankar","ravi@gmail.com","pass123","CSE"));
            repo.save(new Student("Geetha Raj","geetha@gmail.com","pass123","IT"));
            repo.save(new Student("Naveen Kumar","naveen@gmail.com","pass123","CSE"));
            repo.save(new Student("Sowmya Sree","sowmya@gmail.com","pass123","ECE"));
            repo.save(new Student("Harish Babu","harish@gmail.com","pass123","CSE"));
            repo.save(new Student("Lavanya Raj","lavanya@gmail.com","pass123","IT"));
            repo.save(new Student("Prasad Rao","prasad@gmail.com","pass123","CIVIL"));
            repo.save(new Student("Sindhu Priya","sindhu@gmail.com","pass123","CSE"));
            repo.save(new Student("Ganesh Kumar","ganesh@gmail.com","pass123","ECE"));
            repo.save(new Student("Revathi Devi","revathi@gmail.com","pass123","CSE"));
            repo.save(new Student("Balaji Raman","balaji@gmail.com","pass123","MECH"));
            repo.save(new Student("Nithya Sri","nithya@gmail.com","pass123","IT"));

        };
    }
}