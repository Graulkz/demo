package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.DECEMBER;
import static java.time.Month.MAY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student adil = new Student(
              "Adil",
              "graulkz80@gmail.com",
              LocalDate.of(2001, DECEMBER,7)
            );

            Student joni = new Student(
                    "Joni",
                    "joni@gmail.com",
                    LocalDate.of(2002,MAY,10)
            );

            repository.saveAll(
                    List.of(adil,joni)
            );
        };
    }
}
