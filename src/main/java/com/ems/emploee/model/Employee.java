package com.ems.emploee.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Entity
@Data
@Table(name = "employee")
public class Employee {
    @Id @Column private String empl_id;
    @Column private String first_name;
    @Column private String last_name;
    @Column private String gender;
    @Column private int age;
    @Column private String designation;
    @ManyToOne @JoinColumn (name="depart_id")
    private Jobdepartment depart;
    @OneToMany @JoinColumn (name="atten_id")
    private List<Attendance>attendanceList;

}
