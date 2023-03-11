package com.ems.emploee.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="attendance")
public class Attendance {
    @Id
    @Column private int atten_id;
    @Column private int empl_present;
    @Column private float time_in;
    @Column private float time_out;
    @Column private int empl_abscent;

    @ManyToOne @JoinColumn (name="empl_id")
    private Employee employ;


}
