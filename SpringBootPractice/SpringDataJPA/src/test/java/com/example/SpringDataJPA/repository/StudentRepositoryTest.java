package com.example.SpringDataJPA.repository;

import com.example.SpringDataJPA.entity.Gaurdian;
import com.example.SpringDataJPA.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    StudentRepository studentRepository;

    @Test
    public void saveStudent(){
        Student student = Student.builder()
                .firstName("Zulfiqar")
                .lastName("Ali")
                .emailId("zulfiqarali.bscssef20@iba-suk.edu.pk")
//                .gaurdianName("Tariq")
//                .gaurdianEmail("tariq@gmail.com")
//                .gaurdianMobile("032302030203")
                  .build();
        studentRepository.save(student);
    }

    @Test
    public void saveStudentWithGaurdian(){
        Gaurdian gaurdian = Gaurdian.builder()
                .name("Tahir")
                .email("tahir@gmail.com")
                .mobile("02343030303")
                .build();

        Student student = Student.builder()
                .firstName("Sajjad")
                .lastName("Ali")
                .emailId("Sajjad@gmail.com")
                .gaurdian(gaurdian)
                .build();
        studentRepository.save(student);
    }

    @Test
    public void printAllStudent(){
        List<Student> studentList = studentRepository.findAll();
        System.out.println("StudentList"+studentList);
    }

    @Test
    public void printAllStudentByFirstName(){
        List<Student> studentList = studentRepository.findByFirstName("Zulfiqar");
        System.out.println("Student"+studentList);
    }
    @Test
    public void printAllStudentByFirstNameContaining(){
        List<Student> studentList = studentRepository.findByFirstNameContaining("S");
        System.out.println("Student"+studentList);
    }

    @Test
    public void printgetStudentByEmailId(){
        Student student = studentRepository.getStudentsByEmailId("Sajjad@gmail.com");
        System.out.println("Student"+student);
    }

    @Test
    public void printgetStudentByEmailAddressNative(){
        Student student = studentRepository.getStudentByEmailAddressNative("zulfiqarali.bscssef20@iba-suk.edu.pk");
        System.out.println("FirstName"+student);
    }

    @Test
    public void updateStudentNameByEmailIdTest(){
        studentRepository.updateStudentNameByEmailId(
                "Khokhar",
                "zulfiqarali.bscssef20@iba-suk.edu.pk"
        );
    }
}