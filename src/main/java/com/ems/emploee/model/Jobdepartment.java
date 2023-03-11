package com.ems.emploee.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "jobdepartment")
public class Jobdepartment {

    @Id @Column
    private String depart_id;
    @Column private String depart_name;
    @Column private String description;
    @Column private float salary_range;
    @OneToMany
    private List<Employee>employ_list;


}
