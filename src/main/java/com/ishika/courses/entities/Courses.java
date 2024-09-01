package com.ishika.courses.entities;
import jakarta.persistence.*;


import java.util.ArrayList;
import java.util.List;

@Entity
public class Courses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String ccode;

    @Column
    private String ctitle;

    @Column
    private String cdesc;

    public Courses() {

    }


    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id=id;
    }
    public String getCcode()
    {
        return ccode;
    }

    public void setCcode(String ccode) {
        this.ccode = ccode;
    }

    public String getCtitle() {
        return ctitle;
    }

    public void setCtitle(String ctitle) {
        this.ctitle = ctitle;
    }

    public String getCdesc() {
        return cdesc;
    }

    public void setCdesc(String cdesc) {
        this.cdesc = cdesc;
    }
}
