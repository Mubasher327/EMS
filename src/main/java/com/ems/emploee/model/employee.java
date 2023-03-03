package com.ems.emploee.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Employee")
public class employee {
    @Id @Column private String empl_id;
    @Column private String firstname;
    @Column private String lasttname;
    @Column private String gender;
    @Column private int age;

}
