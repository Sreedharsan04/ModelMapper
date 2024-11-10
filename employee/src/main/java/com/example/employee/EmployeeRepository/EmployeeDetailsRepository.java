package com.example.employee.EmployeeRepository;

import com.example.employee.EmployeeModel.EmployeeDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDetailsRepository extends JpaRepository<EmployeeDetails, Integer> {
}
