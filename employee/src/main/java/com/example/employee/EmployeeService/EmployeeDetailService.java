package com.example.employee.EmployeeService;

import com.example.employee.EmployeeDTOs.EmployeeDTO;

import java.util.List;

public interface EmployeeDetailService {
//    CategoryDTO createCategory(CategoryDTO categoryDTO);
//    CategoryDTO getCategoryById(Long id);
//    List<CategoryDTO> getAllCategories();
//    void deleteCategory(Long id);
//
    EmployeeDTO createEmployee(EmployeeDTO employeeDTO);
    EmployeeDTO getEmployeeById(Integer id);
    List<EmployeeDTO> getAllEmployees();
    String deleteEmployee(Integer id);
}
