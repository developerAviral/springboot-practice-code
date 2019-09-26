package com.wipro.assignment5.service;


import com.wipro.assignment5.entity.Employee;
import com.wipro.assignment5.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public String addNewEmployee(Employee employee){
        employeeRepository.save(employee);
        return "Saved User Successfully";
    }

    public Iterable<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(int employeeId){
        return employeeRepository.findById(employeeId);
    }

    public String deleteEmployee(int employeeId){
        return employeeRepository.delete(employeeId);
    }

    public String updateEmployee(int employeeId, Employee employee){
        return employeeRepository.update(employeeId, employee);
    }

}
