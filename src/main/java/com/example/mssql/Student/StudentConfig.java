package com.example.mssql.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;



@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRespository respository){
        return args -> {
          Student hoang = new Student(
                  "Le Minh Hoang",
                  "mhoang0611@gmail.com",
                  LocalDate.of(1996,11,06)
          );
          Student phuonganh = new Student(
                  "Bui Phuong Anh",
                  "buiphuonganh@gmail.com",
                  LocalDate.of(2001,10,19)
          );

          respository.saveAll(
                  List.of(hoang, phuonganh)
          );
        };
    }
}
