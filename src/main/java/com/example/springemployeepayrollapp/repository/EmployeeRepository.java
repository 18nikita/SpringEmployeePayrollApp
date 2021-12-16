package com.example.springemployeepayrollapp.repository;

import com.example.springemployeepayrollapp.model.EmployeePayrollData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeePayrollData, Integer > {
}
