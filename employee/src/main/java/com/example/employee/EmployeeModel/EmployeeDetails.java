package com.example.employee.EmployeeModel;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EmployeeDetails {

    @Id
    private Integer id;
    private String employeePhone;
    private String employeeAddress;

    @ManyToOne
    @JoinColumn(name = "emloyee_id")
    private EmployeEntity EmployeeEntity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public EmployeEntity getEmployeeEntity() {
        return EmployeeEntity;
    }

    public void setEmployeeEntity(EmployeEntity employeeEntity) {
        EmployeeEntity = employeeEntity;
    }
}
