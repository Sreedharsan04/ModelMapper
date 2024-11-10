package com.example.employee.EmployeeService;

import com.example.employee.EmployeeDTOs.EmployeeDTO;
import com.example.employee.EmployeeModel.EmployeEntity;
import com.example.employee.EmployeeModelMapper.EmployeeMapper;
import com.example.employee.EmployeeRepository.EmployeeRepositoryes;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

@Service
@Transactional
public class EmployeeServices implements EmployeeDetailService  {

    @Autowired
    private EmployeeRepositoryes employeeRepositoryes;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public EmployeeDTO createEmployee(EmployeeDTO employeeDTO) {
        EmployeEntity employe=modelMapper.map(employeeDTO, EmployeEntity.class);
        if(employe.getEmployeeDetails()!= null){
            employe.getEmployeeDetails().forEach(employeeDetails -> employeeDetails.setEmployeeEntity(employe));
        }
        EmployeEntity savedEmployee=employeeRepositoryes.save(employe);
        return modelMapper.map(savedEmployee, EmployeeDTO.class);
    }


    @Override
    public EmployeeDTO getEmployeeById(Integer id) {
        EmployeEntity employe=employeeRepositoryes.findById(id).orElseThrow(()->new RuntimeException("Employee not found"));
        return modelMapper.map(employe, EmployeeDTO.class);
    }

    @Override
    public List<EmployeeDTO> getAllEmployees() {
        List<EmployeEntity> employee = employeeRepositoryes.findAll();
        return employee.stream()
                .map(allEmployees -> modelMapper.map(allEmployees, EmployeeDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public String deleteEmployee(Integer id) {
    EmployeEntity deleEmploye=employeeRepositoryes.findById(id).orElseThrow(()->new RuntimeException("Employee not found"));
    employeeRepositoryes.delete(deleEmploye);
    return "Employee deleted";
    }

}
