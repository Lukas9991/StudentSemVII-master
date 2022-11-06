package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner (StudentRepository repository)
    {
        return args -> {
            Student Adam = new Student("Adam","adam@gmail.com", LocalDate.of(2000, Month.MARCH,5));
            Student Jan = new Student("Jan","jan@gmail.com,", LocalDate.of(1999,Month.JANUARY,10) );

            repository.saveAll(List.of(Adam,Jan));
        };

    }
}
