package com.ishika.courses.entities;
import jakarta.persistence.*;


import java.util.ArrayList;
import java.util.List;

@Entity
public class Courses {
    @Id
    private String ccode;

    @Column
    private String ctitle;

    @Column
    private String cdesc;



    public Courses(String ctitle, String ccode, String cdesc) {
        this.ctitle = ctitle;
        this.ccode = ccode;
        this.cdesc = cdesc;
    }

    public Courses() {

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
