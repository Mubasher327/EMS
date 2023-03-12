package com.ems.emploee.services;

import com.ems.emploee.Repository.attendancerepository;
import com.ems.emploee.model.Attendance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttendanceService {
    @Autowired
    private attendancerepository attendanceRepo;


    public void addattendance(Attendance attendance){
        attendanceRepo.save(attendance);
    }
    public String deleteAttendance(int atten_id) {
        attendanceRepo.deleteById(atten_id);
        return "deleted";
    }

}
