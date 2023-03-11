package com.ems.emploee.Repository;

import com.ems.emploee.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface registeredemployeerepository extends CrudRepository<Employee,Integer> {
    }

