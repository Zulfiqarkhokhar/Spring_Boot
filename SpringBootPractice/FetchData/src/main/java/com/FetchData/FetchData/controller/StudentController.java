package com.FetchData.FetchData.controller;


import com.FetchData.FetchData.entity.Student;
import com.FetchData.FetchData.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:3000/")
public class StudentController {

    @Autowired
    private StudentRepo repo;

    @PostMapping("/addStudent")
    public String addStudent(@RequestBody Student student){
        repo.save(student);
        return "Student Added";
    }

    @GetMapping("/showStudent")
    public List<Student> showStudent(){
        List<Student> list = repo.findAll();
        return list;
    }

    @DeleteMapping("/student/{studentId}")
    public String deleteStudent(@PathVariable Long studentId){
        repo.deleteById(studentId);
        return "Student Deleted";
    }
}
