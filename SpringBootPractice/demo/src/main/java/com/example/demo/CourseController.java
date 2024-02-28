package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> getAllCourse(){
        return Arrays.asList(
                new Course(1,"Spring","Zulfiqar Ali"),
                new Course(2,"ReactJS","Yasir Ali"),
                new Course(3,"MERN","Ameer Ali"),
                new Course(4,"C++","Talabdar")
        );
    }
}
