package com.ems.emploee.model;

import com.fasterxml.jackson.databind.DatabindException;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import javax.xml.crypto.Data;
import java.util.Date;


public class payroll {
    private String pay_id;
    private Date date;
    private String report;
    private float amount;

}
