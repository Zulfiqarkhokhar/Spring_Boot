package com.example.SpringDataJPA.repository;

import com.example.SpringDataJPA.entity.Course;
import com.example.SpringDataJPA.entity.Student;
import com.example.SpringDataJPA.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseRepositoryTest {

    @Autowired
    private CourseRepository courseRepository;

    @Test
    public void printAllCourse(){
        List<Course> courseList = courseRepository.findAll();
        System.out.println("Course:" + courseList);
    }

    @Test
    public void saveCourse(){

        Teacher teacher = Teacher.builder()
                .firstName("Faheem")
                .lastName("Rajpoot")
                .build();

        Course course = Course.builder()
                .title("Java")
                .credit(3)
                .teacher(teacher)
                .build();

        courseRepository.save(course);
    }

    @Test
    public void saveCourseWithStudentAndTeacher(){

        Teacher teacher = Teacher.builder()
                .firstName("Ghulam Murataz")
                .lastName("Memon")
                .build();

        Student student = Student.builder()
                .firstName("Yasir")
                .lastName("Ali")
                .emailId("yasir@gmail.com")
                .build();

        Course course = Course.builder()
                .title("AI")
                .credit(5)
                .teacher(teacher)
                .build();

        course.addStudent(student);

        courseRepository.save(course);
    }
}