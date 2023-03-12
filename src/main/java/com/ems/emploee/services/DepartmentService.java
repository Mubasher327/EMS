package com.ems.emploee.services;

import com.ems.emploee.Repository.departmentrepository;
import com.ems.emploee.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    @Autowired
    private departmentrepository jobdepartmentRepo;

    public void addDepartment(Department department) {
        jobdepartmentRepo.save(department);
    }
}
