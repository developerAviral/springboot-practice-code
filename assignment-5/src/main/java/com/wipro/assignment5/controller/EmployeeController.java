package com.wipro.assignment5.controller;

import com.wipro.assignment5.entity.Employee;
import com.wipro.assignment5.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.Optional;

@Controller
@RequestMapping("/wipro")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @Autowired
    Employee employee;

    @GetMapping("/")
    public String getForm(Model model){
        model.addAttribute("employee", new Employee());
        return "index";
    }

    @PostMapping
    public @ResponseBody String submitUserDetails(@RequestBody Employee employee){
        employeeService.addNewEmployee(employee);
        return "Submitted User Details Succesfully";
    }

    @GetMapping("/get-all-users")
    public @ResponseBody Iterable<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/get-user-by-id")
    public @ResponseBody Employee getEmployeeById(@PathParam("employeeId") int employeeId){
        return employeeService.getEmployeeById(employeeId);
    }

    @DeleteMapping
    public @ResponseBody String deleteEmployee(@PathParam("employeeId") int employeeId){
        return employeeService.deleteEmployee(employeeId);
    }

    @PutMapping
    public @ResponseBody String updateEmployee(@RequestBody Employee employee){
        return employeeService.updateEmployee(employee.getEmployeeId(),employee);
    }
}
