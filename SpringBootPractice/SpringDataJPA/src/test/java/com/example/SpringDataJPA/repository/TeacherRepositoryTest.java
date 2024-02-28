package com.example.SpringDataJPA.repository;

import com.example.SpringDataJPA.entity.Course;
import com.example.SpringDataJPA.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TeacherRepositoryTest {

    @Autowired
    private TeacherRepository teacherRepository;

    @Test
    public void saveTeacher(){

        Course course1 = Course.builder()
                .title("MAD")
                .credit(5)
                .build();

        Course course2 = Course.builder()
                .title("Web")
                .credit(6)
                .build();

        Teacher teacher = Teacher.builder()
                .firstName("Nisar")
                .lastName("Ahmed")
               // .courses(List.of(course1,course2))
                .build();
        teacherRepository.save(teacher);
    }

}