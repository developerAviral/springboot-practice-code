package com.wipro.assignment4.repository;


import com.wipro.assignment4.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>  {
}
