package com.ems.emploee.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.List;


@Entity
@Data
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column private int empl_id;
    @Column private String first_name;
    @Column private String last_name;
    @Column private int age;
    @Column private String designation;
    @Column private double salary;
    @ManyToOne @JoinColumn (name="depart_id")
    private Jobdepartment depart;
    @OneToMany
    private List<Attendance>attendanceList;

}
