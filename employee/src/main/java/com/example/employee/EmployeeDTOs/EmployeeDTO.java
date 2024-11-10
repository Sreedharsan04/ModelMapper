package com.example.employee.EmployeeDTOs;

import java.util.List;

public class EmployeeDTO {

    private Integer employeeId;
    private String employeeName;
    private List<EmployeeDetailsDTO> employeeDetails;

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public List<EmployeeDetailsDTO> getEmployeeDetails() {
        return employeeDetails;
    }

    public void setEmployeeDetails(List<EmployeeDetailsDTO> employeeDetails) {
        this.employeeDetails = employeeDetails;
    }
}
