package com.adasoraninda.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
    
    public List<Student> getStudents(){
        return List.of(
                new Student(1L, "adasoraninda", "adasoraninda@gmail.com", LocalDate.of(2000, Month.JANUARY, 21), 21));
    
    }

}
