package com.ems.emploee.controller;

import com.ems.emploee.model.Department;
import com.ems.emploee.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Department")
public class DepartmentController {
    @Autowired
    DepartmentService jobDepartmentService;

    @PostMapping("/save")
    public void addJobdepartment(@RequestBody Department department)
    {
        jobDepartmentService.addDepartment(department);
    }

}
