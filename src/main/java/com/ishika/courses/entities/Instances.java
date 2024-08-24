package com.ishika.courses.entities;

import jakarta.persistence.*;

@Entity
public class Instances {
    @Id
    private long courseID;

    @Column
    private int sem;

    @Column
    private int year;

    @ManyToOne
    private Courses course;

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getSem() {
        return sem;
    }
    public void setSem(int sem) {
        this.sem = sem;
    }
    public long getCourseID(){
        return courseID;
    }
    public void setCourseID(long courseID){
        this.courseID = courseID;
    }


}
