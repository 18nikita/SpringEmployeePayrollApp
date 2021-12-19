package com.example.springemployeepayrollapp.services;

import com.example.springemployeepayrollapp.dto.EmployeePayrollDTO;
import com.example.springemployeepayrollapp.model.EmployeePayrollData;

import java.util.List;

public interface IEmployeePayrollService {
    List<EmployeePayrollData> getEmployeePayrollData();
    EmployeePayrollData getEmployeePayrollDataById(int empId);
    EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empPayrollDTO);
    EmployeePayrollData updateEmployeePayrollData(int empId,EmployeePayrollDTO empPayrollDTO);
    void deleteEmployeePayrollData(int empId);
}