package com.example.springemployeepayrollapp.model;

import com.example.springemployeepayrollapp.dto.EmployeePayrollDTO;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.List;

//@Entity
//@Table(name = "employee")
@Data
public class EmployeePayrollData {
    private int employeeId;
    private String name;
    private long salary;

    public EmployeePayrollData() {}

    public EmployeePayrollData(int empId, EmployeePayrollDTO empPayrollDTO) {
        this.employeeId = empId;
        this.name= empPayrollDTO.name;
        this.salary = empPayrollDTO.salary;
    }


}