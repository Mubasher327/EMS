package com.ems.emploee.controller;

import com.ems.emploee.model.Employee;
import com.ems.emploee.services.RegisteredEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Employee")
public class RegisterEmployeeController {
    @Autowired
    RegisteredEmployeeService registeredEmployeeServices;
    @PostMapping("/save")
    public void addEmployee(@RequestBody Employee employee)
    {
        registeredEmployeeServices.addEmployee(employee);
    }
@PutMapping("/update")
    public void updateEmployee(@RequestBody Employee employee)
{
        registeredEmployeeServices.updateEmployee(employee);
    }
@DeleteMapping("/delete/{empl_id}")
    public void deleteEmployee(@RequestParam("empl_id") int empl_id){
        registeredEmployeeServices.deleteEmployee(empl_id);
}

}
