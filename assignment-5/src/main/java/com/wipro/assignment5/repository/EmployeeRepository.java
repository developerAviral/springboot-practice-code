package com.wipro.assignment5.repository;


import com.wipro.assignment5.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Map;

public class EmployeeRepository {

    @Autowired
    Map<Integer, Employee> employeeRepositoryMap;

    public String save(Employee employee){
        employeeRepositoryMap.put(employee.employeeId,employee);
        return "Saved Successfully!!";
    }

    public Iterable<Employee> findAll(){
        return employeeRepositoryMap.values();
    }

    public Employee findById(int employeeId){
        return employeeRepositoryMap.get(employeeId);
    }

    public String delete(int employeeId){
        employeeRepositoryMap.remove(employeeId);
        return "Deleted Successfully";
    }

    public String update(int employeeId, Employee employee){
        employeeRepositoryMap.put(employeeId, employee);
        return "Updated Successfully";
    }

}
