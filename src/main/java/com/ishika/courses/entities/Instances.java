package com.ishika.courses.entities;

import jakarta.persistence.*;

@Entity
public class Instances {
    @Id
    private long id;

    @Column
    private int sem;

    @Column
    private int year;

    @ManyToOne
    @JoinColumn(name = "courseID")
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
    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id = id;
    }


}
