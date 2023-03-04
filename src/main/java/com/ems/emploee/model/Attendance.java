package com.ems.emploee.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="attendance")
public class Attendance {
    @Id
    @Column private String atten_id;
    @Column private int empl_present;
    @Column private int emply_abscent;
    @Column private float atte_count;
    @ManyToOne @JoinColumn (name="empl_id")
    private Employee employ;


}
