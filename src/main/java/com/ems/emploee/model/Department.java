package com.ems.emploee.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int depart_id;
    @Column private String depart_name;
    @Column private String description;
    @Column private double salary_range;
    @OneToMany
    private List<Employee>employ_list;
    


}
