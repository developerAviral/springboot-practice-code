package com.wipro.assignment4.service;

import com.wipro.assignment4.entity.Employee;
import com.wipro.assignment4.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Iterator;
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

    public Optional<Employee> getEmployeeById(int employeeId){
        return employeeRepository.findById(employeeId);
    }


}
