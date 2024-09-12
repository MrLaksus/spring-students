package com.example.springstudents.controller;

import com.example.springstudents.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;
@RestController
@RequestMapping("/api/v1/students")
public class StudentController  {

    @GetMapping
    public List<Student> findAllStudent() {
        return List.of(
                Student.builder()
                        .firstName("Нұрдәулет")
                        .lastName("Атажанов")
                        .dob(LocalDate.of(2005, 2, 28))
                        .email("fvfv@gmail.com")
                        .age(19)
                        .build(),
                Student.builder()
                        .firstName("Бабур")
                        .lastName("Рахиллаев")
                        .dob(LocalDate.of(2004, 12, 15))
                        .email("ggbf@gmail.com")
                        .age(19)
                        .build(),
                Student.builder()
                        .firstName("Нұрмухаммед")
                        .lastName("Батырхан")
                        .dob(LocalDate.of(2005, 4, 26))
                        .email("ghbn@gmail.com")
                        .age(19)
                        .build()
        );
    }
}
