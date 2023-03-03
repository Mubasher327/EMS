package com.ems.emploee.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity

public class leaves {
    @Id
    private String leav_id;
    private Date date;
    private String reason;
}
