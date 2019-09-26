package com.wipro.assignment5.config;

import com.wipro.assignment5.entity.Employee;
import com.wipro.assignment5.repository.EmployeeRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class EmployeeConfig {

    @Bean
    public Employee employee(){
        return new Employee();
    }

    @Bean
    public EmployeeRepository employeeRepository(){
        return new EmployeeRepository();
    }

    @Bean
    public Map<Integer, Employee> employeeRepositoryMap(){
        return new HashMap<Integer, Employee>();
    }
}
