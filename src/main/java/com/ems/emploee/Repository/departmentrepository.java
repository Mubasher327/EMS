package com.ems.emploee.Repository;

import com.ems.emploee.model.Department;
import org.springframework.data.repository.CrudRepository;

public interface departmentrepository extends CrudRepository<Department,Integer> {
}
