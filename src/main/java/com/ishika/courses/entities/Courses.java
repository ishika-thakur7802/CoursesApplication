package com.ishika.courses.entities;
import jakarta.persistence.*;

@Entity
public class Courses {
    @Id
    private String ccode;

    @Column
    private String ctitle;

    @Column
    private String cdesc;

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
}
