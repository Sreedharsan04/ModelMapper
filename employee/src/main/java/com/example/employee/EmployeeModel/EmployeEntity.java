package com.example.employee.EmployeeModel;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EmployeEntity {

    @Id
    private Integer employeeId;
    private String employeeName;



    @OneToMany(mappedBy = "EmployeeEntity")
    private List<EmployeeDetails> employeeDetails;

}
