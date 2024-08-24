package com.ishika.courses.controllers;

import com.ishika.courses.entities.Courses;
import com.ishika.courses.services.CoursesService;
import org.hibernate.dialect.MySQLDialect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CoursesService coursesService;
    @GetMapping("/home")
    public String home() {
        return "This is a Course Application. Welcome!";
    }

    @GetMapping("/api/courses")
    public List<Courses> getCourses()
    {
        return this.coursesService.getCourses();
    }
    
    @GetMapping("/api/courses/{ccid}")
    public Courses getCourse(@PathVariable String ccid)
    {
        return this.coursesService.getCourse(Long.parseLong(ccid));
    }
}
