package com.ishika.courses.controllers;

import com.ishika.courses.entities.Courses;
import com.ishika.courses.repositories.CoursesRepository;
import com.ishika.courses.services.CoursesService;
import org.hibernate.dialect.MySQLDialect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CoursesService coursesService;
    @Autowired
    private CoursesRepository coursesRepository;

    @GetMapping("/home")
    public String home() {
        return "This is a Course Application. Welcome!";
    }



    @GetMapping("/api/courses")
    public List<Courses> getCourses()
    {
        return this.coursesService.getCourses();
    }





}
