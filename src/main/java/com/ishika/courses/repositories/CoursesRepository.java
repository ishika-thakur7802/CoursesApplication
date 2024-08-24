package com.ishika.courses.repositories;
import com.ishika.courses.entities.Courses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursesRepository extends JpaRepository<Courses, String> {


}
