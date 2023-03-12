package com.ems.emploee.controller;

import com.ems.emploee.model.Attendance;
import com.ems.emploee.services.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Attendance")
public class AttendanceController {
@Autowired
    AttendanceService attendanceService;
@PostMapping("/save")
    public void addattendance(@RequestBody Attendance attendance){
    attendanceService.addattendance(attendance);
}
@DeleteMapping("/delete/{id}")
    public String deleteAttendance(@PathVariable("id") int atten_id ){
    return attendanceService.deleteAttendance(atten_id);
}
}
