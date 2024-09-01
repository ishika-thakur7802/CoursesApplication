package com.ishika.courses.services;

import com.ishika.courses.entities.Courses;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface CoursesService {
    List<Courses> getCourses();

    Courses saveCourse(Courses course);

    Courses getCourse(long id);

    void deleteCourse(long id);


}
