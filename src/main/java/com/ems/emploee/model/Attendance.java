package com.ems.emploee.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="attendance")
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column private int atten_id;
    @Column private int empl_present;
    @Column private int time_in;
    @Column private int time_out;
    @Column private int empl_abscent;

    @ManyToOne @JoinColumn (name="empl_id")
    private Employee employ;


}
