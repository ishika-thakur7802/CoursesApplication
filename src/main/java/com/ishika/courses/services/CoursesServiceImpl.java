package com.ishika.courses.services;

import com.ishika.courses.entities.Courses;
import com.ishika.courses.repositories.CoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CoursesServiceImpl implements CoursesService{
    @Autowired
    private CoursesRepository coursesRepository;
    @Override
    public List<Courses> getCourses() {
        return this.coursesRepository.findAll();
    }

    @Override
    public Courses saveCourse(Courses course)
    {
        return this.coursesRepository.save(course);
    }

    @Override
    public Courses getCourse(long id) {
        Optional<Courses> course = this.coursesRepository.findById(id);
        if(course.isPresent())
            return course.get();
        throw new RuntimeException("Course ID not found");
    }

    @Override
    public void deleteCourse(long id) {
        coursesRepository.deleteById(id);
    }


}
