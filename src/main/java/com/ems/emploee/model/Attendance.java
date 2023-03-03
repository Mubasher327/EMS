package com.ems.emploee.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="attendance")
public class Attendance {
    @Id
    @Column private String atten_id;
    @Column private int empl_present;
    @Column private int emply_abscent;
    @Column private float atte_count;


}
