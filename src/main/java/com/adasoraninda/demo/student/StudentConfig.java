package com.adasoraninda.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student adasoraninda = new Student("adasoraninda", "adasoraninda@gmail.com", LocalDate.of(2000, Month.JANUARY, 21));
       
            Student alex = new Student("alex", "alex@gmail.com", LocalDate.of(2002, Month.JANUARY, 21));
            
            repository.saveAll(List.of(adasoraninda, alex));
        };
    }

}