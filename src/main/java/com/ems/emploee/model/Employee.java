package com.ems.emploee.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "employee")
public class Employee {
    @Id @Column private String empl_id;
    @Column private String first_name;
    @Column private String last_name;
    @Column private String gender;
    @Column private int age;

}
