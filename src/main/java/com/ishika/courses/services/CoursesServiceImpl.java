package com.ishika.courses.services;

import com.ishika.courses.entities.Courses;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoursesServiceImpl implements CoursesService{
    @Override
    public List<Courses> getCourses() {
        return List.of();
    }

    @Override
    public Courses getCourse(Long courseID) {
        return null;
    }

    @Override
    public Courses getCourse(long courseID){
        return null;
    }


}
