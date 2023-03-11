package com.ems.emploee.services;

import com.ems.emploee.Repository.registeredemployeerepository;
import com.ems.emploee.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisteredEmployeeService {

 @Autowired
 private registeredemployeerepository registeremployeeRepo;
 public void addEmployee(Employee employee){
registeremployeeRepo.save(employee);

 }
 public void updateEmployee(Employee employee){
  registeremployeeRepo.save(employee);

 }

 public void deleteEmployee(int empl_id){
  registeremployeeRepo.deleteById(empl_id);
 }

}
