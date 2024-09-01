package com.ishika.courses.services;

import com.ishika.courses.entities.Courses;
import com.ishika.courses.repositories.CoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoursesServiceImpl implements CoursesService{
    @Autowired
    private CoursesRepository coursesRepository;
    @Override
    public List<Courses> getCourses() {
        return this.coursesRepository.findAll();
    }

    @Override
    public Courses saveCourse(Courses courses)
    {
        return this.coursesRepository.save(courses);
    }


}
