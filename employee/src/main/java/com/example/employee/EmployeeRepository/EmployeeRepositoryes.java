package com.example.employee.EmployeeRepository;

import com.example.employee.EmployeeModel.EmployeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepositoryes extends JpaRepository<EmployeEntity,Integer> {
}
