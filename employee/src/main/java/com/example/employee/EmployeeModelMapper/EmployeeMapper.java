package com.example.employee.EmployeeModelMapper;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeMapper {

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

}
