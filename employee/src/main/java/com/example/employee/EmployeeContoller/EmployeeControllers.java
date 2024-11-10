package com.example.employee.EmployeeContoller;

import com.example.employee.EmployeeDTOs.EmployeeDTO;
import com.example.employee.EmployeeService.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class EmployeeControllers {

    @Autowired
    private EmployeeServices employeeServices;

    @PostMapping("CreateEmployee")
    public ResponseEntity<EmployeeDTO> createEmployee(@RequestBody EmployeeDTO employeeDTO) {
//        EmployeeDTO employee = employeeServices.createEmployee(employeeDTO);
        return ResponseEntity.ok(employeeServices.createEmployee(employeeDTO));
    }

    @GetMapping("Employeeby?{id}")
    public ResponseEntity<EmployeeDTO> getEmployee(@PathVariable int id) {
        return ResponseEntity.ok(employeeServices.getEmployeeById(id));
    }

    @GetMapping("AllEmployees")
    public ResponseEntity<List<EmployeeDTO>> getAllEmployees() {
//        List<EmployeeDTO> employeeDTOs=employeeServices.getAllEmployees();
        return ResponseEntity.ok(employeeServices.getAllEmployees());
    }

    @DeleteMapping("RemoveEmployee/{id}")
    public ResponseEntity<String> removeEmployee(@PathVariable int id) {
        return ResponseEntity.ok(employeeServices.deleteEmployee(id));
    }

}
